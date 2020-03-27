package com.example.labsheet_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.labsheet_3.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openonclick();


    }

    /**
     * calls when the user send tap button
     */

    public void openonclick() {
        @SuppressLint("WrongViewCast") EditText userTextEntry = (EditText) findViewById(R.id.textView);

        int number = Integer.parseInt(userTextEntry.getText().toString());


        Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, number);

        startActivity(intent);
    }
}

