package command;

import reciever.AST;

public class UnusedVariablesCommand implements Command {


    private final AST algorithm;

    public UnusedVariablesCommand(AST algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public void execute() {
        algorithm.getUnusedVariables();
    }
}