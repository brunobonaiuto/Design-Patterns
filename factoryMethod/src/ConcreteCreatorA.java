public class ConcreteCreatorA extends Creator {

    @Override
    Product createProduct() {
        return new ConcreteProductA();
    }
}
