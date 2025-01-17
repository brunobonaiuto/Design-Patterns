package reciever;

import variables.PythonVariables;
import variables.Variables;

import java.util.ArrayList;
import java.util.List;

public class ASTAlgorithmForPython implements AST {

    private String script;
    private final List<String> currentInputVariables;
    private final List<String> currentOutputVariables;

    public ASTAlgorithmForPython(String script) {
        this.script = script;
        currentInputVariables = new ArrayList<>();
        currentOutputVariables = new ArrayList<>(); //or it could be Set
    }

    @Override
    public void getUndefinedVariables() {
        System.out.println("Applying rule to script \"getUndefinedVariables\"");
        script = "state 1";

        currentInputVariables.add("x1");
        currentInputVariables.add("x2");
    }

    @Override
    public void getUnusedVariables() {
        System.out.println("Applying rule to script \"getUnusedVariables\"");
        script += ", state 2";

        currentOutputVariables.add("f1");
        currentOutputVariables.add("f2");
    }


    public Variables getVariables() {
        PythonVariables variables = new PythonVariables();
        variables.setInputVariables(currentInputVariables);
        variables.setOutputVariables(currentOutputVariables);
        return variables;
    }
}
