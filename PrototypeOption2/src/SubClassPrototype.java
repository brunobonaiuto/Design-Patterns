public class SubClassPrototype extends ConcretePrototype{
    private final int topSpeed;

    public SubClassPrototype(String brand, String model, String color, int topSpeed) {
        super(brand,model,color);
        this.topSpeed = topSpeed;
    }

    //constructor used only for cloning
    private SubClassPrototype(SubClassPrototype subClassPrototype) {
        super(subClassPrototype);
        this.topSpeed = subClassPrototype.topSpeed;
    }

    @Override
    public SubClassPrototype clone() {
        return new SubClassPrototype(this);
    }

    @Override
    public String toString() {
        String parent = super.toString();
        return parent +" and " +"SubClassPrototype{" +
                "topSpeed=" + topSpeed +
                '}';
    }
}
