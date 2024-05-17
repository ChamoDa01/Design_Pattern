package ChainOfResponsibility;

public class RoleCheckerHandler extends Handler{
    @Override
    public boolean handle(String username, String password) {
        if ("admin_username".equals(username)){
            System.out.println("Loading Admin page..");
            return true;
        }
        System.out.println("Loading default page..");
        return handleNext(username, password);
    }
}
