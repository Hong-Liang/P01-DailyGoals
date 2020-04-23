package com.example.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.Q1);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId = rg1.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb = (RadioButton) findViewById(selectedButtonId);

                RadioGroup rg2 = (RadioGroup) findViewById(R.id.Q2);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);

                RadioGroup rg3 = (RadioGroup) findViewById(R.id.Q3);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);

                EditText reflection = (EditText) findViewById(R.id.editText);
                String[] info = {rb.getText().toString(), rb2.getText().toString(), rb3.getText().toString(), reflection.getText().toString()};
                Intent i = new Intent(MainActivity.this,
                        Summary.class);
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);
            }
        });
    }
}
