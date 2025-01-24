import AbstractClasses.AbstractNetwork;
import ConcreteClasses.Facebook;
import ConcreteClasses.Twitter;

public class Main {
    public static void main(String[] args) {

        String username = "Brunito";
        String password = "A password";

        AbstractNetwork twitter = new Twitter(username, password);
        twitter.post("Hello World!");
        //or
        //new Facebook(username, password).post("Hello World!");

    }
}