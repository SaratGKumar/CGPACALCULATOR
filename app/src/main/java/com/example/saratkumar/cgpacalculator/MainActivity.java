package com.example.saratkumar.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View view)
    {
        EditText s1=(EditText) findViewById(R.id.sem1);
        EditText s2=(EditText) findViewById(R.id.sem2);
        EditText s3=(EditText) findViewById(R.id.sem3);
        EditText s4=(EditText) findViewById(R.id.sem4);
        EditText s5=(EditText) findViewById(R.id.sem5);
        EditText s6=(EditText) findViewById(R.id.sem6);
        EditText s7=(EditText) findViewById(R.id.sem7);
        EditText s8=(EditText) findViewById(R.id.sem8);
        EditText c1=(EditText) findViewById(R.id.cre1);
        EditText c2=(EditText) findViewById(R.id.cre2);
        EditText c3=(EditText) findViewById(R.id.cre3);
        EditText c4=(EditText) findViewById(R.id.cre4);
        EditText c5=(EditText) findViewById(R.id.cre5);
        EditText c6=(EditText) findViewById(R.id.cre6);
        EditText c7=(EditText) findViewById(R.id.cre7);
        EditText c8=(EditText) findViewById(R.id.cre8);
        String no11=s1.getText().toString();
        float se1=Float.parseFloat(no11);
        String no12=c1.getText().toString();
        int cr1=Integer.parseInt(no12);
        String no21=s2.getText().toString();
        float se2=Float.parseFloat(no21);
        String no22=c2.getText().toString();
        int cr2=Integer.parseInt(no22);
        String no31=s3.getText().toString();
        float se3=Float.parseFloat(no31);
        String no32=c3.getText().toString();
        int cr3=Integer.parseInt(no32);
        String no41=s4.getText().toString();
        float se4=Float.parseFloat(no41);
        String no42=c4.getText().toString();
        int cr4=Integer.parseInt(no42);
        String no51=s5.getText().toString();
        float se5=Float.parseFloat(no51);
        String no52=c5.getText().toString();
        int cr5=Integer.parseInt(no52);
        String no61=s6.getText().toString();
        float se6=Float.parseFloat(no61);
        String no62=c6.getText().toString();
        int cr6=Integer.parseInt(no62);
        String no71=s7.getText().toString();
        float se7=Float.parseFloat(no71);
        String no72=c7.getText().toString();
        int cr7=Integer.parseInt(no72);
        String no81=s8.getText().toString();
        float se8=Float.parseFloat(no81);
        String no82=c8.getText().toString();
        int cr8=Integer.parseInt(no82);
        float cgpa=(se1*cr1+se2*cr2+se3*cr3+se4*cr4+se5*cr5+se6*cr6+se7*cr7+se8*cr8)/(cr1+cr2+cr3+cr4+cr5+cr6+cr7+cr8);
        TextView quantityTextView = (TextView) findViewById(R.id.CGPA);
        DecimalFormat df = new DecimalFormat("#.0");
        quantityTextView.setText("" + cgpa);
    }

}
