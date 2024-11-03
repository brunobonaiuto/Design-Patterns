public class ConcreteBuilder1 implements Builder {

    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int nbrOfDoors;

    @Override
    public ConcreteBuilder1 id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public ConcreteBuilder1 brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public ConcreteBuilder1 model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public ConcreteBuilder1 color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public ConcreteBuilder1 height(int height) {
        this.height = height;
        return this;
    }

    @Override
    public ConcreteBuilder1 engine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public ConcreteBuilder1 nbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }

    public Product1 build() {
        return new Product1(id, brand, model, color, height, engine, nbrOfDoors);
    }

}
