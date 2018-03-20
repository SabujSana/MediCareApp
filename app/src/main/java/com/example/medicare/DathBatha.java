package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class DathBatha extends Activity{

	TextView tvDathBatha,tvDathBatha1,tvDathBatha2,tvDathBatha3,tvDathBatha4,tvDathBatha5,tvDathBatha6,tvDathBatha7,tvDathBatha8,tvDathBatha9,tvDathBatha10,tvDathBatha11,tvDathBatha12;
	Typeface font;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dath_batha);
		
		tvDathBatha=(TextView)findViewById(R.id.tv_dathBatha);
		tvDathBatha1=(TextView)findViewById(R.id.tv_dathBatha1);
		tvDathBatha4=(TextView)findViewById(R.id.tv_dathBatha4);
		tvDathBatha5=(TextView)findViewById(R.id.tv_dathBatha5);
		tvDathBatha6=(TextView)findViewById(R.id.tv_dathBatha6);
		tvDathBatha7=(TextView)findViewById(R.id.tv_dathBatha7);
		tvDathBatha8=(TextView)findViewById(R.id.tv_dathBatha8);
		tvDathBatha9=(TextView)findViewById(R.id.tv_dathBatha9);
		tvDathBatha10=(TextView)findViewById(R.id.tv_dathBatha10);
		tvDathBatha11=(TextView)findViewById(R.id.tv_dathBatha11);
		tvDathBatha12=(TextView)findViewById(R.id.tv_dathBatha12);
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvDathBatha.setTypeface(font);
		tvDathBatha1.setTypeface(font);
		tvDathBatha2.setTypeface(font);
		tvDathBatha3.setTypeface(font);
		tvDathBatha4.setTypeface(font);
		tvDathBatha5.setTypeface(font);
		tvDathBatha6.setTypeface(font);
		tvDathBatha7.setTypeface(font);
		tvDathBatha8.setTypeface(font);
		tvDathBatha9.setTypeface(font);
		tvDathBatha10.setTypeface(font);
		tvDathBatha11.setTypeface(font);
		tvDathBatha12.setTypeface(font);
		
	}
}
