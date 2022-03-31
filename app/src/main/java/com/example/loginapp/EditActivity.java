package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {
    EditText ed1;
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        ed1=(EditText)findViewById(R.id.test);
        name=getIntent().getExtras().getString("Username");
        ed1.setText(name);
    }
}