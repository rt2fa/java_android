package com.example.rt2fa.lapplicationduchef;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText opeA;
    // déclarer un EditText
    private EditText opeB;
    private TextView resultCalcul;// déclarer un TextView
    // déclarer quatre radioButton
    private RadioButton opPlus;
    private RadioButton opMoins;
    private RadioButton opCross;
    private RadioButton opSlash;
    private ImageView kebab;

    double nbA, nbB, resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opeA = (EditText) findViewById(R.id.editOpA);
        opeB = (EditText) findViewById(R.id.editOpB);
        resultCalcul = (TextView) findViewById(R.id.textResult);
        opPlus = (RadioButton) findViewById(R.id.rBPlus);
        opMoins = (RadioButton) findViewById(R.id.rbMoins);
        opCross = (RadioButton) findViewById(R.id.rBCross);
        opSlash = (RadioButton) findViewById(R.id.rbSlash);
        kebab = (ImageView) findViewById(R.id.imageView2);

        opPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbA = Double.parseDouble(opeA.getText().toString());
                nbB = Double.parseDouble(opeB.getText().toString());
                resultat = nbA + nbB;
                resultCalcul.setText(Double.toString(resultat));
            }
        });
        opMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbA = Double.parseDouble(opeA.getText().toString());
                nbB = Double.parseDouble(opeB.getText().toString());
                resultat = nbA - nbB;
                resultCalcul.setText(Double.toString(resultat));
            }
        });
        opCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbA = Double.parseDouble(opeA.getText().toString());
                nbB = Double.parseDouble(opeB.getText().toString());
                resultat = nbA * nbB;
                resultCalcul.setText(Double.toString(resultat));
            }
        });
        opSlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbA = Double.parseDouble(opeA.getText().toString());
                nbB = Double.parseDouble(opeB.getText().toString());
                if (nbB == 0) {
                    kebab.setVisibility(View.VISIBLE);
                }
                resultat = nbA / nbB;
                resultCalcul.setText(Double.toString(resultat));
            }
        });
    }
}
