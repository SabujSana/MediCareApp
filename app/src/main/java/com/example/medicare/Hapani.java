package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Hapani extends Activity{
	TextView tvHapani,tvHapani1,tvHapani2,tvHapani3,tvHapani4,tvHapani5,tvHapani6,tvHapani7,tvHapani8,tvHapani9,tvHapani10,tvHapani11,tvHapani12;
	Typeface font;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.hapani);
	
	tvHapani=(TextView)findViewById(R.id.tv_hapani);
	tvHapani1=(TextView)findViewById(R.id.tv_hapani1);
	tvHapani2=(TextView)findViewById(R.id.tv_hapani2);
	tvHapani3=(TextView)findViewById(R.id.tv_hapani3);
	tvHapani4=(TextView)findViewById(R.id.tv_hapani4);
	tvHapani5=(TextView)findViewById(R.id.tv_hapani5);
	tvHapani6=(TextView)findViewById(R.id.tv_hapani6);
	tvHapani7=(TextView)findViewById(R.id.tv_hapani7);
	tvHapani8=(TextView)findViewById(R.id.tv_hapani8);
	tvHapani9=(TextView)findViewById(R.id.tv_hapani9);
	tvHapani10=(TextView)findViewById(R.id.tv_hapani10);
	tvHapani11=(TextView)findViewById(R.id.tv_hapani11);
	tvHapani12=(TextView)findViewById(R.id.tv_hapani12);
	
	font=Typeface.createFromAsset(getAssets(), "S.TTF");
	tvHapani.setTypeface(font);
	tvHapani1.setTypeface(font);
	tvHapani2.setTypeface(font);
	tvHapani3.setTypeface(font);
	tvHapani4.setTypeface(font);
	tvHapani5.setTypeface(font);
	tvHapani6.setTypeface(font);
	tvHapani7.setTypeface(font);
	tvHapani8.setTypeface(font);
	tvHapani9.setTypeface(font);
	tvHapani10.setTypeface(font);
	tvHapani11.setTypeface(font);
	tvHapani12.setTypeface(font);
}
}
