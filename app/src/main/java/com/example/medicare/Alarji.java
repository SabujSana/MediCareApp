
package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Alarji extends Activity{
TextView tvAlarji,tvAlarji1,tvAlarji2,tvAlarji3,tvAlarji4,tvAlarji5,tvAlarji6,tvAlarji7,tvAlarji8,tvAlarji9,tvAlarji10,tvAlarji11,tvAlarji12,tvAlarji13,tvAlarji14,tvAlarji15;
Typeface font;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alarji);
		
		tvAlarji=(TextView)findViewById(R.id.tv_alarji);
		tvAlarji1=(TextView)findViewById(R.id.tv_alarji1);
		tvAlarji2=(TextView)findViewById(R.id.tv_alarji2);
		tvAlarji3=(TextView)findViewById(R.id.tv_alarji3);
		tvAlarji4=(TextView)findViewById(R.id.tv_alarji4);
		tvAlarji5=(TextView)findViewById(R.id.tv_alarji5);
		tvAlarji6=(TextView)findViewById(R.id.tv_alarji6);
		tvAlarji7=(TextView)findViewById(R.id.tv_alarji7);
		tvAlarji8=(TextView)findViewById(R.id.tv_alarji8);
		tvAlarji9=(TextView)findViewById(R.id.tv_alarji9);
		tvAlarji10=(TextView)findViewById(R.id.tv_alarji10);
		tvAlarji11=(TextView)findViewById(R.id.tv_alarji11);
		tvAlarji12=(TextView)findViewById(R.id.tv_alarji12);
		tvAlarji13=(TextView)findViewById(R.id.tv_alarji13);
		tvAlarji14=(TextView)findViewById(R.id.tv_alarji14);
		tvAlarji15=(TextView)findViewById(R.id.tv_alarji15);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvAlarji.setTypeface(font);
		tvAlarji1.setTypeface(font);
		tvAlarji2.setTypeface(font);
		tvAlarji3.setTypeface(font);
		tvAlarji4.setTypeface(font);
		tvAlarji5.setTypeface(font);
		tvAlarji6.setTypeface(font);
		tvAlarji7.setTypeface(font);
		tvAlarji8.setTypeface(font);
		tvAlarji9.setTypeface(font);
		tvAlarji10.setTypeface(font);
		tvAlarji11.setTypeface(font);
		tvAlarji12.setTypeface(font);
		tvAlarji13.setTypeface(font);
		tvAlarji14.setTypeface(font);
		tvAlarji15.setTypeface(font);
		
		
	}
}
