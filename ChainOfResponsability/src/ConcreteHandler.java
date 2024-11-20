/**
 * Concrete Handlers contain the actual code for processing requests.
 */
public class ConcreteHandler extends Handler {
    /**
     * Upon receiving a request, each handler must decide whether to process it and, additionally, whether to pass it along the chain.
     */
    @Override
    public boolean handle(String username, String password) {
        if (!logicOne(username, password))
            return false; // block the chain of responsibility, since the handleNext won't be reached
        return handleNext(username, password);
    }

    private boolean logicOne(String username, String password) {
        if(username.equals("admin")){
            System.out.println("First Handler");
            return true;
        }
        return false;
    }
}
