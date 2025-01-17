package invoker;

import command.Command;

/**
 * Sender Class
 */
public class RuleManager {
    private Command command;

    public void setRuleCommandToAST(Command command) {
        this.command = command;
    }

    public void activateRule() {
        command.execute();
    }
}
