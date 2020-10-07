package edu.amacdonald.lab01a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usersName = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //links Java usersName to XML component
        usersName = findViewById(R.id.editTextTextPersonName);

    }

    public void doName(View view) {
        String name = null;
        name = usersName.getText().toString();
        Toast.makeText(this, "Hi " + name +", you called?", Toast.LENGTH_LONG).show();
        usersName.getText().clear();
    }
}