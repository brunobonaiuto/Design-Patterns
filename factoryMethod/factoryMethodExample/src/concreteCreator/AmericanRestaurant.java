package concreteCreator;

import concreteProduct.AmericanBurger;
import concreteProduct.BurgerProduct;

public class AmericanRestaurant extends RestaurantFactory {

    @Override
    protected BurgerProduct createBurger() {
        System.out.println("Creating an American burger");
        return new AmericanBurger();
    }
}
