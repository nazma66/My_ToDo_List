package com.example.my_todo_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class SettingActivity extends AppCompatActivity {
    Switch switch1, switch2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);



            switch1 = findViewById(R.id.switch1);
            switch2 = findViewById(R.id.switch2);
            button = findViewById(R.id.button); // Initialize button

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String statusSwitch1, statusSwitch2;
                    Intent intent = new Intent(getApplicationContext(), Settings2.class);

                    if (switch1.isChecked())
                        statusSwitch1 = "Dark Theme On";  // Change this string
                    else
                        statusSwitch1 = "Dark Theme Off";  // Change this string

                    if (switch2.isChecked())
                        statusSwitch2 = "Light Theme is On";  // Change this string
                    else
                        statusSwitch2 = "Light Theme is Off";  // Change this string

                    intent.putExtra("button", statusSwitch1);
                    intent.putExtra("button2", statusSwitch2);

                    startActivity(intent);
                }
            });
        }



    }








