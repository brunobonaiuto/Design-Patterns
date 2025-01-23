package ConcreteClasses;

import AbstractClasses.AbstractClass;

public class ConcreteClassOne extends AbstractClass {
    /**
     * Note that the concreteClass should implement ALL the abstract methods from the abstract class
     * Each step would be exectued in the order defined in the templateMethod
     */

    @Override
    protected void step1() {
        System.out.println("Step 1");
    }

    @Override
    protected void step2() {
        System.out.println("Step 2");
    }

    @Override
    protected void step3() {
        System.out.println("Step 3");
    }

    @Override
    protected void step4() {
        System.out.println("Step 4");
    }
}
