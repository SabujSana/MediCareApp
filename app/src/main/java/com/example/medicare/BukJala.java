package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class BukJala extends Activity{
	TextView tvBukJala,tvBukJala1,tvBukJala2,tvBukJala3,tvBukJala4,tvBukJala5,tvBukJala6,tvBukJala7,tvBukJala8,tvBukJala9;
	Typeface font;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.buk_jala);
	
	tvBukJala=(TextView)findViewById(R.id.tv_buk_jala);
	tvBukJala1=(TextView)findViewById(R.id.tv_buk_jala1);
	tvBukJala2=(TextView)findViewById(R.id.tv_buk_jala2);
	tvBukJala3=(TextView)findViewById(R.id.tv_buk_jala3);
	tvBukJala4=(TextView)findViewById(R.id.tv_buk_jala4);
	tvBukJala5=(TextView)findViewById(R.id.tv_buk_jala5);
	tvBukJala6=(TextView)findViewById(R.id.tv_buk_jala6);
	tvBukJala7=(TextView)findViewById(R.id.tv_buk_jala7);
	tvBukJala8=(TextView)findViewById(R.id.tv_buk_jala8);
	tvBukJala9=(TextView)findViewById(R.id.tv_buk_jala9);
	
	font=Typeface.createFromAsset(getAssets(), "S.TTF");
	tvBukJala.setTypeface(font);
	tvBukJala1.setTypeface(font);
	tvBukJala2.setTypeface(font);
	tvBukJala3.setTypeface(font);
	tvBukJala4.setTypeface(font);
	tvBukJala5.setTypeface(font);
	tvBukJala6.setTypeface(font);
	tvBukJala7.setTypeface(font);
	tvBukJala8.setTypeface(font);
	tvBukJala9.setTypeface(font);
}
}
