package Model;

public class RegisterModelImplementation implements RegisterModel {
    @Override
    public boolean validateUserInput(String username, String password, String email, String fullName) {
        return !username.isEmpty() && !password.isEmpty() && !email.isEmpty() && !fullName.isEmpty();
    }

    @Override
    public boolean registerUser(String username, String password, String email, String fullName) {
        return true;
    }
}