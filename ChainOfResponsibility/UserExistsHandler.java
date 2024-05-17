package ChainOfResponsibility;

public class UserExistsHandler extends Handler{

    private Database database;

    public UserExistsHandler(Database database){
        this.database=database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidUsername(username)){
            System.out.println("This user is not registered..");
            System.out.println("[Sing Up]");
            return false;
        }
        return handleNext(username, password);
    }
}
