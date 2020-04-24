package c346.rp.edu.dailygoal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioButton materialAnswer;
    RadioButton timeAnswer;
    RadioButton attemptAnswer;

    RadioGroup material ;
    RadioGroup time;
    RadioGroup attempt ;
    EditText reflection ;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button OK = (Button)findViewById(R.id.send);
        material = findViewById(R.id.RadioMaterial);
        time = findViewById(R.id.radioTime);
        attempt = findViewById(R.id.radioAttempt);
        reflection = findViewById(R.id.Reflection);




        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (material.getCheckedRadioButtonId() != -1 && time.getCheckedRadioButtonId() != -1 && attempt.getCheckedRadioButtonId() != -1 && reflection.getText().toString().trim().length() != 0){
                    int materialAnswerId = material.getCheckedRadioButtonId();
                    int timeAnswerId = time.getCheckedRadioButtonId();
                    int attemptAnswerId = attempt.getCheckedRadioButtonId();


                    materialAnswer = (RadioButton)findViewById(materialAnswerId);
                    timeAnswer = (RadioButton)findViewById(timeAnswerId);
                    attemptAnswer = (RadioButton)findViewById(attemptAnswerId);




                    //intent method
                    String[] info = {materialAnswer.getText().toString(), timeAnswer.getText().toString(), attemptAnswer.getText().toString(), reflection.getText().toString()};
                    Intent i = new Intent(MainActivity.this, Display.class);
                    i.putExtra("Info", info);
                    startActivity(i);

                }

            }
        });

    }
}
