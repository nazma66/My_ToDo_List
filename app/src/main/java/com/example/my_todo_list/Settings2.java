package com.example.my_todo_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Settings2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings2);


            // Initialize EditTexts
            EditText editText = findViewById(R.id.editText);
            EditText editText2 = findViewById(R.id.editText2);

            // Retrieve values from intent
            String value1 = getIntent().getStringExtra("button");
            String value2 = getIntent().getStringExtra("button2");

            // Set values to EditTexts
            editText.setText(value1);
            editText2.setText(value2);
    }
}