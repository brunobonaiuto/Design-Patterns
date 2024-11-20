/**
 * The Handler declares the interface(a abstract class in this case), common for all concrete handlers.
 * It usually contains just a single method for handling requests, but sometimes it may also have another method for setting the next handler on the chain.
 */
public abstract class Handler {
    /**
     * Field for storing a reference to the next handler.
     */
    private Handler next;

    /**
     * The clients can build a chain by passing a handler to the constructor or setter of the previous handler.
     */
    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    /**
     * Abstract method to implement
     */
    public abstract boolean handle(String username, String password);

    /**
     * The class may also implement the default handling behavior: it can pass execution to the next handler after checking for its existence.
     */
    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }

}