package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class UccoRoktoChap extends Activity{
TextView uccoroktoChap,uccoroktoChap1,uccoroktoChap2,uccoroktoChap3,uccoroktoChap4,uccoroktoChap5,uccoroktoChap6,uccoroktoChap7,uccoroktoChap8;
Typeface font;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ucco_roktochap);
		
		uccoroktoChap=(TextView)findViewById(R.id.tv_uccoRoktochap);
		uccoroktoChap1=(TextView)findViewById(R.id.tv_uccoRoktochap1);
		uccoroktoChap2=(TextView)findViewById(R.id.tv_uccoRoktochap2);
		uccoroktoChap3=(TextView)findViewById(R.id.tv_uccoRoktochap3);
		uccoroktoChap4=(TextView)findViewById(R.id.tv_uccoRoktochap4);
		uccoroktoChap5=(TextView)findViewById(R.id.tv_uccoRoktochap5);
		uccoroktoChap6=(TextView)findViewById(R.id.tv_uccoRoktochap6);
		uccoroktoChap7=(TextView)findViewById(R.id.tv_uccoRoktochap7);
		uccoroktoChap8=(TextView)findViewById(R.id.tv_uccoRoktochap8);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		uccoroktoChap.setTypeface(font);
		uccoroktoChap1.setTypeface(font);
		uccoroktoChap2.setTypeface(font);
		uccoroktoChap3.setTypeface(font);
		uccoroktoChap4.setTypeface(font);
		uccoroktoChap5.setTypeface(font);
		uccoroktoChap6.setTypeface(font);
		uccoroktoChap7.setTypeface(font);
		uccoroktoChap8.setTypeface(font);
		
	}
}
