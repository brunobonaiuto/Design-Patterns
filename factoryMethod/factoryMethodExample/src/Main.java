import concreteCreator.AmericanRestaurant;
import concreteCreator.VenezuelanRestaurant;

public class Main {
    public static void main(String[] args) {
        AmericanRestaurant americanRestaurant = new AmericanRestaurant();
        americanRestaurant.orderBurger();

        System.out.printf("--------------------\n");

        VenezuelanRestaurant venezuelanRestaurant = new VenezuelanRestaurant();
        venezuelanRestaurant.orderBurger();
    }
}