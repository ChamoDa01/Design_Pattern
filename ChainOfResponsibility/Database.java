package ChainOfResponsibility;
import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String,String> users;

    public Database() {
        this.users = new HashMap<>();
        users.put("admin_username","admin_password");
        users.put("user1_username","user1_password");
    }

    public boolean isValidUsername(String username){
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username,String password){
        return users.get(username).equals(password);
    }
}
