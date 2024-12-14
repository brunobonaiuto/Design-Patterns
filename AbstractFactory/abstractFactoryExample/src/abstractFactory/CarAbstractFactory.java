package abstractFactory;

import abstractProduct.Car;
import abstractProduct.CarSpecification;

/**
 * The Abstract Factory interface declares a set of methods for creating each of the abstract products.
 */

public interface CarAbstractFactory {
    /**
     * The Abstract Factory interface declares a set of methods for creating each of the abstract products.
     * “CarFactory” is an Abstract Factory Interface that defines methods for creating cars and their specifications.
     */

    Car createCar();

    CarSpecification createSpecification();
}
