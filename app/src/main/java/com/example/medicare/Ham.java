package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Ham extends Activity{
 TextView tvHam,tvHam1,tvHam2,tvHam3,tvHam4,tvHam5,tvHam6,tvHam7,tvHam8;
 Typeface font;
 @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ham);
		
		tvHam=(TextView)findViewById(R.id.tv_Ham);
		tvHam1=(TextView)findViewById(R.id.tv_Ham1);
		tvHam2=(TextView)findViewById(R.id.tv_Ham2);
		tvHam3=(TextView)findViewById(R.id.tv_Ham3);
		tvHam4=(TextView)findViewById(R.id.tv_Ham4);
		tvHam5=(TextView)findViewById(R.id.tv_Ham5);
		tvHam6=(TextView)findViewById(R.id.tv_Ham6);
		tvHam7=(TextView)findViewById(R.id.tv_Ham7);
		tvHam8=(TextView)findViewById(R.id.tv_Ham8);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		
		tvHam.setTypeface(font);
		tvHam1.setTypeface(font);
		tvHam2.setTypeface(font);
		tvHam3.setTypeface(font);
		tvHam4.setTypeface(font);
		tvHam5.setTypeface(font);
		tvHam6.setTypeface(font);
		tvHam7.setTypeface(font);
		tvHam8.setTypeface(font);
		
	}
}
