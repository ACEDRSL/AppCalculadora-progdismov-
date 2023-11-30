package com.example.appcalculadora;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, sumar, restar, multiplicar, dividir, igual, borrar;
    TextView input, resultado;
    float number1, number2;
    boolean addition = false, subtraction = false, multiplication = false, division = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cero = findViewById(R.id.zero);
        uno = findViewById(R.id.one);
        dos = findViewById(R.id.two);
        tres = findViewById(R.id.three);
        cuatro = findViewById(R.id.four);
        cinco = findViewById(R.id.five);
        seis = findViewById(R.id.six);
        siete = findViewById(R.id.seven);
        ocho = findViewById(R.id.eight);
        nueve = findViewById(R.id.nine);
        sumar = findViewById(R.id.add);
        restar = findViewById(R.id.subtract);
        multiplicar = findViewById(R.id.multiply);
        dividir = findViewById(R.id.divide);
        igual = findViewById(R.id.equal);
        borrar = findViewById(R.id.clear);
        input = findViewById(R.id.input);
        resultado = findViewById(R.id.result);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "9");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                result.setText("");
                addition = false;
                subtraction = false;
                multiplication = false;
                division = false;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(input.getText().toString());
                input.setText("");
                addition = true;
                subtraction = false;
                multiplication = false;
                division = false;
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(input.getText().toString());
                input.setText("");
                addition = false;
                subtraction = true;
                multiplication = false;
                division = false;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(input.getText().toString());
                input.setText("");
                addition = false;
                subtraction = false;
                multiplication = true;
                division = false;
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Float.parseFloat(input.getText().toString());
                input.setText("");
                addition = false;
                subtraction = false;
                multiplication = false;
                division = true;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Float.parseFloat(input.getText().toString());
                if (addition) {
                    result.setText(String.valueOf(number1 + number2));
                }
                if (subtraction) {
                    result.setText(String.valueOf(number1 - number2));
                }
                if (multiplication) {
                    result.setText(String.valueOf(number1 * number2));
                }
                if (division) {
                    result.setText(String.valueOf(number1 / number2));
                }
            }
        });
    }
}