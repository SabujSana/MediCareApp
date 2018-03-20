package com.example.medicare;

import org.w3c.dom.Text;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class stroke extends Activity{
	TextView tvStroke,tvStroke1,tvStroke2,tvStroke3,tvStroke4,tvStroke5,tvStroke6,tvStroke7,tvStroke8,tvStroke9;
	Typeface font;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stroke);
		
		
		tvStroke=(TextView)findViewById(R.id.tv_stroke);
		tvStroke1=(TextView)findViewById(R.id.tv_stroke1);
		tvStroke2=(TextView)findViewById(R.id.tv_stroke2);
		tvStroke3=(TextView)findViewById(R.id.tv_stroke3);
		tvStroke4=(TextView)findViewById(R.id.tv_stroke4);
		tvStroke5=(TextView)findViewById(R.id.tv_stroke5);
		tvStroke6=(TextView)findViewById(R.id.tv_stroke6);
		tvStroke7=(TextView)findViewById(R.id.tv_stroke7);
		tvStroke8=(TextView)findViewById(R.id.tv_stroke8);
		tvStroke9=(TextView)findViewById(R.id.tv_stroke9);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvStroke.setTypeface(font);
		tvStroke1.setTypeface(font);
		tvStroke2.setTypeface(font);
		tvStroke3.setTypeface(font);
		tvStroke4.setTypeface(font);
		tvStroke5.setTypeface(font);
		tvStroke6.setTypeface(font);
		tvStroke7.setTypeface(font);
		tvStroke8.setTypeface(font);
		tvStroke9.setTypeface(font);
	}
}
