package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Jokkha extends Activity{
	
	TextView tvJokkha,tvJokkha1,tvJokkha2,tvJokkha3,tvJokkha4,tvJokkha5,tvJokkha6,tvJokkha7,tvJokkha8,tvJokkha9,tvJokkha10;
	Typeface font;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.jokkha);
	
	tvJokkha=(TextView)findViewById(R.id.tv_jokkha);
	tvJokkha1=(TextView)findViewById(R.id.tv_jokkha1);
	tvJokkha2=(TextView)findViewById(R.id.tv_jokkha2);
	tvJokkha3=(TextView)findViewById(R.id.tv_jokkha3);
	tvJokkha4=(TextView)findViewById(R.id.tv_jokkha4);
	tvJokkha5=(TextView)findViewById(R.id.tv_jokkha5);
	tvJokkha6=(TextView)findViewById(R.id.tv_jokkha6);
	tvJokkha7=(TextView)findViewById(R.id.tv_jokkha7);
	tvJokkha8=(TextView)findViewById(R.id.tv_jokkha8);
	tvJokkha9=(TextView)findViewById(R.id.tv_jokkha9);
	tvJokkha10=(TextView)findViewById(R.id.tv_jokkha10);
	
	font=Typeface.createFromAsset(getAssets(), "S.TTF");
	tvJokkha.setTypeface(font);
	tvJokkha1.setTypeface(font);
	tvJokkha2.setTypeface(font);
	tvJokkha3.setTypeface(font);
	tvJokkha4.setTypeface(font);
	tvJokkha5.setTypeface(font);
	tvJokkha6.setTypeface(font);
	tvJokkha7.setTypeface(font);
	tvJokkha8.setTypeface(font);
	tvJokkha9.setTypeface(font);
	tvJokkha10.setTypeface(font);
	
	
}
}
