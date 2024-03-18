package Presenter;

import Model.LoginModel;
import View.LoginView;

public class LoginPresenterImplementation implements LoginPresenter {
    private LoginModel model;
    private LoginView view;

    public LoginPresenterImplementation(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void authenticateUser(String username, String password) {
        boolean isSuccess = model.authenticate(username, password);
        view.showLoginResult(isSuccess);
    }
}
