package Componets;

import mediator.Mediator;

/**
 * Each component has a reference to a mediator, declared with the type of the mediator interface.
 * The component isn’t aware of the actual class of the mediator, so you can reuse the component in other programs by linking it to a different mediator.
 * ----------------------------------------------
 * Components must not be aware of other components. If something important happens within or to a component, it must only notify the mediator.
 * When the mediator receives the notification, it can easily identify the sender, which might be just enough to decide what component should be triggered in return.
 * ----------------------------------------------
 * From a component’s perspective, it all looks like a total black box.
 * The sender doesn’t know who’ll end up handling its request, and the receiver doesn’t know who sent the request in the first place.
 */
public class ComponentA implements Component {

    /**
     * The component has a reference to a mediator object.
     */
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
        System.out.println("Component A has received the message correctly.");
    }
}
