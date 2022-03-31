package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1;
String getUserName, getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.user);
        ed2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.logbut);
        if (getUserName!=null)
        {
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUserName=ed1.getText().toString();
                getPassword=ed2.getText().toString();
                if(getUserName.equals("abc@gmail.com")&&getPassword.equals("12345"))
                {
                    Intent i=new Intent(getApplicationContext(),EditActivity.class);
                    i.putExtra("Username",getUserName);
                    i.putExtra("Password",getPassword);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Invalid Credinentals", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}