package com.example.a1laba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    Button sum;
    Button sub;
    Button mul;
    Button div;
    Button sin;
    Button cos;
    Button sqrt;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        sum = (Button) findViewById(R.id.sum);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        sqrt = (Button) findViewById(R.id.sqrt);
        exit = (Button) findViewById(R.id.exit);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                switch (view.getId()) {

                    case R.id.sum:
                    {
                        EditText el1 = (EditText) findViewById(R.id.number1);
                        EditText el2 = (EditText) findViewById(R.id.number2);
                        TextView resText = (TextView) findViewById(R.id.result);

                        float number1 = Float.parseFloat(el1.getText().toString());
                        float number2 = Float.parseFloat(el2.getText().toString());
                        float resSum = number1 + number2;
                        resText.setText(Float.toString(resSum));
                    }
                        break;

                    case R.id.sub:
                    {
                        EditText el1 = (EditText) findViewById(R.id.number1);
                        EditText el2 = (EditText) findViewById(R.id.number2);
                        TextView resText = (TextView) findViewById(R.id.result);

                        float number1 = Float.parseFloat(el1.getText().toString());
                        float number2 = Float.parseFloat(el2.getText().toString());
                        float resSub = number1 - number2;
                        resText.setText(Float.toString(resSub));
                    }
                        break;

                    case R.id.mul:
                    {
                        EditText el1 = (EditText) findViewById(R.id.number1);
                        EditText el2 = (EditText) findViewById(R.id.number2);
                        TextView resText = (TextView) findViewById(R.id.result);

                        float number1 = Float.parseFloat(el1.getText().toString());
                        float number2 = Float.parseFloat(el2.getText().toString());
                        float resMul = number1 * number2;
                        resText.setText(Float.toString(resMul));
                    }
                    break;

                    case R.id.div:
                    {
                        EditText el1 = (EditText) findViewById(R.id.number1);
                        EditText el2 = (EditText) findViewById(R.id.number2);
                        TextView resText = (TextView) findViewById(R.id.result);

                        float number1 = Float.parseFloat(el1.getText().toString());
                        float number2 = Float.parseFloat(el2.getText().toString());
                        float resDiv = number1 / number2;
                        resText.setText(Float.toString(resDiv));
                    }
                    break;

                    case R.id.sin:
                    {
                        TextView resText = (TextView) findViewById(R.id.result);

                        float result = Float.parseFloat(resText.getText().toString());

                        double sinus = Math.sin(result);
                        resText.setText(Double.toString(sinus));
                    }
                    break;

                    case R.id.cos:
                    {
                        TextView resText = (TextView) findViewById(R.id.result);

                        float result = Float.parseFloat(resText.getText().toString());

                        double cos = Math.cos(result);
                        resText.setText(Double.toString(cos));
                    }
                    break;

                    case R.id.sqrt:
                    {
                        TextView resText = (TextView) findViewById(R.id.result);

                        float result = Float.parseFloat(resText.getText().toString());

                        double sqrt = Math.sqrt(result);
                        resText.setText(Double.toString(sqrt));
                    }
                    break;

                    case R.id.exit:
                    {
                        finish();
                    }
                    break;
                }
            }
        };

        sum.setOnClickListener(onClickListener);
        sub.setOnClickListener(onClickListener);
        mul.setOnClickListener(onClickListener);
        div.setOnClickListener(onClickListener);
        sin.setOnClickListener(onClickListener);
        cos.setOnClickListener(onClickListener);
        sqrt.setOnClickListener(onClickListener);
        exit.setOnClickListener(onClickListener);
    }


       // public void onButtonClick (View v){
       // EditText el1 = (EditText) findViewById(R.id.number1);
       // EditText el2 = (EditText) findViewById(R.id.number2);
        //TextView resText = (TextView) findViewById(R.id.result);

        //int number1 = Integer.parseInt(el1.getText().toString());
       // int number2 = Integer.parseInt(el2.getText().toString());
        //int resSum = number1 + number2;
        //resText.setText(Integer.toString(resSum));
       // }

}
