public class Client {
    public static void main(String[] args) {

        //Factory1
        AbstractFactory concreteFactory1 = new ConcreteFactory1();
        // Product A1 (Object)
        ProductA productA1 = concreteFactory1.createProductA();
        productA1.doSomething();
        // Product B1 (Object)
        ProductB productB1 =  concreteFactory1.createProductB();
        productB1.doSomething();

        //Factory2
        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        // Product A2 (Object)
        ProductA productA2 = concreteFactory2.createProductA();
        productA2.doSomething();
        // Product B2 (Object)
        ProductB productB2 = concreteFactory2.createProductB();
        productB2.doSomething();



    }
}
