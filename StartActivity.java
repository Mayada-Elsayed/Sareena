package com.example.mayad.sareena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        final Button loginbtn = (Button) findViewById(R.id.loginbtn);
        final Button regbtn = (Button) findViewById(R.id.regbtn);

        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent loginIntent = new Intent(StartActivity.this,LoginActivity.class);
                StartActivity.this.startActivity(loginIntent);
            }
        });

        regbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent regIntent = new Intent(StartActivity.this,RegisterActivity.class);
                StartActivity.this.startActivity(regIntent);
            }
        });
    }
}
