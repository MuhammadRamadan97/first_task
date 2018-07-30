package com.example.android.task;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Data extends AppCompatActivity {

    TextView emailView,passView,mobView,againView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);

        emailView = (TextView) findViewById(R.id.email);
        passView = (TextView) findViewById(R.id.pass);
        mobView = (TextView) findViewById(R.id.mobile);
        againView = (TextView) findViewById(R.id.again);

        Bundle extras =getIntent().getExtras();

            String email = extras.getString("email");
            String pass = extras.getString("password");
            String again = extras.getString("password agin");
            String mob = extras.getString("mobile");

            emailView.setText(email);
            passView.setText(pass);
            againView.setText(again);
            mobView.setText(mob);



    }
}
