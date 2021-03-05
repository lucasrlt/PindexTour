package ch.epfl.sdp.sdpbootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToGreetins(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        EditText mainNameInput = (EditText) findViewById(R.id.mainName);
        String mainName = mainNameInput.getText().toString();
        intent.putExtra("mainName", mainName);
        startActivity(intent);
    }
}