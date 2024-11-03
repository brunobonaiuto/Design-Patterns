public class Main {
    public static void main(String[] args) {
        Creator concreteCreatorA = new ConcreteCreatorA();
        Product productA = concreteCreatorA.getProduct();


        Creator concreteCreatorB = new ConcreteCreatorB();
        Product productB = concreteCreatorB.getProduct();
    }
}