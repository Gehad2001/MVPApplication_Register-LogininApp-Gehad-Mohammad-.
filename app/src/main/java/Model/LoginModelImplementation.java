package Model;
public class LoginModelImplementation implements LoginModel {
    @Override
    public boolean authenticate(String username, String password) {
        return username.equals("gehad") && password.equals("password");
    }
}

