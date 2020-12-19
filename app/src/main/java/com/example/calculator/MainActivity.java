package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnsub,btnmul,btndiv,btnroot,btnfact,btnequal,btnpercent,btnclr,btndot;
    TextView calculator_text,calculator_text2;
    double val_1=0,val_2=0;
    boolean addition, subtraction, division, multiplication,decimal,factorial,percentage,root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnadd = findViewById(R.id.buttonadd);
        btnsub = findViewById(R.id.buttonsub);
        btnmul = findViewById(R.id.buttonmul);
        btndiv = findViewById(R.id.buttondiv);
        btnroot = findViewById(R.id.buttonsqroot);
        btnfact = findViewById(R.id.buttonfact);
        btnequal = findViewById(R.id.buttonequal);
        btnpercent = findViewById(R.id.buttonpercent);
        btnclr = findViewById(R.id.button_c);
        btndot = findViewById(R.id.buttondot);
        calculator_text=(TextView)findViewById(R.id.textView);
        calculator_text2=(TextView)findViewById(R.id.textView2);
        calculator_text.setText("");
        calculator_text2.setText("");

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText(calculator_text.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText(calculator_text.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText(calculator_text.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText(calculator_text.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText(calculator_text.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText(calculator_text.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText(calculator_text.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText(calculator_text.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText(calculator_text.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText(calculator_text.getText()+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = calculator_text.getText().toString();
                for (int i = 0; i < s.length(); i++)
                {
                    if (s.length()!=0 && s.contains(".")==true)
                    {
                        btnadd.setEnabled(false);
                    } else
                        {
                        calculator_text.setText(calculator_text.getText() + ".");
                        decimal = false;
                    }
                }
            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator_text.setText("");
                calculator_text2.setText("");
                val_1=0;
                val_2=0;
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if( calculator_text.getText()==""){
                   btnadd.setEnabled(false);
               }
               else{
                   val_1=Double.parseDouble(calculator_text.getText()+"");
                   addition=true;
                   calculator_text.setText("");
               }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( calculator_text.getText()==""){
                    btnadd.setEnabled(false);
                }
                else{
                    val_1=Double.parseDouble(calculator_text.getText()+"");
                    subtraction=true;
                    calculator_text.setText("");
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( calculator_text.getText()==""){
                    btnadd.setEnabled(false);
                }
                else{
                    val_1=Double.parseDouble(calculator_text.getText()+"");
                    multiplication=true;
                    calculator_text.setText("");
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( calculator_text.getText()==""){
                    btnadd.setEnabled(false);
                }
                else{
                    val_1=Double.parseDouble(calculator_text.getText()+"");
                    division=true;
                    calculator_text.setText("");
                }
            }
        });
        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( calculator_text.getText()==""){
                    btnadd.setEnabled(false);
                }
                else{
                    val_1=Double.parseDouble(calculator_text.getText()+"");
                    percentage=true;
                    calculator_text.setText("");
                }
            }
        });

        btnroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( calculator_text.getText()==""){
                    btnadd.setEnabled(false);
                }
                else{
                     val_1=Double.parseDouble(calculator_text.getText()+"");
                     double v= Math.sqrt(val_1);
                    root=true;


                    calculator_text2.setText(Double.toString(v));
                    calculator_text.setText(calculator_text2.getText()+"");
                }
            }
        });
        btnfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( calculator_text.getText()==""){
                    btnadd.setEnabled(false);
                }

                else {
                    try {
                        int val_3 = Integer.parseInt(calculator_text.getText() + "");
                        int fact = 1;
                        if (val_3 == 0)
                        {
                            fact = 1;
                        } else
                            {
                            for (int i = 1; i <= val_3; i++)
                            {
                                fact = fact * i;
                            }
                        }
                        factorial = true;


                        calculator_text2.setText(Integer.toString(fact));
                        calculator_text.setText(calculator_text2.getText() + "");

                    }
                    catch (Exception e){
                        calculator_text2.setText("Error :(");
                    }
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val_2 = Double.parseDouble(calculator_text.getText()+"");
                if(addition){
                    calculator_text2.setText(Double.toString(val_1 + val_2));
                    calculator_text.setText(calculator_text2.getText()+"");
                    addition=false;
                }
                else if(subtraction){
                    calculator_text2.setText(Double.toString(val_1 - val_2));
                    calculator_text.setText(calculator_text2.getText()+"");
                    subtraction=false;
                }
                else if(multiplication){
                    calculator_text2.setText(Double.toString(val_1 * val_2));
                    calculator_text.setText(calculator_text2.getText()+"");
                    multiplication=false;
                }
                else if(division){
                    try{
                        calculator_text2.setText(Double.toString(val_1 / val_2));
                        calculator_text.setText(calculator_text2.getText()+"");
                        division=false;

                    }
                    catch (Exception e){
                        calculator_text2.setText("Error :(");
                    }

                }
                else if(percentage){
                    calculator_text2.setText(Double.toString(val_1 * val_2 / 100));
                    calculator_text.setText(calculator_text2.getText()+"");
                    percentage=false;

                }

            }
        });



        calculator_text2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (calculator_text2.getText().toString().length() > 15){
                    calculator_text2.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                }
                else if (calculator_text2.getText().toString().length() > 8){
                    calculator_text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 60);
                }
                else {
                    calculator_text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 80);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });




    }
}