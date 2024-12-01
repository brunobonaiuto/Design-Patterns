/**
 * Concrete Handlers contain the actual code for processing requests.
 */
public class UserValidatorHandler extends DatabaseHandler {
    /**
     * Upon receiving a request, each handler must decide whether to process it and, additionally, whether to pass it along the chain.
     */
    @Override
    public boolean handle(String username, String password) {
        return userNameExists(username) && handleNext(username, password);
    }

    private boolean userNameExists(String username) {
        if(username.equals("Bruno")){
            System.out.println("First Handler, the user is " + username);
            return true;
        }
        return false;
    }
}
