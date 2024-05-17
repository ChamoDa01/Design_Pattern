package ChainOfResponsibility;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler){
        this.handler=handler;
    }

    public boolean LogIn(String username,String password){
        if(handler.handle(username, password)){
            System.out.println("Authorization was successful!");
            return true;
        }
        return false;
    }
}
