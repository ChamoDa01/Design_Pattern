package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database)).
                setNextHandler(new RoleCheckerHandler());
        AuthService auth = new AuthService(handler);
        auth.LogIn("user1_username","user1_password");
    }
}
