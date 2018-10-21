package com.example.kavya.myworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // button to do login
        Button btn1 = (Button)findViewById(R.id.btndologin);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyWorldApp","Successfully Logged in ");
                Toast.makeText(getApplicationContext(),"Thank you for logging in!!",Toast.LENGTH_SHORT)
                        .show();
            }
        });
        // button to do signup
        Button btn2 = (Button)findViewById(R.id.btndosignup);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyWorldApp","Successfully Signed Up");
                Toast.makeText(getApplicationContext(),"Thank you for Registering!!",Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
