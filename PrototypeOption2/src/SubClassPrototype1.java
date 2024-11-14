public class SubClassPrototype1 extends ConcretePrototype{
    private final int topSpeed;
    private GpsSystem gpsSystem;

    public SubClassPrototype1(String brand, String model, String color, int topSpeed) {
        super(brand,model,color);
        this.topSpeed = topSpeed;
    }

    //constructor used only for cloning
    private SubClassPrototype1(SubClassPrototype1 subClassPrototype) {
        super(subClassPrototype);
        this.topSpeed = subClassPrototype.topSpeed;
        //shallow copy
        this.gpsSystem = subClassPrototype.gpsSystem; //reference to gps object in memory
        //deep copy
        this.gpsSystem = new GpsSystem(); //or gpsSystem.clone()
    }

    @Override
    public SubClassPrototype1 clone() {
        return new SubClassPrototype1(this);
    }

    @Override
    public String toString() {
        String parent = super.toString();
        return parent +" and " +"SubClassPrototype{" +
                "topSpeed=" + topSpeed +
                '}';
    }
}
