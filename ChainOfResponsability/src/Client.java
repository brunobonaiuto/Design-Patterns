public class Client {
    public static void main(String[] args) {

        Handler handler = new ConcreteHandler();
        handler.setNextHandler(new ConcreteHandler2()); //as many handlers as I want it

        handler.handle("admin", "admin");

        //handler.handle("admin", "noAdmin"); //gets blocked at the chain
    }
}