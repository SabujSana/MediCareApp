package com.example.medicare;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MukMatha extends Activity implements OnClickListener{
	Button mathaBatha,stroke,dathBatha,daterKhoi,jorThosa;
	Typeface font;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.muk_matha);
	initialize();
	
	mathaBatha.setOnClickListener(this);
	stroke.setOnClickListener(this);
	dathBatha.setOnClickListener(this);
	daterKhoi.setOnClickListener(this);
	jorThosa.setOnClickListener(this);
	
	font=Typeface.createFromAsset(getAssets(), "S.TTF");
	mathaBatha.setTypeface(font);
	stroke.setTypeface(font);
	dathBatha.setTypeface(font);
	daterKhoi.setTypeface(font);
	jorThosa.setTypeface(font);
}
private void initialize() {
	mathaBatha=(Button)findViewById(R.id.bMathaBatha);
	stroke=(Button)findViewById(R.id.bStroke);
	dathBatha=(Button)findViewById(R.id.bDathBatha);
	daterKhoi=(Button)findViewById(R.id.bDaterKhoi);
	jorThosa=(Button)findViewById(R.id.bJorThosa);
	
}
@Override
public void onClick(View v) {
	switch (v.getId()) {
	case R.id.bMathaBatha:
	    Intent inMathaBatha=new Intent(MukMatha.this,MathaBatha.class);
	    startActivity(inMathaBatha);
	    break;
	case R.id.bStroke:
		Intent inStroke=new Intent(MukMatha.this,stroke.class);
		startActivity(inStroke);
		break;
	case R.id.bDathBatha:
		Intent inDathBatha=new Intent(MukMatha.this,DathBatha.class);
		startActivity(inDathBatha);
		break;
	case R.id.bDaterKhoi:
		Intent inDaterKhoi=new Intent(MukMatha.this,DaterKhoi.class);
		startActivity(inDaterKhoi);
		break;
	case R.id.bJorThosa:
		Intent inJorThosa=new Intent(MukMatha.this,JorThosa.class);
		startActivity(inJorThosa);
		break;
		
	}
	
}
}
