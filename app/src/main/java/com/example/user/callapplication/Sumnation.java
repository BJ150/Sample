package com.example.user.callapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Sumnation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumnation);
        Button btnCompute = (Button) findViewById(R.id.btnCompute);
        final EditText Value = (EditText) findViewById(R.id.InputValue);
        final TextView Result = (TextView) findViewById(R.id.Result);
        btnCompute.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String val = Value.getText().toString();
        int i = Integer.parseInt(val);
        int i2 = 0;
        int i3 = 0;
        if(i > 25){
            Toast.makeText(getApplicationContext(), "Max 25", Toast.LENGTH_LONG).show();
        } else {
            while(i>=0){
                i2 = i;
                i3 += i2;
                i--;
            }
            Result.setText(String.valueOf("Result="+i3));
        }
    }
});
    }
}