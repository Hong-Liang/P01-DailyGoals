package com.example.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    TextView tv1 = findViewById(R.id.textView8);
    TextView tv2 = findViewById(R.id.textView9);
    TextView tv3 = findViewById(R.id.textView10);
    TextView tv4 = findViewById(R.id.textView14);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        tv1.setText("Read up on materials before class:" + info[0]);
        tv2.setText("Arrive on time so as to not miss important part of the lesson:" + info[1]);
        tv3.setText("Attempt the problem myself:" + info[2]);
        tv4.setText(""+info[3]);
    }
}
