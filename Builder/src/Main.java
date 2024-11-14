public class Main {
    // CLIENT
    /*
    The Client must associate one of the builder objects with the director.
    Usually, it’s done just once, via parameters of the director’s constructor.
    Then the director uses that builder object for all further construction.
    However, there’s an alternative approach for when the client passes the builder object to the production method of the director.
    In this case, you can use a different builder each time you produce something with the director.
     */
    public static void main(String[] args) {
        /*
        Builder is a creational design pattern that lets you construct complex objects step by step.
        The pattern allows you to produce different types and representations of an object using the same construction code.
        */

        // Build Product 1.1
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        concreteBuilder1.id(2122);
        concreteBuilder1.brand("Bugatti");
        concreteBuilder1.model("Chiron");
        concreteBuilder1.color("Blue");
        concreteBuilder1.nbrOfDoors(2);
        concreteBuilder1.engine("8L");
        concreteBuilder1.height(115);
        Product1 product11 = concreteBuilder1.build();

        // Build Product 1.2 -- same as before
        Product1 product12 = new ConcreteBuilder1()
                .id(2123)
                .brand("Bugatti")
                .model("Divo")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(121)
                .build();

        // Build Product 1.3 -- same as before
        Product1 product13 = new ConcreteBuilder1()
                .id(2124)
                .brand("Bugatti")
                .model("Centodieci")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(121)
                .build();

        // Build Product 1.4 -- same as before
        Product1 product14 = new ConcreteBuilder1()
                .id(1122)
                .brand("Lamborghini")
                .model("Aventador")
                .color("Yellow")
                .nbrOfDoors(2)
                .engine("6.5L")
                .height(115)
                .build();

        // Build Product 1.5 -- same as before
        Product1 product15 = new ConcreteBuilder1()
                .id(1123)
                .brand("Lamborghini")
                .model("Huracan")
                .color("Yellow")
                .nbrOfDoors(2)
                .engine("5.2L")
                .height(115)
                .build();

        // Build Product 1.6 -- same as before
        Product1 product16 = new ConcreteBuilder1()
                .id(1122)
                .brand("Lamborghini")
                .model("Aventator")
                .color("Yellow")
                .nbrOfDoors(2)
                .engine("5.2L")
                .height(115)
                .build();
        //-------------------------------------------------------------
        // Instead use the director, when having to many similar attributes
        // REPLACE in Director class

        Director director = new Director();

        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        director.buildBugatti(builder1);
        builder1.model("Any Model"); //we can override, or even set, before calling .build() the concrete object is not yet created
        Product1 product1 = builder1.build();
        System.out.println(product1);

        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        director.buildLambo(builder2);
        builder2.model("Another Model").id(26).color("Red");
        System.out.println(builder2.build());
    }
}