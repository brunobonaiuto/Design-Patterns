public class ConcretePrototype implements Prototype{

    private String brand;
    private String model;
    private String color;
    private int topSpeed;

    public ConcretePrototype(String brand, String model, String color, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    //constructor used only for cloning
    public ConcretePrototype(ConcretePrototype prototype) {
        this.brand = prototype.brand;
        this.model = prototype.model;
        this.color = prototype.color;
        this.topSpeed = prototype.topSpeed;
    }

    @Override
    public ConcretePrototype clone() {
        return new ConcretePrototype(this);
    }
}
