package Mediator;


import Components.DepartmentComponent;

/**
 * The Mediator interface declares methods of communication with components, which usually include just a single notification method.
 * Components may pass any context as arguments of this method, including their own objects, but only in such a way that no coupling occurs between a receiving component and the sender’s class.
 */
public interface DepartmentMediator {
    //also called communicate method
    void notifyToComponents(DepartmentComponent sender, String event);
}