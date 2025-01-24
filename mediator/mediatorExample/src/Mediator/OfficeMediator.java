package Mediator;

import Components.DepartmentComponent;

/**
 * Concrete Mediators encapsulate relations between various components.
 * Concrete mediators often keep references to all components they manage and sometimes even manage their lifecycle.
 */

public class OfficeMediator implements DepartmentMediator{

    /**
     * The mediator contains a reference to all components it manages
     * If a component is not set, the mediator will not notify the component.
     */
    private DepartmentComponent hrDepartment;
    private DepartmentComponent itDepartment;

    @Override
    public void notifyToComponents(DepartmentComponent componentSender, String event) {
        if(componentSender.equals(hrDepartment) && itDepartment != null) {
            itDepartment.receiveOperation(event);
        } else if(componentSender.equals(itDepartment) && hrDepartment != null) {
            hrDepartment.receiveOperation(event);
        } else if (componentSender.equals(hrDepartment) && itDepartment == null) {
            System.out.println("The message was not sent correctly, No component has been set to send message.");
        } else if (componentSender.equals(itDepartment) && hrDepartment == null) {
            System.out.println("The message was not sent correctly. No component has been set to send message.");
        } else {
            System.out.println("The message was not sent correctly. No component has been set to send message.");
        }

    }

    public void setComponentHR(DepartmentComponent hrDepartment) {
        this.hrDepartment = hrDepartment;
    }

    public void setComponentIT(DepartmentComponent itDepartment) {
        this.itDepartment = itDepartment;
    }
}
