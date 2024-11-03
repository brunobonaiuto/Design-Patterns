public class Main {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance("AnyData");
        System.out.println(singletonInstance);

//        the object was already created with the String "AnyData" and I cannot override it
//        singletonInstance = Singleton.getInstance("AnotherData");
//        System.out.println(singletonInstance);

    }
}