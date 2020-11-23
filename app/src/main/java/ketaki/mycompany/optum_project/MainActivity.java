package ketaki.mycompany.optum_project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView head_view, line_view;
    private EditText full_name, phone_number, email, password;
    private Button create;
    private boolean flag = true;

    public void clickFunction(View view) {
        if (flag == true) {
            full_name.setVisibility(View.INVISIBLE);
            phone_number.setVisibility(View.INVISIBLE);
            head_view.setText("Log In");
            create.setText("Sign In");
            line_view.setText("New User? Create Account");
            flag = false;
        } else {

            full_name.setVisibility(View.VISIBLE);
            phone_number.setVisibility(View.VISIBLE);
            head_view.setText("Create New Account");
            create.setText("Register");
            line_view.setText("Already have Account? LogIn Here");
            flag = true;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        head_view = findViewById(R.id.view);
        line_view = findViewById(R.id.text_View);
        full_name = findViewById(R.id.full_name);
        phone_number = findViewById(R.id.phone_number);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        create = findViewById(R.id.create_button);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });


    }
    public  void  openNewActivity(){
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }

}