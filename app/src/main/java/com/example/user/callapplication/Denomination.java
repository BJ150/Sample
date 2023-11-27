package com.example.user.callapplication;


import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class Denomination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denomination);
        TextView amt1= (TextView) findViewById(R.id.Amt);
        final EditText Amt= (EditText) findViewById(R.id.Amount);
        Button shButton= (Button) findViewById(R.id.BtnRes);

        final TextView K1= (TextView) findViewById(R.id.K1);
        final TextView H5= (TextView) findViewById(R.id.H5);
        final TextView H2= (TextView) findViewById(R.id.H2);
        final TextView H1= (TextView) findViewById(R.id.H1);
        final TextView F5= (TextView) findViewById(R.id.F5);
        final TextView T2= (TextView) findViewById(R.id.T2);
        final TextView T1= (TextView) findViewById(R.id.T1);
        final TextView  T5= (TextView) findViewById(R.id.P5);
        final TextView P1= (TextView) findViewById(R.id.P1);

        shButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amount = Integer.parseInt(Amt.getText().toString());
                int A1 = amount / 1000;
                int A2 = 1000 * A1;
                int A3 = amount - A2;
                K1.setText(String.valueOf("1000="+A1));
                int B1 = A3 / 500;
                int B2 = B1 * 500;
                int B3 = A3 - B2;
                H5.setText(String.valueOf("500="+B1));

                int C1 = B3 / 200;
                int C2 = C1 * 200;
                int C3 = B3 - C2  ;
                H2.setText(String.valueOf("200="+C1));

                int D1 = C3 / 100;
                int D2 = 100 * D1;
                int D3 =  C3 - D2 ;
                H1.setText(String.valueOf("100="+D1));

                int E1 = D3 / 50;
                int E2 = E1 * 50;
                int E3 =  D3 - E2;
                F5.setText(String.valueOf("50="+E1));

                int F1 = E3 / 20;
                int F2 = 20 * F1;
                int F3 =  E3 - F2;
                T2.setText(String.valueOf("20="+F1));

                int G1 = F3 / 10;
                int G2 = 10 * G1;
                int G3 =  F3 - G2;
                T1.setText(String.valueOf("10="+G1));

                int H1 = G3 / 5;
                int H2 = 5 * H1;
                int H3 =  G3 - H2 ;
                T5.setText(String.valueOf("5="+H1));

                int I1 = H3 / 1;
                P1.setText(String.valueOf("1="+I1));
            }
        });
    }
}