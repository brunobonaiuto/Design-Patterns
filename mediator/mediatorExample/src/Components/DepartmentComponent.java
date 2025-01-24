package Components;

import Mediator.OfficeMediator;

/**
 * Components are various classes that contain some business logic.
 * Each component has a reference to a mediator, declared with the type of the mediator interface.
 * The component isn’t aware of the actual class of the mediator,
 * so you can reuse the component in other programs by linking it to a different mediator.
 */
public interface DepartmentComponent {

    void setMediatorOperation(OfficeMediator mediator);
    void sendOperation(String anyEvent); //also called sendMessage
    void receiveOperation(String event); //also called receiveMessage

}
