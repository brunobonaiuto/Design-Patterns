package concreteProduct;

public class VenezuelanBurger implements BurgerProduct {
    @Override
    public void prepare() {
        System.out.println("Preparing a Venezuelan burger");
    }
}
