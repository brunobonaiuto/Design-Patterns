import variables.PythonVariableExtractor;
import variables.Variables;
import variables.VariablesExtractor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Mercury will do
        VariablesExtractor pythonVariableExtractor = new PythonVariableExtractor();
        Variables variables = pythonVariableExtractor.parseScript("Content here");
        List<String> inputVariables = variables.getInputVariables();
        List<String> outputVariables = variables.getOutputVariables();
        System.out.println(inputVariables);
        System.out.println(outputVariables);


    }
}