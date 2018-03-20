package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class DaterKhoi extends Activity{

	TextView tvDaterKhoi,tvDaterKhoi1,tvDaterKhoi2,tvDaterKhoi3,tvDaterKhoi4,tvDaterKhoi5,tvDaterKhoi6,tvDaterKhoi7,tvDaterKhoi8;
	Typeface font;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dater_khoi);
		
		tvDaterKhoi=(TextView)findViewById(R.id.tv_daterKhoi);
		tvDaterKhoi1=(TextView)findViewById(R.id.tv_daterKhoi1);
		tvDaterKhoi2=(TextView)findViewById(R.id.tv_daterKhoi2);
		tvDaterKhoi3=(TextView)findViewById(R.id.tv_daterKhoi3);
		tvDaterKhoi4=(TextView)findViewById(R.id.tv_daterKhoi4);
		tvDaterKhoi5=(TextView)findViewById(R.id.tv_daterKhoi5);
		tvDaterKhoi6=(TextView)findViewById(R.id.tv_daterKhoi6);
		tvDaterKhoi7=(TextView)findViewById(R.id.tv_daterKhoi7);
		tvDaterKhoi8=(TextView)findViewById(R.id.tv_daterKhoi8);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvDaterKhoi.setTypeface(font);
		tvDaterKhoi1.setTypeface(font);
		tvDaterKhoi2.setTypeface(font);
		tvDaterKhoi3.setTypeface(font);
		tvDaterKhoi4.setTypeface(font);
		tvDaterKhoi5.setTypeface(font);
		tvDaterKhoi6.setTypeface(font);
		tvDaterKhoi7.setTypeface(font);
		tvDaterKhoi8.setTypeface(font);
	}
}
