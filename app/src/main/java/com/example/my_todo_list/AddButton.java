//package com.example.my_todo_list;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.DatePickerDialog;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import java.util.Calendar;
//
//public class AddButton extends AppCompatActivity {
//    Button tick, btnDate;
//    EditText editTextDate2, editTextText2;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add_button);
//
//        tick = findViewById(R.id.tickmark);
//        btnDate = findViewById(R.id.btn_date);
//        editTextDate2 = findViewById(R.id.editTextDate2);
//        editTextText2 = findViewById(R.id.editTextText2);
//
//        tick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String taskName = editTextText2.getText().toString();
//                String taskDate = editTextDate2.getText().toString();
//
//                if (!taskName.isEmpty() && !taskDate.isEmpty()) {
//
//                    Intent resultIntent = new Intent();
//                    resultIntent.putExtra("taskName", taskName);
//                    resultIntent.putExtra("taskDate", taskDate);
//                    setResult(RESULT_OK, resultIntent);
//                    Intent ii = new Intent(AddButton.this, MainActivity.class);
//                    ii.putExtra("text", taskName);
//                    ii.putExtra("date", taskDate);
//                    startActivity(ii);
//                } else {
//                    Toast.makeText(AddButton.this, "Please enter both task name and date", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnDate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showDatePickerDialog();
//            }
//        });
//    }
//
//    private void showDatePickerDialog() {
//        final Calendar c = Calendar.getInstance();
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH);
//        int day = c.get(Calendar.DAY_OF_MONTH);
//
//        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
//                (view1, selectedYear, selectedMonth, selectedDay) -> {
//
//                    String selectedDate = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
//                    editTextDate2.setText(selectedDate);
//                },
//                year, month, day);
//
//        datePickerDialog.show();
//    }
//}
