package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Numonia extends Activity{
	TextView tvNumonia,tvNumonia1,tvNumonia2,tvNumonia3,tvNumonia4,tvNumonia5,tvNumonia6,tvNumonia7,tvNumonia8,tvNumonia9,tvNumonia10,tvNumonia11;
	Typeface font;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.numonia);
	
	tvNumonia=(TextView)findViewById(R.id.tv_numonia);
	tvNumonia1=(TextView)findViewById(R.id.tv_numonia1);
	tvNumonia2=(TextView)findViewById(R.id.tv_numonia2);
	tvNumonia3=(TextView)findViewById(R.id.tv_numonia3);
	tvNumonia4=(TextView)findViewById(R.id.tv_numonia4);
	tvNumonia5=(TextView)findViewById(R.id.tv_numonia5);
	tvNumonia6=(TextView)findViewById(R.id.tv_numonia6);
	tvNumonia7=(TextView)findViewById(R.id.tv_numonia7);
	tvNumonia8=(TextView)findViewById(R.id.tv_numonia8);
	tvNumonia9=(TextView)findViewById(R.id.tv_numonia9);
	tvNumonia10=(TextView)findViewById(R.id.tv_numonia10);
	tvNumonia11=(TextView)findViewById(R.id.tv_numonia11);
	
	font=Typeface.createFromAsset(getAssets(), "S.TTF");
	
	tvNumonia.setTypeface(font);
	tvNumonia1.setTypeface(font);
	tvNumonia2.setTypeface(font);
	tvNumonia3.setTypeface(font);
	tvNumonia4.setTypeface(font);
	tvNumonia5.setTypeface(font);
	tvNumonia6.setTypeface(font);
	tvNumonia7.setTypeface(font);
	tvNumonia8.setTypeface(font);
	tvNumonia9.setTypeface(font);
	tvNumonia10.setTypeface(font);
	tvNumonia11.setTypeface(font);
	
}
}
