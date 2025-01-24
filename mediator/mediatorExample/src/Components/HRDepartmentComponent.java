package Components;

import Mediator.OfficeMediator;

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
public class HRDepartmentComponent implements DepartmentComponent {

    /**
     * The component has a reference to a mediator object.
     */
    private OfficeMediator mediator;

    @Override
    public void setMediatorOperation(OfficeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendOperation(String anyEvent) {
        // Depending on the Component, the mediator will notify the correct component. Since the mediator knows all the components, it can notify the correct one.
        mediator.notifyToComponents(this, anyEvent);
    }

    @Override
    public void receiveOperation(String event) {
        // The component tells the mediator that it has received the message.
        System.out.println("HR Department received: " + event);
    }
}
