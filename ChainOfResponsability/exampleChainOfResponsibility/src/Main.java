public class Main {
    public static void main(String[] args) {
        DatabaseHandler handler = new UserValidatorHandler();
        DatabaseHandler secondHandler = handler.setNextHandler(new PasswordValidatorHandler());
        secondHandler.setNextHandler(new ManagerHandler());
        //as many handlers as check we want

        handler.handle("Bruno", "admin");

    }
}