package com.example.swagata.calswagata;

import android.os.CancellationSignal;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.swagata.calswagata.R.id.cancel;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button plusButton, equalsButton,subButton,mulButton,divButton,cancelButton,deleteButton,backspace;
    private int firstNumberGroup;
    private int secondNumberGroup;
    String calculatorCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_view);
        textView.setText("");

        plusButton = (Button) findViewById(R.id.plus);
        equalsButton = (Button) findViewById(R.id.equals);
        subButton = (Button) findViewById(R.id.sub);
        mulButton = (Button) findViewById(R.id.mul);
        divButton = (Button) findViewById(R.id.div);
        cancelButton = (Button) findViewById(R.id.cancel);
        deleteButton = (Button) findViewById(R.id.delete);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().toString().isEmpty()){
                }else {
                    firstNumberGroup = Integer.parseInt(textView.getText().toString());
                    textView.setText("");
                    calculatorCase = "ADD";
                }
            }
        });
        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().toString().isEmpty()){
                }else {
                    secondNumberGroup = Integer.parseInt(textView.getText().toString());
                    switch (calculatorCase) {
                        case "ADD":
                            int add = firstNumberGroup + secondNumberGroup;
                            textView.setText("" + add);
                            firstNumberGroup = add;
                            secondNumberGroup = 0;
                            break;
                        case "SUB":
                            int sub = firstNumberGroup - secondNumberGroup;
                            textView.setText("" + sub);
                            firstNumberGroup = sub;
                            secondNumberGroup = 0;
                            break;
                        case "MUL":
                            int mul = firstNumberGroup * secondNumberGroup;
                            textView.setText("" + mul);
                            firstNumberGroup = mul;
                            secondNumberGroup = 0;
                            break;
                        case "DIV":
                            int div = firstNumberGroup / secondNumberGroup;
                            textView.setText("" + div);
                            firstNumberGroup = div;
                            secondNumberGroup = 0;
                            break;
                    }
                }
            }
        });
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().toString().isEmpty()){
                }else {
                    firstNumberGroup = Integer.parseInt(textView.getText().toString());
                    textView.setText("");
                    secondNumberGroup = 0;
                    calculatorCase = "SUB";
                }
            }

        });
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().toString().isEmpty()){
                }else {
                    firstNumberGroup = Integer.parseInt(textView.getText().toString());
                    textView.setText("");
                    secondNumberGroup = 0;
                    calculatorCase = "MUL";
                }
            }

        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().toString().isEmpty()){
                }else {
                    firstNumberGroup = Integer.parseInt(textView.getText().toString());
                    textView.setText("");
                    secondNumberGroup = 0;
                    calculatorCase = "DIV";
                }
            }

        });
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                firstNumberGroup = 0;
                secondNumberGroup = 0;
            }
        });
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().toString().isEmpty()){
                }else {
                    String text = textView.getText().toString();
                    if (text.isEmpty()) {

                    } else if (text.length() == 1) {
                        firstNumberGroup = 0;
                        textView.setText("");
                    } else {
                        String newText = text.substring(0, text.length() - 1);
                        textView.setText(newText);
                        firstNumberGroup = Integer.parseInt(newText);
                    }
                    secondNumberGroup = 0;
                }
            }
        });
    }

    public void numberOnClick(View view) {
        TextView buttonText = (TextView) view;
        if (textView.getText().equals("")) {
            textView.setText(buttonText.getText());
        }else {
            textView.append(buttonText.getText());
        }
    }
}


