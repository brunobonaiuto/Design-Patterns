import java.util.List;

/**
 * Concrete Handlers contain the actual code for processing requests.
 */
public class ManagerHandler extends DatabaseHandler {
    /**
     * Upon receiving a request, each handler must decide whether to process it and, additionally, whether to pass it along the chain.
     */
    List<String> dataBase = List.of("admin", "Bruno", "Morena");

    @Override
    public boolean handle(String username, String password) {
        return adminExists(username) && handleNext(username, password);
        }

    private boolean adminExists(String username) {
        if(dataBase.contains(username)){
            System.out.println("Third handler, the user is really an admin");
            return true;
        }
        return false;
    }

}
