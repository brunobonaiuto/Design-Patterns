package AbstractClasses;

/**
 * - The Abstract Class declares methods that act as steps of an algorithm,
 *   as well as the actual template method which calls these methods in a specific order.
 * - The steps may either be declared abstract or have some default implementation.
 */
public abstract class AbstractNetwork {

    protected String username;
    protected String password;

    /**
     * ---- This is the TEMPLATE METHOD ----
     * The template method defines the skeleton of an algorithm. The Steps of an algorithm are defined in this method.
     * This is the common method that is used by all the concrete classes. Otherwise we would have to duplicate the code.
     */
    public boolean post(String message) {
        if (logIn(this.username, this.password)) {
            boolean result = sendData(message);
            getCommonMessageForAllConcreteClasses();
            logOut();
            return result;
        }
        return false;
    }

    /**
     * These are the methods containing different implementations for each concrete class.
     */
    protected abstract boolean logIn(String username, String password);
    protected abstract boolean sendData(String message);
    protected abstract void logOut();


    /**
     * These operations have some default implementation.
     */
    protected void getCommonMessageForAllConcreteClasses(){
        System.out.println("You succesfully posted without code duplication");
        //some common code for all the abstract classes
    }
}
