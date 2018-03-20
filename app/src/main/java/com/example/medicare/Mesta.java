package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Mesta extends Activity{
TextView tvMesta,tvMesta1,tvMesta2,tvMesta3,tvMesta4,tvMesta5,tvMesta6,tvMesta7,tvMesta8;
Typeface font;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mesta);
		tvMesta=(TextView)findViewById(R.id.tv_mesta);
		tvMesta1=(TextView)findViewById(R.id.tv_mesta1);
		tvMesta2=(TextView)findViewById(R.id.tv_mesta2);
		tvMesta3=(TextView)findViewById(R.id.tv_mesta3);
		tvMesta4=(TextView)findViewById(R.id.tv_mesta4);
		tvMesta5=(TextView)findViewById(R.id.tv_mesta5);
		tvMesta6=(TextView)findViewById(R.id.tv_mesta6);
		tvMesta7=(TextView)findViewById(R.id.tv_mesta7);
		tvMesta8=(TextView)findViewById(R.id.tv_mesta8);
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		tvMesta.setTypeface(font);
		tvMesta1.setTypeface(font);
		tvMesta2.setTypeface(font);
		tvMesta3.setTypeface(font);
		tvMesta4.setTypeface(font);
		tvMesta5.setTypeface(font);
		tvMesta6.setTypeface(font);
		tvMesta7.setTypeface(font);
		tvMesta8.setTypeface(font);
	}
}
