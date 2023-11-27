package com.example.user.callapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallApplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_application);

        Button Btndemo= (Button) findViewById(R.id.Deno);
        Button BtnSum= (Button) findViewById(R.id.Sum);
        
        Btndemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deno= new Intent(CallApplication.this,Denomination.class);
                startActivity(deno);
            }
        });
        BtnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sum = new Intent(CallApplication.this, Sumnation.class);
                startActivity(sum);
            }
        });
    }
}
