public class Singleton {

    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    //the method returns the single instance of the class (the singleton)
    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    //creates the singleton instance
                    instance = new Singleton(data);
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "data='" + data + '\'' +
                '}';
    }
}
