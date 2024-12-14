package concreteFactory;

import abstractFactory.CarAbstractFactory;
import abstractProduct.Car;
import abstractProduct.CarSpecification;
import concreteProducts.NorthAmericaSpecification;
import concreteProducts.Sedan;

/**
 * Concrete Factory: Implement the abstract factory interface “CarFactory” to create cars and specifications specific to North America
 */

// Concrete Factory for North America Cars
public class NorthAmericaCarFactory implements CarAbstractFactory {

    public Car createCar() {
        return new Sedan();
    }

    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}
