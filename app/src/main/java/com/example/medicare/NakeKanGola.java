package com.example.medicare;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NakeKanGola extends Activity implements OnClickListener{
	 Button sordi,jokkha,hapani,numonia,bukjala,toncil;
	 Typeface font;
	@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.nak_kan_gola);
	initialize();
	sordi.setOnClickListener(this);
	jokkha.setOnClickListener(this);
	hapani.setOnClickListener(this);
	numonia.setOnClickListener(this);
	bukjala.setOnClickListener(this);
	toncil.setOnClickListener(this);
	
	font=Typeface.createFromAsset(getAssets(), "S.TTF");
	sordi.setTypeface(font);
	jokkha.setTypeface(font);
	hapani.setTypeface(font);
	numonia.setTypeface(font);
	bukjala.setTypeface(font);
	toncil.setTypeface(font);
	
	
}
	private void initialize() {
		sordi=(Button)findViewById(R.id.bSordi);
		jokkha=(Button)findViewById(R.id.bJokkha);
		hapani=(Button)findViewById(R.id.bHapani);
		numonia=(Button)findViewById(R.id.bNumonia);
		bukjala=(Button)findViewById(R.id.bBukJala);
		toncil=(Button)findViewById(R.id.bToncil);
		
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bSordi:
			Intent inSordi=new Intent(NakeKanGola.this,Sordi.class);
			startActivity(inSordi);
			break;
		case R.id.bJokkha:
			Intent inJokkha=new Intent(NakeKanGola.this,Jokkha.class);
			startActivity(inJokkha);
			break;
		case R.id.bHapani:
			Intent inHapani=new Intent(NakeKanGola.this,Hapani.class);
			startActivity(inHapani);
			break;
		case R.id.bNumonia:
			Intent inNumonia=new Intent(NakeKanGola.this,Numonia.class);
			startActivity(inNumonia);
			break;
		case R.id.bBukJala:
			Intent inBukJala=new Intent(NakeKanGola.this,BukJala.class);
			startActivity(inBukJala);
			break;
		
		case R.id.bToncil:
			Intent inToncil=new Intent(NakeKanGola.this,Toncil.class);
			startActivity(inToncil);
			break;
		
		}
		
	}
}
