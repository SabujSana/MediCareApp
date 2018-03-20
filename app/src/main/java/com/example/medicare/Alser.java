package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Alser extends Activity{
	TextView tvAlser,tvAlser1,tvAlser2,tvAlser3,tvAlser4,tvAlser5,tvAlser6,tvAlser7,tvAlser8;
	Typeface font;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alser);
		
		tvAlser=(TextView)findViewById(R.id.tv_alser);
		tvAlser1=(TextView)findViewById(R.id.tv_alser1);
		tvAlser2=(TextView)findViewById(R.id.tv_alser2);
		tvAlser3=(TextView)findViewById(R.id.tv_alser3);
		tvAlser4=(TextView)findViewById(R.id.tv_alser4);
		tvAlser5=(TextView)findViewById(R.id.tv_alser5);
		tvAlser6=(TextView)findViewById(R.id.tv_alser6);
		tvAlser7=(TextView)findViewById(R.id.tv_alser7);
		tvAlser8=(TextView)findViewById(R.id.tv_alser8);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvAlser.setTypeface(font);
		tvAlser1.setTypeface(font);
		tvAlser2.setTypeface(font);
		tvAlser3.setTypeface(font);
		tvAlser4.setTypeface(font);
		tvAlser5.setTypeface(font);
		tvAlser6.setTypeface(font);
		tvAlser7.setTypeface(font);
		tvAlser8.setTypeface(font);
	}
}
