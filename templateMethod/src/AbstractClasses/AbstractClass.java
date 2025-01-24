package AbstractClasses;

/**
 * - The Abstract Class declares methods that act as steps of an algorithm,
 *   as well as the actual template method which calls these methods in a specific order.
 * - The steps may either be declared abstract or have some default implementation.
 */
public abstract class AbstractClass {
    /**
     * The template method defines the skeleton of an algorithm. The Steps of an algorithm are defined in this method.
     */
    public void templateMethod() {
        defaultImplementation1();
        step1();
        step2();
        step3();
        step4();
        defaultImplementation2();
    }

    /**
     * These operations have to be implemented by the concrete classes.
     */
    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();
    protected abstract void step4();


    /**
     * These operations have some default implementation.
     */
    protected void defaultImplementation1(){
        System.out.println("Default implementation 1");
        //some common code for all the abstract classes
    }

    protected void defaultImplementation2(){
        System.out.println("Default implementation 2");
        //some common code for all the abstract classes
    }

}
