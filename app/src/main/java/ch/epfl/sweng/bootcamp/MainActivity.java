package ch.epfl.sweng.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        EditText editText = (EditText) findViewById(R.id.mainName);
        String message = "Hello " + editText.getText().toString() + "!";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
