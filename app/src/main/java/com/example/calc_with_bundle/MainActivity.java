package com.example.calc_with_bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    ViewDataBinding binding;

    private String totalChar = null;
    String incomChar = "0";
    double firstNumber = 0;
    double secondNumber = 0;
    double result = 0;




    TextView textViewResult = new TextView(this);
    Button button = new Button(this);


    public void NumberClicked(View view){
        incomChar =  button.getText().toString();
        totalChar = totalChar + incomChar;
        textViewResult.setText(totalChar);
    }

    public void Del(View view){
        incomChar =  button.getText().toString();
        totalChar = incomChar.substring(0, incomChar.length()-1);
        textViewResult.setText(totalChar);
    }

    public void AC(View view){
        incomChar = "0";
        totalChar = "0";
        firstNumber = 0;
        secondNumber = 0;
        textViewResult.setText(totalChar);
    }


    public void SignClicked(View view){
        do{
            switch (button.getText().toString()){
                case ("+"):
                    firstNumber = Double.parseDouble(textViewResult.getText().toString());
                    textViewResult.setText("0");
                    totalChar = "0";
                    secondNumber = Double.parseDouble(textViewResult.getText().toString());
                    result = firstNumber + secondNumber;
                    textViewResult.setText(""+result);
                    break;

                case ("-"):
                    firstNumber = Double.parseDouble(textViewResult.getText().toString());
                    textViewResult.setText("0");
                    totalChar = "0";
                    secondNumber = Double.parseDouble(textViewResult.getText().toString());
                    result = firstNumber - secondNumber;
                    textViewResult.setText(""+result);
                    break;

                case ("*"):
                    firstNumber = Double.parseDouble(textViewResult.getText().toString());
                    textViewResult.setText("0");
                    totalChar = "0";
                    secondNumber = Double.parseDouble(textViewResult.getText().toString());
                    result = firstNumber * secondNumber;
                    textViewResult.setText(""+result);
                    break;

                case ("/"):
                    firstNumber = Double.parseDouble(textViewResult.getText().toString());
                    textViewResult.setText("0");
                    totalChar = "0";
                    secondNumber = Double.parseDouble(textViewResult.getText().toString());
                    if (secondNumber == 0){
                        result = 0;
                    } else {
                        result = firstNumber / secondNumber;}

                    textViewResult.setText(""+result);
                    break;

            }


        }while (button.getText().toString().equals("="));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}