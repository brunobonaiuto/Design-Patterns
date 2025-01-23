import Componets.Component;
import Componets.ComponentA;
import Componets.ComponentB;
import Componets.ComponentC;
import mediator.ConcreteMediator;

public class Main {
    public static void main(String[] args) {
        // Creating the mediator
        ConcreteMediator concreteMediator = new ConcreteMediator();

        // Creating the components
        Component componentA = new ComponentA();
        Component componentB = new ComponentB();
        Component componentC = new ComponentC();

        // Setting the mediator for each component
        concreteMediator.setComponentA(componentA);
        concreteMediator.setComponentB(componentB);
        concreteMediator.setComponentC(componentC);

        // Sending the message
        componentC.setMediatorOperation(concreteMediator);

        componentC.sendOperation("Hello, I am component C.");
    }
}