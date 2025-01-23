package Componets;

import mediator.Mediator;

public class ComponentB implements Component{

    private Mediator mediator;

    @Override
    public void setMediatorOperation(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendOperation(String anyEvent) {
        mediator.notify(this, anyEvent);
    }

    @Override
    public void receiveOperation() {
        System.out.println("Component B has received the message correctly.");
    }
}
