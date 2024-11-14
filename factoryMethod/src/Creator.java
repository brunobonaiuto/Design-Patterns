public abstract class Creator {
    /*The Creator class declares the factory method that returns new product objects.
    It’s important that the return type of this method matches the product interface.

    You can declare the factory method as abstract to force all subclasses to implement their own versions of the method.
    As an alternative, the base factory method can return some default product type.
    */

    public Product getProduct(){
        Product product = createProduct();
        product.doStuff();
        return product;
    }

    abstract Product createProduct();
}
