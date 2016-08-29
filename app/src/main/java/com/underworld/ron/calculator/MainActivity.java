package com.underworld.ron.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0 , button1 , button2 , button3, button4  , button5, button6, button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
    buttonMul , button10 , buttonC , buttonEqual;

    EditText edt1 ;
    float mValueOne , mValueTwo ;

    boolean MAddition ,  mSubtract , mMultiplication ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //map to respective buttons

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonEqual = (Button) findViewById(R.id.buttondiv);
        buttonMul = (Button) findViewById(R.id.buttondiv);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        edt1 = (EditText) findViewById(R.id.edt1);


//button listeners

//button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+ "1");

            }
        });

//button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "2");
            }
        });

//button3

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "3");
            }
        });

//button4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+ "4");
            }
        });

//button5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.setText() + "5");
            }
        });

//button6
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"6");
            }
        });

//button7

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+ "7");
            }
        });

//button8

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+ "9");
            }
        });


//button9
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"10");
            }
        });

//button0
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "0");
            }
        });



//button add

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1 == null){
                    edt1.setText("");
                }
                else {
                    mValueOne = Float.parseFloat(edt1.getText()+ "");
                    mAddition = True;
                    edt1.setText(null);
                }
            }
        });

//subtract button

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne  = Float.parseFloat(edt1.getText() + "");
                mSubtract = true;
                edt1.setText(null);

            }
        });


//multiplication button

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(edt1.getText() +"");
                mMultiplication = true;
                edt1.setText(null);
            }
        });
    }

}
