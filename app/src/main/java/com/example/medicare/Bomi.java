package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Bomi extends Activity{

	TextView tvBomi,tvBomi1,tvBomi2,tvBomi3,tvBomi4,tvBomi5,tvBomi6,tvBomi7,tvBomi8;
	Typeface font;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bomi);
		
		tvBomi=(TextView)findViewById(R.id.tv_bomi);
		tvBomi1=(TextView)findViewById(R.id.tv_bomi1);
		tvBomi2=(TextView)findViewById(R.id.tv_bomi2);
		tvBomi3=(TextView)findViewById(R.id.tv_bomi3);
		tvBomi4=(TextView)findViewById(R.id.tv_bomi4);
		tvBomi5=(TextView)findViewById(R.id.tv_bomi5);
		tvBomi6=(TextView)findViewById(R.id.tv_bomi6);
		tvBomi7=(TextView)findViewById(R.id.tv_bomi7);
		tvBomi8=(TextView)findViewById(R.id.tv_bomi8);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvBomi.setTypeface(font);
		tvBomi1.setTypeface(font);
		tvBomi2.setTypeface(font);
		tvBomi3.setTypeface(font);
		tvBomi4.setTypeface(font);
		tvBomi5.setTypeface(font);
		tvBomi6.setTypeface(font);
		tvBomi7.setTypeface(font);
		tvBomi8.setTypeface(font);
	}
}
