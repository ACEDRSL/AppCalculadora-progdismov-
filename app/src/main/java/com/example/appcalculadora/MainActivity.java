package com.example.appcalculadora;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, sumar, restar, multiplicar, dividir, igual, borrar;
    TextView  resultado;
    float number1, number2;
    boolean addition = false, subtraction = false, multiplication = false, division = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cero = findViewById(R.id.btncero);
        uno = findViewById(R.id.btn1);
        dos = findViewById(R.id.btn2);
        tres = findViewById(R.id.btn3);
        cuatro = findViewById(R.id.btn4);
        cinco = findViewById(R.id.btn5);
        seis = findViewById(R.id.btn6);
        siete = findViewById(R.id.btn7);
        ocho = findViewById(R.id.btn8);
        nueve = findViewById(R.id.btn9);
        sumar = findViewById(R.id.btnmas);
        restar = findViewById(R.id.btnmenos);
        multiplicar = findViewById(R.id.btnmult);
        dividir = findViewById(R.id.btndividir);
        igual = findViewById(R.id.btnigual);
        borrar = findViewById(R.id.btnborrar);
        resultado = findViewById(R.id.resultado);

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + "0");
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + "1");
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + "2");
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + "3");
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + "4");
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + "5");
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + "6");
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + "7");
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + "8");
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + "9");
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("");
                resultado.setText("");
                addition = false;
                subtraction = false;
                multiplication = false;
                division = false;
            }
        });

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(resultado.getText().toString());
                resultado.setText("");
                addition = true;
                subtraction = false;
                multiplication = false;
                division = false;
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(resultado.getText().toString());
                resultado.setText("");
                addition = false;
                subtraction = true;
                multiplication = false;
                division = false;
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(resultado.getText().toString());
                resultado.setText("");
                addition = false;
                subtraction = false;
                multiplication = true;
                division = false;
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(resultado.getText().toString());
                resultado.setText("");
                addition = false;
                subtraction = false;
                multiplication = false;
                division = true;
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Float.parseFloat(resultado.getText().toString());
                if (addition) {
                    resultado.setText(String.valueOf(number1 + number2));
                }
                if (subtraction) {
                    resultado.setText(String.valueOf(number1 - number2));
                }
                if (multiplication) {
                    resultado.setText(String.valueOf(number1 * number2));
                }
                if (division) {
                    resultado.setText(String.valueOf(number1 / number2));
                }
            }
        });
    }
}