package command;

import reciever.AST;

public class UndefinedVariablesCommand implements Command {


    private final AST algorithm;

    public UndefinedVariablesCommand(AST algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public void execute() {
        algorithm.getUndefinedVariables();
    }
}
