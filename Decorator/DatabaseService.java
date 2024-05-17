package Decorator;

public class DatabaseService {
    public String getPhoneNumber(String username){ return username + "@PhoneNumber"; }

    public String getMail(String username){
        return username + "@Mail";
    }

    public String getFBName(String username){
        return username + "@FBName";
    }
}
