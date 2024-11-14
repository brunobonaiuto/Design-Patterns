public interface Builder {
    /*
    The Builder interface declares product construction steps that are common to all types of builders.
    */

    Builder id(int id);

    Builder brand(String brand);

    Builder model(String model);

    Builder color(String color);

    Builder height(int height);

    Builder engine(String engine);

    Builder nbrOfDoors(int nbrOfDoors) ;

}