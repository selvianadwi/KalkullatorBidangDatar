package com.example.kalkullatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    EditText EditText, EditText2;
    TextView OutputHasil,OutputHasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText = (EditText) findViewById(R.id.EditText);
        EditText2= (EditText)findViewById(R.id.EditText2);
        OutputHasil=(TextView)findViewById(R.id.OutputHasil);
        OutputHasil2=(TextView)findViewById(R.id.OutputHasil2);
    }

    //Button's Code
    public void Psg(View view) {
        //Luas
        int inp1 = Integer.parseInt(EditText.getText().toString());
        int inp2 = Integer.parseInt(EditText2.getText().toString());
        Integer hslL=inp1*inp2;
        OutputHasil.setText(hslL.toString());
        //keliling
        int inpK =Integer.parseInt(EditText.getText().toString());
        Integer hslK= 4*inp1;
        OutputHasil.setText(hslK.toString());

        //Output
        OutputHasil.setText("Luas = " + hslL );
        OutputHasil2.setText("Keliling = " + hslK);
    }

    public void Sgt(View view) {
        //Luas
        double inp1 = Double.parseDouble(EditText.getText().toString());
        double inp2 = Double.parseDouble(EditText2.getText().toString());
        Double hslL = (inp1*inp2)/2;
        OutputHasil.setText(hslL.toString());

        //Keliling
        int inpK=Integer.parseInt(EditText.getText().toString());
        Double hslK = 3*(inp1);
        OutputHasil.setText(hslK.toString());

        //Output
        OutputHasil.setText("Luas = " + hslL);
        OutputHasil2.setText("Keliling = " + hslK);
    }

    public void Ling(View view) {
        //Luas
        double inp1=Double.parseDouble(EditText.getText().toString());
        Double hslL = 22*inp1*inp1/7;
        OutputHasil.setText(hslL.toString());

        //Keliling
        double inpK=Double.parseDouble(EditText.getText().toString());
        Double hslK= 22*(inp1*2)/7;
        OutputHasil.setText(hslK.toString());

        //Output
        OutputHasil.setText("Luas = " + hslL );
        OutputHasil2.setText("Keliling = " + hslK);
    }
}