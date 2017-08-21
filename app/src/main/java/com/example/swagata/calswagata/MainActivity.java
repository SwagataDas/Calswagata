package com.example.swagata.calswagata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button plusButton, equalsButton,subButton,mulButton,divButton;
    private int firstNumberGroup;
    private int secondNumberGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_view);
        textView.setText("");

        plusButton = (Button) findViewById(R.id.plus);
        equalsButton = (Button) findViewById(R.id.plus);
        subButton = (Button) findViewById(R.id.sub);
        mulButon = (Button) findViewById(R.id.mul);
        divButon = (Button) findViewById(R.id.div);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumberGroup = Integer.parseInt(textView.getText().toString());
                textView.setText("");
            }
        });
        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNumberGroup = Integer.parseInt(textView.getText().toString());
                int add = firstNumberGroup + secondNumberGroup;
                textView.setText("" + add);
            }
        });
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNumberGroup = Integer.parseInt(textView.getText().toString());
                int subtraction = firstNumberGroup - secondNumberGroup;
                textView.setText("" +subtraction);
        }

        });
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNumberGroup = Integer.parseInt(textView.getText().toString());
                int multiplication = firstNumberGroup * secondNumberGroup;
                textView.setText("" +multiplication);

            }

        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNumberGroup = Integer.parseInt(textView.getText().toString());
                int division = firstNumberGroup / secondNumberGroup;
                textView.setText("" +division);
            }

        });

