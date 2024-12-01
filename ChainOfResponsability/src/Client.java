public class Client {
    public static void main(String[] args) {
        /* The Chain of Responsibility: Is a behavioral design pattern that lets you pass requests along a chain of handlers.
        Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
            * Use this pattern when you encounter the need to execute several handlers in a particular order.
            * Each handler must make either process the request or pass it along the chain.
        */

        //For this example, we have a request that would be pass across two handlers (ConcreteHandler and ConcreteHandler2)
        //Create all the handlers with the chain of responsibility and handle the request in one single line
        Handler handler = new ConcreteHandler();
        handler.setNextHandler(new ConcreteHandler2()); //as many handlers as I want it

        handler.handle("admin", "admin"); //request here

        //handler.handle("admin", "noAdmin"); //gets blocked at the chain
    }
}