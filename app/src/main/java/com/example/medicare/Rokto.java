package com.example.medicare;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Rokto extends Activity implements OnClickListener{
	Button uccoRoktochap,roktoSolpota;
	Typeface font;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rokto);
		initialize();
		uccoRoktochap.setOnClickListener(this);
		roktoSolpota.setOnClickListener(this);
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		uccoRoktochap.setTypeface(font);
		roktoSolpota.setTypeface(font);
	}
	private void initialize() {
		uccoRoktochap=(Button)findViewById(R.id.bUccoRoktochap);
		roktoSolpota=(Button)findViewById(R.id.bRoktoSolpota);
		
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bUccoRoktochap:
			Intent inUccoRoktochap=new Intent(Rokto.this,UccoRoktoChap.class);
			startActivity(inUccoRoktochap);
			break;
		case R.id.bRoktoSolpota:
			Intent inRoktoOlpota=new Intent(Rokto.this,RoktoSolpota.class);
			startActivity(inRoktoOlpota);
			break;

		
		}
		
	}
}
