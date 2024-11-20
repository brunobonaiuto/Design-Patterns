/**
 * Concrete Handlers contain the actual code for processing requests.
 */
public class ConcreteHandler2 extends Handler {
    /**
     * Upon receiving a request, each handler must decide whether to process it and, additionally, whether to pass it along the chain.
     */
    @Override
    public boolean handle(String username, String password) {
        // logic to check, and to decide where to pass or not to the next handler
        // If logic is approved, we return False or True and we decide to pass to next handler
        // return handleNext(parm1, parm2 ...)

        if (!logicTwo(username, password))
            return false; // block the chain of responsibility, since the handleNext won't be reached
        return handleNext(username, password);
        }

    private boolean logicTwo(String username, String password) {
        if(password.equals("admin")){
            System.out.println("Last Handler");
            return true;
        }
        return false;
    }

}
