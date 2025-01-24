import Components.DepartmentComponent;
import Components.HRDepartmentComponent;
import Components.ITDepartmentComponent;
import Mediator.DepartmentMediator;
import Mediator.OfficeMediator;

public class Main {
    public static void main(String[] args) {
        // Creating the mediator
        OfficeMediator officeMediator = new OfficeMediator();

        // Creating the components
        DepartmentComponent hrDepartmentComponent = new HRDepartmentComponent();
        DepartmentComponent itDepartmentComponent = new ITDepartmentComponent();

        // Setting the components for which i want to send the message
        // In this case, there will be a comunications between HR and IT departments
        officeMediator.setComponentHR(hrDepartmentComponent);
        officeMediator.setComponentIT(itDepartmentComponent);

        // Sending the message
        // The message will be from HR department to IT department
        hrDepartmentComponent.setMediatorOperation(officeMediator);
        hrDepartmentComponent.sendOperation("Hello, I am HR department, This message will be to the sett components.");
    }
}