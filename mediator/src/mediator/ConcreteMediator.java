package mediator;

import Componets.Component;

public class ConcreteMediator implements Mediator{

    private Component componentA;
    private Component componentB;
    private Component componentC;

    @Override
    public void notify(Component sender, String event) {
        if(sender.equals(componentA) && componentB != null && componentC == null) {
            componentB.receiveOperation();
        } else if(sender.equals(componentB) && componentC != null && componentA == null) {
            componentC.receiveOperation();
        } else if(sender.equals(componentC) && componentA != null && componentB == null) {
            componentA.receiveOperation();
        } else if (sender.equals(componentA) && componentB != null && componentC != null) {
            componentB.receiveOperation();
            componentC.receiveOperation();
        } else if (sender.equals(componentB) && componentA != null && componentC != null) {
            componentA.receiveOperation();
            componentC.receiveOperation();
        } else if (sender.equals(componentC) && componentA != null && componentB != null) {
            componentA.receiveOperation();
            componentB.receiveOperation();
        } else if (sender.equals(componentA) && componentB == null && componentC == null) {
            System.out.println("The message was not sent correctly.");
        } else if (sender.equals(componentB) && componentA == null && componentC == null) {
            System.out.println("The message was not sent correctly.");
        } else if (sender.equals(componentC) && componentA == null && componentB == null) {
            System.out.println("The message was not sent correctly.");
        } else {
            System.out.println("The message was not sent correctly.");
        }
    }

    public void setComponentA(Component componentA) {
        this.componentA = componentA;
    }

    public void setComponentB(Component componentB) {
        this.componentB = componentB;
    }

    public void setComponentC(Component componentC) {
        this.componentC = componentC;
    }
}
