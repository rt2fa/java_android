package com.example.rt2fa.lapplicationduchef;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button boutonCalcul; // déclarer un Button dans le java
    private EditText opeA;
    // déclarer un EditText
    private EditText opeB;
    private TextView resultCalcul;// déclarer un TextView
    // déclarer quatre radioButton
    private RadioButton opPlus;
    private RadioButton opMoins;
    private RadioButton opCross;
    private RadioButton opSlash;

    double nbA, nbB, resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boutonCalcul = (Button) findViewById(R.id.bCalc);
        opeA = (EditText) findViewById(R.id.editOpA);
        opeB = (EditText) findViewById(R.id.editOpB);
        resultCalcul = (TextView) findViewById(R.id.textResult);
        opPlus = (RadioButton) findViewById(R.id.rBPlus);
        opMoins = (RadioButton) findViewById(R.id.rbMoins);
        opCross = (RadioButton) findViewById(R.id.rBCross);
        opSlash = (RadioButton) findViewById(R.id.rbSlash);

        boutonCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbA = Integer.parseInt(opeA.getText().toString());
                nbB = Integer.parseInt(opeB.getText().toString());
                if (opPlus.isChecked())
                    resultat = nbA + nbB;
                if (opMoins.isChecked())
                    resultat = nbA - nbB;
                if (opCross.isChecked())
                    resultat = nbA * nbB;
                if (opSlash.isChecked())
                    resultat = nbA / nbB;
                resultCalcul.setText(Double.toString(resultat));
            }
        });
    }
}
