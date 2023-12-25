package com.example.my_todo_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckBox extends AppCompatActivity {
    android.widget.CheckBox checkBox, checkBox2, checkBox3, checkBox4,checkBox5,checkBox6;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);


        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 =findViewById(R.id.checkBox5);
        checkBox6 =findViewById(R.id.checkBox6);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override

//                String is ASSIGNTIMEESTIMATESSelected = checkBox.isChecked();
//                boolean isJamunaSelected = checkBox2.isChecked();
//                boolean isPacificSelected = checkBox3.isChecked();
//                boolean isAtlanticSelected = checkBox4.isChecked();
//
//                String result;
//                if (isPadmaSelected && isJamunaSelected && !isPacificSelected && !isAtlanticSelected) {
//                    result = "NOTHING TO DO!";
//                } else {
//                    result = "";
//                }

                public void onClick(View v) {
                    Intent intent = new Intent(CheckBox.this, CheckBox2.class);

                if(checkBox.isChecked()){
                    String result2 = "Task Completed";
                    intent.putExtra("grade2",result2);
                }
                
                    if(checkBox2.isChecked()){
                        String result2 = "Task Completed";
                        intent.putExtra("grade2",result2);
                    }
                if(checkBox3.isChecked()){
                    String result2 = "Task Completed";
                    intent.putExtra("grade2",result2);
                }
                if(checkBox4.isChecked()){
                    String result2 = "Task Completed";
                    intent.putExtra("grade2",result2);
                }
                if(checkBox5.isChecked()){
                    String result2 = "Task Completed";
                    intent.putExtra("grade2",result2);
                }
                if(checkBox6.isChecked()){
                    String result2 = "Task Completed";
                    intent.putExtra("grade2",result2);
                }
                else {
                    String result1 = "No Task Completed";
                    intent.putExtra("grade1",result1);
                }
                    startActivity(intent);
                }
            });




    }
}