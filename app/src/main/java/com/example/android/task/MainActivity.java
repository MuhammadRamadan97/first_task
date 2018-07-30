package com.example.android.task;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private EditText email,password,again,mobNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password =(EditText) findViewById(R.id.pass);
        again = (EditText) findViewById(R.id.again);
        mobNum  =(EditText) findViewById(R.id.mob);

        TextView continue1 =findViewById(R.id.cont);
        continue1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){

                String emailData = email.getText().toString();
                String passData = password.getText().toString();
                String againData = again.getText().toString();
                String mobNumData = mobNum.getText().toString();

                Intent intent = new Intent(MainActivity.this, Data.class);

                intent.putExtra("email", "Email : " +emailData);
                intent.putExtra("password", "Password : " +passData);
                intent.putExtra("password again", "Password Again : " +againData);
                intent.putExtra("mobile", "Mobile : " +mobNumData);

                startActivity(intent);

            }

        });
    }

}
