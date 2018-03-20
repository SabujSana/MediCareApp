package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class JorThosa extends Activity{
TextView tvJorThosa,tvJorThosa1,tvJorThosa2,tvJorThosa3,tvJorThosa4,tvJorThosa5,tvJorThosa6,tvJorThosa7,tvJorThosa8;
Typeface font;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jor_thosa);
		
		tvJorThosa=(TextView)findViewById(R.id.tv_jorThosa);
		tvJorThosa1=(TextView)findViewById(R.id.tv_jorThosa1);
		tvJorThosa2=(TextView)findViewById(R.id.tv_jorThosa2);
		tvJorThosa3=(TextView)findViewById(R.id.tv_jorThosa3);
		tvJorThosa4=(TextView)findViewById(R.id.tv_jorThosa4);
		tvJorThosa5=(TextView)findViewById(R.id.tv_jorThosa5);
		tvJorThosa6=(TextView)findViewById(R.id.tv_jorThosa6);
		tvJorThosa7=(TextView)findViewById(R.id.tv_jorThosa7);
		tvJorThosa8=(TextView)findViewById(R.id.tv_jorThosa8);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvJorThosa.setTypeface(font);
		tvJorThosa1.setTypeface(font);
		tvJorThosa2.setTypeface(font);
		tvJorThosa3.setTypeface(font);
		tvJorThosa4.setTypeface(font);
		tvJorThosa5.setTypeface(font);
		tvJorThosa6.setTypeface(font);
		tvJorThosa7.setTypeface(font);
		tvJorThosa8.setTypeface(font);
		
	}
}
