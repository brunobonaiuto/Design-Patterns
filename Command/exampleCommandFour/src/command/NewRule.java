package command;

import reciever.AST;

public class NewRule implements Command{

    private final AST algorithm;

    public NewRule(AST algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public void execute() {
        algorithm.getNewRule();
    }
}
