package concreteCreator;

import concreteProduct.BurgerProduct;
import concreteProduct.VenezuelanBurger;

public class VenezuelanRestaurant extends RestaurantFactory {

    @Override
    protected BurgerProduct createBurger() {
        System.out.println("Creating a Venezuelan burger");
        return new VenezuelanBurger();
    }

}
