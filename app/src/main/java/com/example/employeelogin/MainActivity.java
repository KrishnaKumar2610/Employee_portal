package com.example.employeelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =  (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton)  findViewById(R.id.login);

        //admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("krishna") && password.getText().toString().equals("1234"))
                {
                    Toast.makeText(MainActivity.this ,"Login Successfully",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, emplists.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this ,"Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}