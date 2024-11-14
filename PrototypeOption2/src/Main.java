import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ConcretePrototype> elementsToClone = Arrays.asList(
                new SubClassPrototype1("BWM", "Model1", "red", 180),
                new SubClassPrototype2("Toyota","hilux", "black", 160));

        List<ConcretePrototype> clonedElements = cloneElements(elementsToClone);
        clonedElements.forEach(System.out::println);
    }

    public static List<ConcretePrototype> cloneElements(List<ConcretePrototype> listOfPrototypes) {
        //Option 2, if the concretePrototype is extended by another subclass
        List<ConcretePrototype> copyList = new ArrayList<>();
        for (ConcretePrototype concretePrototype : listOfPrototypes){
            copyList.add(concretePrototype.clone());
        }
        return copyList;
    }
}