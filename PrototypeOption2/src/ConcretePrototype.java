public abstract class ConcretePrototype {
    private String brand;
    private String model;
    private String color;

    public ConcretePrototype(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public ConcretePrototype(ConcretePrototype concretePrototype) {
        this.brand = concretePrototype.brand;
        this.model = concretePrototype.model;
        this.color = concretePrototype.color;
    }

    public abstract ConcretePrototype clone();

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

