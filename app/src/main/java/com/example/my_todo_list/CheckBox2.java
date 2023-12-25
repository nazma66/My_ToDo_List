package com.example.my_todo_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CheckBox2 extends AppCompatActivity {
    EditText et1,et2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box2);
        EditText et1,et2;



            et1 = findViewById(R.id.et1);
            et2 = findViewById(R.id.et2);
            btn = findViewById(R.id.btn);

            String value1 = getIntent().getExtras().getString("grade1");
            et1.setText(value1);

            String value2 = getIntent().getExtras().getString("grade2");
            et2.setText(value2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(CheckBox2.this, MainActivity.class);
                startActivity(ii);

            }
        });
        }

    }
