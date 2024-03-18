package View;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvpapplication_gehadmohammad.R;

import Model.RegisterModel;
import Model.RegisterModelImplementation;
import Presenter.RegisterPresenter;
import Presenter.RegisterPresenterImplementation;

public class RegisterActivity extends AppCompatActivity implements RegisterView {
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonRegister;
    private RegisterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        RegisterModel model = new RegisterModelImplementation();
        presenter = new RegisterPresenterImplementation(model, this);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();
            }
        });
    }

    public void showRegisterResult(boolean isSuccess) {
        if (isSuccess) {
            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            // Show error message
            Toast.makeText(this, "Registration failed. Please try again.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void showRegistrationResult(boolean isSuccess) {

    }

    @Override
    public void showValidationErrorMessage() {

    }
}
