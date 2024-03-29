package com.example.my_todo_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button button1, tick;
    TextView tasklist;
    String[] taskname = {"take a walk", "get more water", "make a personal call", "make an appointment", "take a walk", "get more water", "make a personal call", "make an appointment"};
    ListView lv;
    TextView tv_1;
 String [] ctgname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button1 = findViewById(R.id.btnAdd);
//        tasklist = findViewById(R.id.tasklist);

//        String string_value = getIntent().getExtras().getString("name");
//        tasklist.setText(string_value);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Resources res= getResources();
        ctgname = res.getStringArray(R.array.chittagongthana);

//resources a ja thakbe shb kichurjonno class Resources use kore lagbe


//        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, taskname);
//        lv.setAdapter(adapter);


 /*
        lv = findViewById(R.id.lv2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, taskname);
        lv.setAdapter(adapter1);
*/

List<String> listca = new ArrayList<>();

for(String i : taskname) {
    listca.add(i);
}
//for passing data from array to array list.
        lv = findViewById(R.id.lv1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(MainActivity.this, R.layout.adaptersecond, R.id.tv_1, listca);
        lv.setAdapter(adapter2);


    }







//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent ii = new Intent(MainActivity.this, AddButton.class);
//                startActivity(ii);
//
//            }
//        });



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.task_list) {
            Intent ii = new Intent(MainActivity.this, CheckBox.class);
            startActivity(ii);
        }
        if (id == R.id.invite) {
            String contentToShare = "SHARE MY TO DO LIST WITH YOUR FRIENDS!!.";
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, contentToShare);
            startActivity(Intent.createChooser(intent, "Share Task List via"));

        }

        if (id == R.id.add_media) {
//            iv.setImageResource(R.drawable.cat);
        }
        if (id == R.id.action_camera) {
            Intent i = new Intent();
            i.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(i);

        }
        if (id == R.id.action_gallery) {
            Intent ii = new Intent();
            ii.setAction(Intent.ACTION_VIEW);
            ii.setData(Uri.parse("content://media/external/images/media/"));
            startActivity(ii);

        }
        if (id == R.id.action_video) {
            Intent i = new Intent();
            i.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
            startActivity(i);

        }

        if (id == R.id.action_Facebook) {
            String facebookUrl = "https://www.facebook.com/your_facebook_page";
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl));
                startActivity(intent);
            } catch (Exception e) {
                // If no Facebook app is available, open in a web browser
                Toast.makeText(this, "Facebook app not installed. Opening in a web browser.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl));
                startActivity(intent);
            }

        }

        if (id == R.id.action_instagram) {
            try {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/_u/USERNAME")));
            } catch (Exception e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/USERNAME")));
            }

        }

        if (id == R.id.action_Whatsapp) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=PHONE_NUMBER"));
            startActivity(intent);
        }
        //The try block contains the code where an exception (an error condition) might occur.
        //The catch block is executed if an exception is thrown in the corresponding try block.
        if (id == R.id.action_message) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:"));
            startActivity(intent);
        }

        if (id == R.id.action_dial) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"));
            startActivity(intent);
        }
        if (id == R.id.action_Contact_list) {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_VIEW);
            i.setData(Uri.parse("content://contacts/people/"));
            startActivity(i);
        }
        if (id == R.id.feedback) {
            String emailAddress = "todolist__feedback@gmail.com";
            String subject = "Feedback";

            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:" + Uri.encode(emailAddress)));

            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, "Your feedback goes here.");
            startActivity(intent);
        }
        if (id == R.id.settings) {
            Intent intent = new Intent(this, SettingActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
