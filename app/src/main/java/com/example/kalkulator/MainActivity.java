package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private static final char penambahan = '+';
    private static final char pengurangan= '-';
    private static final char perkalian = '*';
    private static final char pembagian = '/';
    private static final char persen = '%';

    private char currentsymbol ;

    private double firstvalue = Double.NaN;
    private double secondvalue;

    private EditText tampilaninput;
    private TextView tampilanoutput;

    private DecimalFormat df;
    private MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttondot,
            buttonkali,buttonkurang,buttontambah,buttonbagi,buttonpersen,buttonhapus,buttonoff,buttonequals;

    public void kalkulator(){
        if (!Double.isNaN(firstvalue)){
            secondvalue = Double.parseDouble(tampilaninput.getText().toString());
            tampilaninput.setText(null);
            if (currentsymbol == penambahan){
                firstvalue = this.firstvalue + secondvalue;
            } else if (currentsymbol == pengurangan) {
                firstvalue = this.firstvalue - secondvalue;
            } else if (currentsymbol == perkalian) {
                firstvalue = this.firstvalue * secondvalue;
            } else if (currentsymbol == pembagian) {
                firstvalue = this.firstvalue / secondvalue;
            } else if (currentsymbol == persen) {
                firstvalue = this.firstvalue % secondvalue;

            }

        }
        else {
            try {
                firstvalue = Double.parseDouble(tampilaninput.getText().toString());
            }catch (Exception e) {

            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        df = new DecimalFormat("#.###########");
        tampilaninput = findViewById(R.id.masukan1);
        tampilanoutput = findViewById(R.id.keluaran1);

        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);

        buttontambah = findViewById(R.id.btnTambah);
        buttonbagi = findViewById(R.id.btnBagi);
        buttonkali = findViewById(R.id.btnKali);
        buttonkurang = findViewById(R.id.btnKurang);
        buttonpersen = findViewById(R.id.persen);

        buttonoff = findViewById(R.id.off);
        buttonequals = findViewById(R.id.equals);
        buttonhapus = findViewById(R.id.btnHapus);
        buttondot = findViewById(R.id.btnTitik);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText().toString());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText()+"8");
            }

        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText()+"9");
            }
        });

        buttontambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kalkulator();
                currentsymbol = penambahan;
                tampilanoutput.setText(df.format(firstvalue)+"+");
                tampilaninput.setText(null);
            }
        });
        buttonkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kalkulator();
                currentsymbol = pengurangan;
                tampilanoutput.setText(df.format(firstvalue)+"-");
                tampilaninput.setText(null);
            }
        });
        buttonkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kalkulator();
                currentsymbol = perkalian;
                tampilanoutput.setText(df.format(firstvalue)+"x");
                tampilaninput.setText(null);
            }
        });

        buttonbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kalkulator();
                currentsymbol = pembagian;
                tampilanoutput.setText(df.format(firstvalue)+"/");
                tampilaninput.setText(null);
            }
        });

        buttonpersen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kalkulator();
                currentsymbol = persen;
                tampilanoutput.setText(df.format(firstvalue)+"%");
                tampilaninput.setText(null);
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilaninput.setText(tampilaninput.getText()+".");
            }
        });
        buttonhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tampilaninput.getText().length() > 0){
                    CharSequence currenttext = tampilaninput.getText();
                }
                else {
                    firstvalue = Double.NaN;
                    secondvalue = Double.NaN;
                    tampilaninput.setText("");
                    tampilanoutput.setText("");

                }
            }
        });

        buttonoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kalkulator();
               tampilanoutput.setText(df.format(firstvalue));
               firstvalue = Double.NaN;
               currentsymbol = '0';
            }
        });
    }
}