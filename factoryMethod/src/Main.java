public class Main {
    public static void main(String[] args) {
        /*
         - The factory method is applied when we have creation stuff,
            - Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
         - We replace the direct object construction calls (using new) with calls to a SPECIAl factory method.
        */

        Creator concreteCreatorA = new ConcreteCreatorA();
        Product productA = concreteCreatorA.getProduct();

        Creator concreteCreatorB = new ConcreteCreatorB();
        Product productB = concreteCreatorB.getProduct();

    }
}