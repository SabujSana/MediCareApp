package com.example.medicare;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Toak extends Activity implements OnClickListener{
Button ham,alarji,mesta;
Typeface font;

@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.toak);
		initialize();
		ham.setOnClickListener(this);
		alarji.setOnClickListener(this);
		mesta.setOnClickListener(this);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		ham.setTypeface(font);
		alarji.setTypeface(font);
		mesta.setTypeface(font);
	}

private void initialize() {
	ham=(Button)findViewById(R.id.bHam);
	alarji=(Button)findViewById(R.id.bAlarji);
	mesta=(Button)findViewById(R.id.bMesta);
	
}

@Override
public void onClick(View v) {
	switch (v.getId()) {
	case R.id.bHam:
		Intent inHam=new Intent(Toak.this,Ham.class);
		startActivity(inHam);
		break;
	case R.id.bAlarji:
		Intent inAlarji=new Intent(Toak.this,Alarji.class);
		startActivity(inAlarji);
		break;
	case R.id.bMesta:
		Intent inMesta=new Intent(Toak.this,Mesta.class);
		startActivity(inMesta);
		break;
		}
	}
}
