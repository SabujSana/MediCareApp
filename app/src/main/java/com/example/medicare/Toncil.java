package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Toncil extends Activity{
	TextView tvToncil,tvToncil1,tvToncil2,tvToncil3,tvToncil4,tvToncil5,tvToncil6,tvToncil7,tvToncil8,tvToncil9,tvToncil10,tvToncil11,tvToncil12,tvToncil13,tvToncil14,tvToncil15,tvToncil16,tvToncil17;
	Typeface font;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.toncil);
	
	tvToncil=(TextView)findViewById(R.id.tv_toncil);
	tvToncil1=(TextView)findViewById(R.id.tv_toncil1);
	tvToncil2=(TextView)findViewById(R.id.tv_toncil2);
	tvToncil3=(TextView)findViewById(R.id.tv_toncil3);
	tvToncil4=(TextView)findViewById(R.id.tv_toncil4);
	tvToncil5=(TextView)findViewById(R.id.tv_toncil5);
	tvToncil6=(TextView)findViewById(R.id.tv_toncil6);
	tvToncil7=(TextView)findViewById(R.id.tv_toncil7);
	tvToncil8=(TextView)findViewById(R.id.tv_toncil8);
	tvToncil9=(TextView)findViewById(R.id.tv_toncil9);
	tvToncil10=(TextView)findViewById(R.id.tv_toncil10);
	tvToncil11=(TextView)findViewById(R.id.tv_toncil11);
	tvToncil12=(TextView)findViewById(R.id.tv_toncil12);
	tvToncil13=(TextView)findViewById(R.id.tv_toncil13);
	tvToncil14=(TextView)findViewById(R.id.tv_toncil14);
	tvToncil15=(TextView)findViewById(R.id.tv_toncil15);
	tvToncil16=(TextView)findViewById(R.id.tv_toncil16);
	tvToncil17=(TextView)findViewById(R.id.tv_toncil17);
	font=Typeface.createFromAsset(getAssets(), "S.TTF");
	tvToncil.setTypeface(font);
	tvToncil1.setTypeface(font);
	tvToncil2.setTypeface(font);
	tvToncil3.setTypeface(font);
	tvToncil4.setTypeface(font);
	tvToncil5.setTypeface(font);
	tvToncil6.setTypeface(font);
	tvToncil7.setTypeface(font);
	tvToncil8.setTypeface(font);
	tvToncil9.setTypeface(font);
	tvToncil10.setTypeface(font);
	tvToncil11.setTypeface(font);
	tvToncil12.setTypeface(font);
	tvToncil13.setTypeface(font);
	tvToncil14.setTypeface(font);
	tvToncil15.setTypeface(font);
	tvToncil16.setTypeface(font);
	tvToncil17.setTypeface(font);
	
}
}
