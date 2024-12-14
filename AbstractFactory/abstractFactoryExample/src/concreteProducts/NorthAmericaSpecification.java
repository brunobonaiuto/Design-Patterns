package concreteProducts;

import abstractProduct.CarSpecification;

// Concrete Product for North America Car Specification
public class NorthAmericaSpecification implements CarSpecification {
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}