package com.example.sqlitestudentrecord;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  DataBaseHelper dataBaseHelper;
  EditText editText_id,editText_name,editText_email,editText_courseCount;
  Button button_add, button_getAll,button_update,button_delete,button_viewAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataBaseHelper = new DataBaseHelper(this);
        editText_id = findViewById(R.id.editText_id);
        editText_name = findViewById(R.id.editText_name);
        editText_email = findViewById(R.id.editText_email);
        editText_courseCount = findViewById(R.id.editText_CC);
        button_add = findViewById(R.id.button_add);
        button_getAll = findViewById(R.id.button_view);
        button_update = findViewById(R.id.button_update);
        button_delete = findViewById(R.id.button_delete);
        button_viewAll = findViewById(R.id.button_viewAll);
        addData();
    }

    public void addData() {
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Boolean isInserted = dataBaseHelper.insertData(editText_name.getText().toString(),
                      editText_email.getText().toString(),
                      editText_courseCount.getText().toString());
              if (isInserted == true) {
                  Toast.makeText(MainActivity.this,
                          "Data Inserted Successfully !!",
                          Toast.LENGTH_SHORT).show();
              } else {
                  Toast.makeText(MainActivity.this,
                          "Something Went Wrong !!",
                          Toast.LENGTH_SHORT).show();
              }

            }
        });
    }

    public void showMessage(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.create();
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}