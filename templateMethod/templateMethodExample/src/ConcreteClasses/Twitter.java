package ConcreteClasses;

import AbstractClasses.AbstractNetwork;

public class Twitter extends AbstractNetwork {
    /**
     * No need of username and password as instance variables.
     */
    public Twitter(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected boolean logIn(String username, String password) {
        System.out.println("Logging in to Twitter with username: " + username + " and password: " + password);
        return true;
    }

    @Override
    protected boolean sendData(String message) {
        System.out.println("Message posted on Twitter: " + new String(message));
        return true;
    }

    @Override
    protected void logOut() {
        System.out.println("User has logged out from Twitter.");
    }
}
