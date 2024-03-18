package Model;

public interface RegisterModel {
    boolean validateUserInput(String username, String password, String email, String fullName);
    boolean registerUser(String username, String password, String email, String fullName);
}
