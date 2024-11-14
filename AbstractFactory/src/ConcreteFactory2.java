public class ConcreteFactory2 implements AbstractFactory {
    /*
    Concrete Factories implement creation methods of the abstract factory.
    Each concrete factory corresponds to a specific variant of products and creates only those product variants.

    Note: Although concrete factories instantiate concrete products, signatures of their creation methods must return corresponding abstract products.
    This way the client code that uses a factory doesn’t get coupled to the specific variant of the product it gets from a factory.
    The Client can work with any concrete factory/product variant, as long as it communicates with their objects via abstract interfaces.
    */

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
