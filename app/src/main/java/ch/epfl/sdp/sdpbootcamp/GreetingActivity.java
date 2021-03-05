package ch.epfl.sdp.sdpbootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Intent intent = getIntent();
        String message = intent.getStringExtra("mainName");

        TextView greetingTextView = findViewById(R.id.greetinsMessage);
        greetingTextView.setText(message);
    }
}