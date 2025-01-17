package variables;

import command.UndefinedVariablesCommand;

import command.UnusedVariablesCommand;
import invoker.RuleManager;
import reciever.ASTAlgorithmForPython;

/**
 * Client
 */
public class PythonVariableExtractor implements VariablesExtractor {


    @Override
    public Variables parseScript(String script) {
        System.out.println("Scanning script....");
        //....
        ASTAlgorithmForPython algorithm = new ASTAlgorithmForPython(script);
        applyRules(algorithm);
        return algorithm.getVariables();
    }


    private void applyRules(ASTAlgorithmForPython algorithm) {
        //create invoker
        RuleManager ruleManager = new RuleManager();

        //create commands (rules)
        UndefinedVariablesCommand undefinedVariablesCommand = new UndefinedVariablesCommand(algorithm);

        //set the rule and apply
        ruleManager.setRuleCommandToAST(undefinedVariablesCommand);
        ruleManager.activateRule(); //could be one single method

        ruleManager.setRuleCommandToAST(new UnusedVariablesCommand(algorithm));
        ruleManager.activateRule();

    }
}
