package concreteProducts;

import abstractProduct.Car;

public class Pickup implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Pick Up car.");
    }
}
