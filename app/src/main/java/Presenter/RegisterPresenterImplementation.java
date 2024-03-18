package Presenter;

import Model.RegisterModel;
import View.RegisterView;

public class RegisterPresenterImplementation  implements RegisterPresenter {
    private RegisterModel model;
    private RegisterView view;

    public RegisterPresenterImplementation (RegisterModel model, RegisterView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void registerUser(String username, String password, String email, String fullName) {
        if (model.validateUserInput(username, password, email, fullName)) {
            boolean isSuccess = model.registerUser(username, password, email, fullName);
            view.showRegistrationResult(isSuccess);
        } else {
            view.showValidationErrorMessage();
        }
    }
}
