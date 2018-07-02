package com.example.usuario.calculadora;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     Button []botones= new Button[10];
     int idBotones[]={R.id.BTN0,R.id.BTN1,R.id.BTN2,R.id.BTN3,R.id.BTN4,R.id.BTN5,R.id.BTN6,R.id.BTN7,R.id.BTN8,R.id.BTN9};

    TextView TVDisplay;
    String numeros="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVDisplay=findViewById(R.id.dispay);
       // btn0=findViewById(R.id.BTN0);
       // btn0.setOnClickListener(this);

        //btn1=findViewById(R.id.BTN1);
        //btn1.setOnClickListener(this);

        //btn2=findViewById(R.id.BTN2);
        //btn2.setOnClickListener(this);

        //btn3=findViewById(R.id.BTN3);
        //btn3.setOnClickListener(this);

        //btn4=findViewById(R.id.BTN4);
        //btn4.setOnClickListener(this);

        //btn5=findViewById(R.id.BTN5);
        //btn6=findViewById(R.id.BTN6);
        //btn7=findViewById(R.id.BTN7);
        //btn8=findViewById(R.id.BTN8);
        //btn9=findViewById(R.id.BTN9);;

        for (int i=0;i<=9;i++)
        {
            botones[i]=findViewById(idBotones[i]);
            final int finalI = i;
            botones[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    numeros+=botones[finalI].getText().toString();
                    TVDisplay.setText(numeros);
                }
            });
        }

    }

   /* @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.BTN0:

                numeros+=btn0.getText().toString();
                TVDisplay.setText(numeros);
                break;
            case R.id.BTN1:
                numeros+=btn1.getText().toString();
                TVDisplay.setText(numeros);

                break;
            case R.id.BTN2:
                numeros+=btn2.getText().toString();
                TVDisplay.setText(numeros);

                break;
            case R.id.BTN3:
                numeros+=btn3.getText().toString();
                TVDisplay.setText(numeros);

                break;
            case R.id.BTN4:
                numeros+=btn4.getText().toString();
                TVDisplay.setText(numeros);

                break;
        }
    }*/
}
