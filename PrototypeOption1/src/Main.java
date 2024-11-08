public class Main {
    public static void main(String[] args) {
        //Option 1 if the Object does not inherit from any other
        ConcretePrototype concretePrototype = new ConcretePrototype("Brand","model","color", 999);
        ConcretePrototype clonedPrototype = concretePrototype.clone();
        System.out.println(clonedPrototype);
    }
}