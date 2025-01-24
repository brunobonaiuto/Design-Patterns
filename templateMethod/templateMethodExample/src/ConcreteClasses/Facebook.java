package ConcreteClasses;

import AbstractClasses.AbstractNetwork;

/**
 * Concrete Classes can override all of the steps, but not the template method itself.
 */
public class Facebook extends AbstractNetwork {
    /**
     * No need of username and password as instance variables.
     */
    public Facebook(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected boolean logIn(String username, String password) {
        System.out.println("Logging in to Facebook with username: " + username + " and password: " + password);
        return true;
    }

    @Override
    protected boolean sendData(String message) {
        System.out.println("Message posted on Facebook: " + new String(message));
        return true;
    }

    @Override
    protected void logOut() {
        System.out.println("User has logged out from Facebook.");
    }
}
