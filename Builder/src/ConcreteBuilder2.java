public class ConcreteBuilder2 implements Builder {
    /*
    Concrete Builders provide different implementations of the construction steps.
    Concrete builders may produce products that don’t follow the common interface.
    */

    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int nbrOfDoors;

    @Override
    public ConcreteBuilder2 id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public ConcreteBuilder2 brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public ConcreteBuilder2 model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public ConcreteBuilder2 color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public ConcreteBuilder2 height(int height) {
        this.height = height;
        return this;
    }

    @Override
    public ConcreteBuilder2 engine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public ConcreteBuilder2 nbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }

    public Product2 build() {
        return new Product2(id, brand, model, color, height, engine, nbrOfDoors);
    }

}
