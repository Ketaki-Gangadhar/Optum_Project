package ketaki.mycompany.optum_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {
    private Button submit;
   private RadioButton r11,r12,r13,r21,r22,r23,r31,r32,r33,r41,r42,r43,r51,r52,r53,r61,r62,r63,r71,r72,r73,r81,r82,r83,r91,r92,r93,r101,r102,r103,rd1,rd2,rd3,rd4,rd5,rd6,rd7,rd8,rd9,rd10;
    private RadioGroup r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
     private  int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        submit = findViewById(R.id.submit_button);



       r11 = findViewById(R.id.rd11);
        r12 = findViewById(R.id.rd12);
        r13 = findViewById(R.id.rd13);
        r21 = findViewById(R.id.rd21);
        r22 = findViewById(R.id.rd22);
        r23 = findViewById(R.id.rd23);
        r31 = findViewById(R.id.rd31);
        r32 = findViewById(R.id.rd32);
        r33 = findViewById(R.id.rd33);
        r41 = findViewById(R.id.rd41);
        r42 = findViewById(R.id.rd42);
        r43 = findViewById(R.id.rd43);
        r51 = findViewById(R.id.rd51);
        r52 = findViewById(R.id.rd52);
        r53 = findViewById(R.id.rd53);
        r61 = findViewById(R.id.rd61);
        r62 = findViewById(R.id.rd62);
        r63 = findViewById(R.id.rd63);
        r71 = findViewById(R.id.rd71);
        r72 = findViewById(R.id.rd72);
        r73 = findViewById(R.id.rd73);
        r81 = findViewById(R.id.rd81);
        r82 = findViewById(R.id.rd82);
        r83 = findViewById(R.id.rd83);
        r91 = findViewById(R.id.rd91);
        r92 = findViewById(R.id.rd92);
        r93 = findViewById(R.id.rd93);
        r101 = findViewById(R.id.rd101);
        r102 = findViewById(R.id.rd102);
        r103 = findViewById(R.id.rd103);


        r1 = findViewById(R.id.radio_group1);
        r2 = findViewById(R.id.radio_group2);
        r3 = findViewById(R.id.radio_group3);
        r4 = findViewById(R.id.radio_group4);
        r5 = findViewById(R.id.radio_group5);
        r6 = findViewById(R.id.radio_group6);
        r7 = findViewById(R.id.radio_group7);
        r8 = findViewById(R.id.radio_group8);
        r9 = findViewById(R.id.radio_group9);
        r10 = findViewById(R.id.radio_group10);




      submit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {



              openResultActivity();

          }
      });




    }
    public void openResultActivity(){
        int select1 = r1.getCheckedRadioButtonId();
        rd1 = findViewById(select1);
        if(rd1==r11)
            score+=0;
        if(rd1==r12)
            score+=10;
        if(rd1==r13)
            score+=5;
        int select2 = r2.getCheckedRadioButtonId();
        rd2 = findViewById(select2);
        if(rd2==r21)
            score+=0;
        if(rd2==r22)
            score+=10;
        if(rd2==r23)
            score+=5;
        int select3 = r3.getCheckedRadioButtonId();
        rd3 = findViewById(select3);
        if(rd3==r31)
            score+=0;
        if(rd3==r32)
            score+=10;
        if(rd3==r33)
            score+=5;
        int select4 = r4.getCheckedRadioButtonId();
        rd4 = findViewById(select4);
        if(rd4==r41)
            score+=0;
        if(rd4==r42)
            score+=10;
        if(rd4==r43)
            score+=5;
        int select5 = r5.getCheckedRadioButtonId();
        rd5 = findViewById(select5);
        if(rd5==r51)
            score+=0;
        if(rd5==r52)
            score+=10;
        if(rd5==r53)
            score+=5;
        int select6 = r6.getCheckedRadioButtonId();
        rd6 = findViewById(select6);
        if(rd6==r61)
            score+=0;
        if(rd6==r62)
            score+=10;
        if(rd6==r63)
            score+=5;
        int select7 = r7.getCheckedRadioButtonId();
        rd7 = findViewById(select7);
        if(rd7==r71)
            score+=0;
        if(rd7==r72)
            score+=10;
        if(rd7==r73)
            score+=5;
        int select8 = r8.getCheckedRadioButtonId();
        rd8 = findViewById(select8);
        if(rd8==r81)
            score+=0;
        if(rd8==r82)
            score+=10;
        if(rd8==r83)
            score+=5;
        int select9 = r9.getCheckedRadioButtonId();
        rd9= findViewById(select9);
        if(rd9==r91)
            score+=0;
        if(rd9==r92)
            score+=10;
        if(rd9==r93)
            score+=5;
        int select10 = r10.getCheckedRadioButtonId();
        rd10 = findViewById(select10);
        if(rd10==r101)
            score+=0;
        if(rd10==r102)
            score+=10;
        if(rd10==r103)
            score+=5;



        Intent intent = new Intent(this, result.class);
        intent.putExtra("ScoreValue", Integer.toString(score));

        startActivity(intent);
    }

}
