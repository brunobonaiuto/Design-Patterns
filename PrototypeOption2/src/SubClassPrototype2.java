public class SubClassPrototype2 extends ConcretePrototype{
    private final int topSpeed;

    public SubClassPrototype2(String brand, String model, String color, int topSpeed) {
        super(brand,model,color);
        this.topSpeed = topSpeed;
    }

    //constructor used only for cloning
    private SubClassPrototype2(SubClassPrototype2 subClassPrototype) {
        super(subClassPrototype);
        this.topSpeed = subClassPrototype.topSpeed;
    }

    @Override
    public SubClassPrototype2 clone() {
        return new SubClassPrototype2(this);
    }

    @Override
    public String toString() {
        String parent = super.toString();
        return parent +" and " +"SubClassPrototype{" +
                "topSpeed=" + topSpeed +
                '}';
    }
}
