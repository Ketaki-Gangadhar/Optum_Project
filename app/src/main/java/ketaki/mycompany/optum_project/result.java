package ketaki.mycompany.optum_project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    private Button proceed;
    private TextView show,resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        proceed = findViewById(R.id.proceed_button);
        show = findViewById(R.id.textView4);
        resultView = findViewById(R.id.textViewResult);

        show.setText("Your Score is " + getIntent().getStringExtra("ScoreValue"));

       int t = Integer.parseInt(getIntent().getStringExtra("ScoreValue"));

       if(t>=70)
       {
           resultView.setText("Your mental health is Good !");
           resultView.setTextColor(Color.GREEN);
       }

        if(t>=40 && t<=70)
        {
            resultView.setText("You should invest more time to care yourself. ");
            resultView.setTextColor(Color.BLUE);
        }
        if(t<40)
        {
            resultView.setText("It's time to take your mental health issues seriously.");
            resultView.setTextColor(Color.RED);
        }

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startProfileActivity();
            }
        });



    }

    public void startProfileActivity(){
        Intent intent = new Intent(this, Profile_Activity.class);
        startActivity(intent);
    }


}