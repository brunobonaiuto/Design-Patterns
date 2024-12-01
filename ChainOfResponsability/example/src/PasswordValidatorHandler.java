/**
 * Concrete Handlers contain the actual code for processing requests.
 */
public class PasswordValidatorHandler extends DatabaseHandler {
    /**
     * Upon receiving a request, each handler must decide whether to process it and, additionally, whether to pass it along the chain.
     */
    @Override
    public boolean handle(String username, String password) {
        return passwordIsCorrect(password) && handleNext(username, password);
        }

    private boolean passwordIsCorrect(String password) {
        if(password.equals("admin")){
            System.out.println("Second handler, the password is correct");
            return true;
        }
        return false;
    }

}
