package sg.edu.rp.c346.id20042303.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ForthActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
        tvAnswer = findViewById(R.id.textView3);
        Intent intendReceived = getIntent();
        double value = intendReceived.getDoubleExtra("value",0.0);
        tvAnswer.setText("Double value is: " + value);
    }
}