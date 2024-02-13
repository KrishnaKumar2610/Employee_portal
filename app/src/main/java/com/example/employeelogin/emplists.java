package com.example.employeelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class emplists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emplists);

    }
    public void persondetail1(View view)
    {
        Intent intent = new Intent(this, last1.class);
        startActivity(intent);
    }
    public void persondetail2(View view)
    {
        Intent intent = new Intent(this, last2.class);
        startActivity(intent);
    }
}