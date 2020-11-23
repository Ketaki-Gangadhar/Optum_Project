package ketaki.mycompany.optum_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Profile_Activity extends AppCompatActivity {
    private Button suggestions,sessions,chat,counselling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);
        counselling = findViewById(R.id.name1);
        suggestions = findViewById(R.id.name2);
        chat = findViewById(R.id.name3);
        sessions = findViewById(R.id.name4);

        counselling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewActivity1();
            }
        });

        suggestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewActivity2();
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewActivity3();
            }
        });
        sessions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewActivity4();
            }
        });








    }

    public void openNewActivity1(){
        Intent intent = new Intent(this, counselling.class);
        startActivity(intent);
    }
    public void openNewActivity2(){
        Intent intent = new Intent(this, suggestions.class);
        startActivity(intent);
    }
    public void openNewActivity3(){
        Intent intent = new Intent(this, chat.class);
        startActivity(intent);
    }
    public void openNewActivity4(){
        Intent intent = new Intent(this, sessions.class);
        startActivity(intent);
    }
}
