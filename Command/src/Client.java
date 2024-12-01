public class Client {
    public static void main(String[] args) {
    /* Command: is a behavioral design pattern that turns a request into an independent object that contains all information about the request.
    This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

    * This design patter is applicable when you have a VERY BIG number of subclasses(more than 3 idk),
     that extends a parent class and this parent class contains other objects that might be independent or not,
     So each time we modify this objects in the parent class, we risk to break the code in the subclasses

     example: A Room class that is parent and contains:
        * A single Light object
        * if we add more kind of lights to this room, we might duplicate for the second kind of light since they do the same

    * The command are a series of instructions to the objects so they become more independent of their parent class.
    */
        //First command
        Sender1 sender1 = new Sender1();
        Receiver receiver = sender1.getReceiver();
        sender1.setCommand(new ConcreteCommand(receiver));
        sender1.executeCommand();
        System.out.println(sender1.receiverOperationIsDone());

        //Second command
        Sender2 sender2 = new Sender2();
        Receiver receiver2 = sender2.getReceiver();
        sender2.setCommand(new ConcreteCommand(receiver2));
        sender2.executeCommand();
        System.out.println(sender2.receiverOperationIsDone());


    }
}