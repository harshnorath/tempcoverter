package com.example.tempcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt, odeg;
    EditText edit;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textview);
        odeg = findViewById(R.id.deg);
        edit = findViewById(R.id.edittext);
        btn1 = findViewById(R.id.ctf);
        btn2 = findViewById(R.id.ftc);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(edit.getText().toString());
               double odeg0 = (temp*1.8)+32;
                odeg.setText(String.valueOf(odeg0));
                if(edit.length()==0){
                    Toast.makeText(MainActivity.this, "Fill the tempreature details", Toast.LENGTH_LONG).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(edit.getText().toString());
                double odeg0 = (temp-31)/1.8;
                odeg.setText(String.valueOf(odeg0));
            }
        });
    }
}