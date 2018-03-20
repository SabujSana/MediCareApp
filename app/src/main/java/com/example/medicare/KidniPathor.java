package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class KidniPathor extends Activity{
TextView tvKidniPathor,tvKidniPathor1,tvKidniPathor2,tvKidniPathor3,tvKidniPathor4,tvKidniPathor5,tvKidniPathor6,tvKidniPathor7,tvKidniPathor8,tvKidniPathor9,tvKidniPathor10;
Typeface font;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kidni_pathor);
		tvKidniPathor=(TextView)findViewById(R.id.tv_kidniPathor);
		tvKidniPathor1=(TextView)findViewById(R.id.tv_kidniPathor1);
		tvKidniPathor2=(TextView)findViewById(R.id.tv_kidniPathor2);
		tvKidniPathor3=(TextView)findViewById(R.id.tv_kidniPathor3);
		tvKidniPathor4=(TextView)findViewById(R.id.tv_kidniPathor4);
		tvKidniPathor5=(TextView)findViewById(R.id.tv_kidniPathor5);
		tvKidniPathor6=(TextView)findViewById(R.id.tv_kidniPathor6);
		tvKidniPathor7=(TextView)findViewById(R.id.tv_kidniPathor7);
		tvKidniPathor8=(TextView)findViewById(R.id.tv_kidniPathor8);
		tvKidniPathor9=(TextView)findViewById(R.id.tv_kidniPathor9);
		tvKidniPathor10=(TextView)findViewById(R.id.tv_kidniPathor10);
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvKidniPathor.setTypeface(font);
		tvKidniPathor1.setTypeface(font);
		tvKidniPathor2.setTypeface(font);
		tvKidniPathor3.setTypeface(font);
		tvKidniPathor4.setTypeface(font);
		tvKidniPathor5.setTypeface(font);
		tvKidniPathor6.setTypeface(font);
		tvKidniPathor7.setTypeface(font);
		tvKidniPathor8.setTypeface(font);
		tvKidniPathor9.setTypeface(font);
		tvKidniPathor10.setTypeface(font);
	}
}
