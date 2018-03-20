package com.example.medicare;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Porsab extends Activity implements OnClickListener{
Button dayabatics,jondis,kidniPathor;
Typeface font;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.porsab);
		
	initialize();
	
	dayabatics.setOnClickListener(this);
	jondis.setOnClickListener(this);
	kidniPathor.setOnClickListener(this);
	
	font=Typeface.createFromAsset(getAssets(), "S.TTF");
	dayabatics.setTypeface(font);
	jondis.setTypeface(font);
	kidniPathor.setTypeface(font);
	}
private void initialize() {
	dayabatics=(Button)findViewById(R.id.bDayabatics);
	jondis=(Button)findViewById(R.id.bJondis);
	kidniPathor=(Button)findViewById(R.id.bKidniPathor);
	
}
@Override
public void onClick(View v) {
	switch (v.getId()) {
	case R.id.bDayabatics:
		Intent inDayabatics=new Intent(Porsab.this,Dayabatics.class);
		startActivity(inDayabatics);
		break;
	case R.id.bJondis:
		Intent inJondis=new Intent(Porsab.this,Jondis.class);
		startActivity(inJondis);
		break;
	case R.id.bKidniPathor:
		Intent inKidniPathor=new Intent(Porsab.this,KidniPathor.class);
		startActivity(inKidniPathor);
		break;
	}
	
}
}
