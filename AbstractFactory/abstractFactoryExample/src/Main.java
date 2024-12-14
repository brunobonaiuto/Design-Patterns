import abstractFactory.CarAbstractFactory;
import abstractProduct.Car;
import abstractProduct.CarSpecification;
import concreteFactory.EuropeCarFactory;
import concreteFactory.NorthAmericaCarFactory;

public class Main {
    public static void main(String[] args) {
        /**
        * Imagine you’re managing a global car manufacturing company
        * You want to design a system to create cars with specific configurations for different regions, such as North America and Europe.
        * Each region may have unique requirements and regulations, and you want to ensure that cars produced for each region meet those standards.
        */
        // Creating cars for North America
        CarAbstractFactory northAmericaCarFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaCarFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaCarFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        // Creating cars for Europe
        CarAbstractFactory europeCarFactory = new EuropeCarFactory();
        Car europeCar = europeCarFactory.createCar();
        CarSpecification europeSpec = europeCarFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}