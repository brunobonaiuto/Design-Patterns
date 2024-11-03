public abstract class Creator {

    public Product getProduct(){
        Product product = createProduct();
        product.doStuff();
        return product;
    }

    abstract Product createProduct();
}
