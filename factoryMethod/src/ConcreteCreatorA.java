/**
 * Concrete Creators override the base factory method so it returns a different type of product.
 * Note that the factory method doesn’t have to create new instances all the time. It can also return existing objects from a cache, an object pool,
 */
public class ConcreteCreatorA extends Creator {

    @Override
    Product createProduct() {
        return new ConcreteProductA();
    }
}
