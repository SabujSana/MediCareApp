package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Dayabatics extends Activity{
TextView tvDayabatics,tvDayabatics1,tvDayabatics2,tvDayabatics3,tvDayabatics4,tvDayabatics5,tvDayabatics6,tvDayabatics7,tvDayabatics8,tvDayabatics9,tvDayabatics10;
Typeface font;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dayabatics);
		
		tvDayabatics=(TextView)findViewById(R.id.tv_dayabatics);
		tvDayabatics1=(TextView)findViewById(R.id.tv_dayabatics1);
		tvDayabatics2=(TextView)findViewById(R.id.tv_dayabatics2);
		tvDayabatics3=(TextView)findViewById(R.id.tv_dayabatics3);
		tvDayabatics4=(TextView)findViewById(R.id.tv_dayabatics4);
		tvDayabatics5=(TextView)findViewById(R.id.tv_dayabatics5);
		tvDayabatics6=(TextView)findViewById(R.id.tv_dayabatics6);
		tvDayabatics7=(TextView)findViewById(R.id.tv_dayabatics7);
		tvDayabatics8=(TextView)findViewById(R.id.tv_dayabatics8);
		tvDayabatics9=(TextView)findViewById(R.id.tv_dayabatics9);
		tvDayabatics10=(TextView)findViewById(R.id.tv_dayabatics10);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvDayabatics.setTypeface(font);
		tvDayabatics1.setTypeface(font);
		tvDayabatics2.setTypeface(font);
		tvDayabatics3.setTypeface(font);
		tvDayabatics4.setTypeface(font);
		tvDayabatics5.setTypeface(font);
		tvDayabatics6.setTypeface(font);
		tvDayabatics7.setTypeface(font);
		tvDayabatics8.setTypeface(font);
		tvDayabatics9.setTypeface(font);
		tvDayabatics10.setTypeface(font);
		
	}
}
