package concreteProduct;

public class AmericanBurger implements BurgerProduct {
    @Override
    public void prepare() {
        System.out.println("Preparing an American burger");
    }
}
