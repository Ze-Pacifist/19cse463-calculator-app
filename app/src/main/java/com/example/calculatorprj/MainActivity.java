package com.example.calculatorprj;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.ui.AppBarConfiguration;
import com.example.calculatorprj.databinding.ActivityMainBinding;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public EditText e1, e2;
    TextView t1;
    int num1, num2;

    public boolean getNumbers() {
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t1 = (TextView) findViewById(R.id.result);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if(s1.equals("Please enter input 1") && s2.equals(null))
        {
            String result = "Please enter input 2";
            e2.setText(result);
            return false;
        }
        if(s1.equals(null) && s2.equals("Please enter input 2"))
        {
            String result = "Please enter input 1";
            e1.setText(result);
            return false;
        }
        if(s1.equals("Please enter input 1") || s2.equals("Please enter input 2"))
        {
            return false;
        }

        if((!s1.equals(null) && s2.equals(null))|| (!s1.equals("") && s2.equals("")) ){

            String result = "Please enter input 2";

            e2.setText(result);
            return false;
        }
        if((s1.equals(null) && !s2.equals(null))|| (s1.equals("") && !s2.equals("")) ){
            //checkAndClear();
            String result = "Please enter input 1";
            e1.setText(result);
            return false;
        }
        if((s1.equals(null) && s2.equals(null))|| (s1.equals("") && s2.equals("")) ){
            //checkAndClear();
            String result1 = "Please enter input 1";
            e1.setText(result1);
            String result2 = "Please enter input 2";
            e2.setText(result2);
            return false;
        }

        else {
            // converting string to int.
            num1 = Integer.parseInt(s1);

            // converting string to int.
            num2 = Integer.parseInt(s2);


        }

        return true;
    }

    public void clearTextNum1(View v) {

        // get the input numbers
        e1.getText().clear();
    }

    public void clearTextNum2(View v) {

        // get the input numbers
        e2.getText().clear();
    }

    public void doSum(View v) {
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }

    }


    public void doPow(View v) {

        if (getNumbers()) {
            double sum = Math.pow(num1, num2);
            t1.setText(Double.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }
    public void doSub(View v) {

        if (getNumbers()) {
            int sum = num1 - num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }

    public void doMul(View v) {

        if (getNumbers()) {
            int sum = num1 * num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }

    public void doDiv(View v) {

        if (getNumbers()) {
            double sum = num1 / (num2 * 1.0);
            t1.setText(Double.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }

    public void doMod(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            double sum = num1 % num2;
            t1.setText(Double.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.num1);
        // defining the edit text 2 to e2
        e2 = (EditText) findViewById(R.id.num2);
    }
}
