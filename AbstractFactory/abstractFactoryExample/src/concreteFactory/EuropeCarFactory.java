package concreteFactory;

import abstractFactory.CarAbstractFactory;
import abstractProduct.Car;
import abstractProduct.CarSpecification;
import concreteProducts.EuropeSpecification;
import concreteProducts.Pickup;

/**
 * Concrete Factory: Implement the abstract factory interface “CarFactory” to create cars and specifications specific to Europe
 */

// Concrete Factory for Europe Cars
public class EuropeCarFactory implements CarAbstractFactory {

    public Car createCar() {
        return new Pickup();
    }

    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}