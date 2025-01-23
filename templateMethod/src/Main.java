import ConcreteClasses.ConcreteClassOne;
import ConcreteClasses.ConcreteClassTwo;

public class Main {
    public static void main(String[] args) {
        /**
         * All the steps are defined in the abstract class, and the concrete classes implement them
         * The order is also defined in the abstract class, and the common steps are also defined in the abstract class
         */

        //For instance, if this was al algorithm, it would execute the steps in the order defined in the templateMethod
        ConcreteClassOne concreteClassOne = new ConcreteClassOne();
        concreteClassOne.templateMethod();
        //Or algorithm two each is similar
        ConcreteClassTwo concreteClassTwo = new ConcreteClassTwo();
        concreteClassTwo.templateMethod();

    }
}