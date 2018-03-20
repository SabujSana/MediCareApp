package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Sordi extends Activity{
	TextView tvSordi,tvSordi1,tvSordi2,tvSordi3,tvSordi4,tvSordi5,tvSordi6,tvSordi7,tvSordi8,tvSordi9;
	Typeface font;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.sordi);
	
	tvSordi=(TextView)findViewById(R.id.tv_sordi);
	tvSordi1=(TextView)findViewById(R.id.tv_sordi1);
	tvSordi2=(TextView)findViewById(R.id.tv_sordi2);
	tvSordi3=(TextView)findViewById(R.id.tv_sordi3);
	tvSordi4=(TextView)findViewById(R.id.tv_sordi4);
	tvSordi5=(TextView)findViewById(R.id.tv_sordi5);
	tvSordi6=(TextView)findViewById(R.id.tv_sordi6);
	tvSordi7=(TextView)findViewById(R.id.tv_sordi7);
	tvSordi8=(TextView)findViewById(R.id.tv_sordi8);
	tvSordi9=(TextView)findViewById(R.id.tv_sordi9);
	font=Typeface.createFromAsset(getAssets(), "S.TTF");
	tvSordi.setTypeface(font);
	tvSordi1.setTypeface(font);
	tvSordi2.setTypeface(font);
	tvSordi3.setTypeface(font);
	tvSordi4.setTypeface(font);
	tvSordi5.setTypeface(font);
	tvSordi6.setTypeface(font);
	tvSordi7.setTypeface(font);
	tvSordi8.setTypeface(font);
	tvSordi9.setTypeface(font);
	
}
}
