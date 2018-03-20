package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Jondis extends Activity{
TextView tvJondis,tvJondis1,tvJondis2,tvJondis3,tvJondis4,tvJondis5,tvJondis6,tvJondis7,tvJondis8,tvJondis9,tvJondis10,tvJondis11;
Typeface font;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jondis);
		
		tvJondis=(TextView)findViewById(R.id.tv_jondis);
		tvJondis1=(TextView)findViewById(R.id.tv_jondis1);
		tvJondis2=(TextView)findViewById(R.id.tv_jondis2);
		tvJondis3=(TextView)findViewById(R.id.tv_jondis3);
		tvJondis4=(TextView)findViewById(R.id.tv_jondis4);
		tvJondis5=(TextView)findViewById(R.id.tv_jondis5);
		tvJondis6=(TextView)findViewById(R.id.tv_jondis6);
		tvJondis7=(TextView)findViewById(R.id.tv_jondis7);
		tvJondis8=(TextView)findViewById(R.id.tv_jondis8);
		tvJondis9=(TextView)findViewById(R.id.tv_jondis9);
		tvJondis10=(TextView)findViewById(R.id.tv_jondis10);
		tvJondis11=(TextView)findViewById(R.id.tv_jondis11);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvJondis.setTypeface(font);
		tvJondis1.setTypeface(font);
		tvJondis2.setTypeface(font);
		tvJondis3.setTypeface(font);
		tvJondis4.setTypeface(font);
		tvJondis5.setTypeface(font);
		tvJondis6.setTypeface(font);
		tvJondis7.setTypeface(font);
		tvJondis8.setTypeface(font);
		tvJondis9.setTypeface(font);
		tvJondis10.setTypeface(font);
		tvJondis11.setTypeface(font);
		
	}
}
