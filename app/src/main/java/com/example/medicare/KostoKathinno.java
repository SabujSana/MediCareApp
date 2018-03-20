package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class KostoKathinno extends Activity{
TextView tvKostoKathinno,tvKostoKathinno1,tvKostoKathinno2,tvKostoKathinno3,tvKostoKathinno4,tvKostoKathinno5,tvKostoKathinno6,tvKostoKathinno7,tvKostoKathinno8,tvKostoKathinno9;
Typeface font;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kosto_kathinno);
		
		
		tvKostoKathinno=(TextView)findViewById(R.id.tv_kostoKathinno);
		tvKostoKathinno1=(TextView)findViewById(R.id.tv_kostoKathinno1);
		tvKostoKathinno2=(TextView)findViewById(R.id.tv_kostoKathinno2);
		tvKostoKathinno3=(TextView)findViewById(R.id.tv_kostoKathinno3);
		tvKostoKathinno4=(TextView)findViewById(R.id.tv_kostoKathinno4);
		tvKostoKathinno5=(TextView)findViewById(R.id.tv_kostoKathinno5);
		tvKostoKathinno6=(TextView)findViewById(R.id.tv_kostoKathinno6);
		tvKostoKathinno7=(TextView)findViewById(R.id.tv_kostoKathinno7);
		tvKostoKathinno8=(TextView)findViewById(R.id.tv_kostoKathinno8);
		tvKostoKathinno9=(TextView)findViewById(R.id.tv_kostoKathinno9);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvKostoKathinno.setTypeface(font);
		tvKostoKathinno1.setTypeface(font);
		tvKostoKathinno2.setTypeface(font);
		tvKostoKathinno3.setTypeface(font);
		tvKostoKathinno4.setTypeface(font);
		tvKostoKathinno5.setTypeface(font);
		tvKostoKathinno6.setTypeface(font);
		tvKostoKathinno7.setTypeface(font);
		tvKostoKathinno8.setTypeface(font);
		tvKostoKathinno9.setTypeface(font);
		
	}
}
