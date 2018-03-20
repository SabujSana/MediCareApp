package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Dairia extends Activity{
TextView tvDairia,tvDairia1,tvDairia2,tvDairia3,tvDairia4,tvDairia5,tvDairia6,tvDairia7,tvDairia8;
Typeface font;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dairia);
		
		tvDairia=(TextView)findViewById(R.id.tv_dairia);
		tvDairia1=(TextView)findViewById(R.id.tv_dairia1);
		tvDairia2=(TextView)findViewById(R.id.tv_dairia2);
		tvDairia3=(TextView)findViewById(R.id.tv_dairia3);
		tvDairia4=(TextView)findViewById(R.id.tv_dairia4);
		tvDairia5=(TextView)findViewById(R.id.tv_dairia5);
		tvDairia6=(TextView)findViewById(R.id.tv_dairia6);
		tvDairia7=(TextView)findViewById(R.id.tv_dairia7);
		tvDairia8=(TextView)findViewById(R.id.tv_dairia8);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvDairia.setTypeface(font);
		tvDairia1.setTypeface(font);
		tvDairia2.setTypeface(font);
		tvDairia3.setTypeface(font);
		tvDairia4.setTypeface(font);
		tvDairia5.setTypeface(font);
		tvDairia6.setTypeface(font);
		tvDairia7.setTypeface(font);
		tvDairia8.setTypeface(font);
	}
}
