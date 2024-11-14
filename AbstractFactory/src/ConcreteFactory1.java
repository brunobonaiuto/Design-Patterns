public class ConcreteFactory1 implements AbstractFactory {
    /*
    Concrete Factories implement creation methods of the abstract factory.
    Each concrete factory corresponds to a specific variant of products and creates only those product variants.

    Note: Although concrete factories instantiate concrete products, signatures of their creation methods must return corresponding abstract products.
    This way the client code that uses a factory doesn’t get coupled to the specific variant of the product it gets from a factory.
    The Client can work with any concrete factory/product variant, as long as it communicates with their objects via abstract interfaces.
    */
    @Override
    public ProductA createProductA() { //method from abstract interface
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() { //method from abstract interface
        return new ConcreteProductB1();
    }
}
