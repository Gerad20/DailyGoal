package c346.rp.edu.dailygoal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Display extends AppCompatActivity {
    TextView Displayed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_answers);
         Displayed = findViewById(R.id.displayAnswers);

        Intent i = getIntent();

        String[] info = i.getStringArrayExtra("Info");

        Displayed.setText("Read up on materials before class : " + info[0] +"\n Arrive on time so as to not miss important part of the lesson : " + info[1] + "\n Attempt to solve the problem myself " + info[2] + "\n Reflection: " + info[3]);








    }
}