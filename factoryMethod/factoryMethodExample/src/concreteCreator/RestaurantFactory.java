package concreteCreator;

import concreteProduct.BurgerProduct;

public abstract class RestaurantFactory {

    public void orderBurger() {
        System.out.println("Ordering a burger");
        BurgerProduct burger = createBurger();
        burger.prepare();

    }

    protected abstract BurgerProduct createBurger();
}
