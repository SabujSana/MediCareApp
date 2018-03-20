package com.example.medicare;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Pet extends Activity implements OnClickListener{
	Button dairia,bomi,petaGas,alser,kostokathinno;
	Typeface font;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pet);
		
		initialize();
		
		dairia.setOnClickListener(this);
		bomi.setOnClickListener(this);
		petaGas.setOnClickListener(this);
		alser.setOnClickListener(this);
		kostokathinno.setOnClickListener(this);
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		
		dairia.setTypeface(font);
		bomi.setTypeface(font);
		petaGas.setTypeface(font);
		alser.setTypeface(font);
		kostokathinno.setTypeface(font);
	}
	private void initialize() {
		dairia=(Button)findViewById(R.id.bDairia);
		bomi=(Button)findViewById(R.id.bBomi);
		petaGas=(Button)findViewById(R.id.bPetaGas);
		alser=(Button)findViewById(R.id.bAlser);
		kostokathinno=(Button)findViewById(R.id.bKostoKathinno);
		
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bDairia:
			Intent inDairia=new Intent(Pet.this,Dairia.class);
			startActivity(inDairia);
			break;
		case R.id.bBomi:
			Intent inBomi=new Intent(Pet.this,Bomi.class);
			startActivity(inBomi);
			break;
		case R.id.bPetaGas:
			Intent inPetaGas=new Intent(Pet.this,PetaGas.class);
			startActivity(inPetaGas);
			break;
		case R.id.bAlser:
			Intent inAlser=new Intent(Pet.this,Alser.class);
			startActivity(inAlser);
			break;
		case R.id.bKostoKathinno:
			Intent inKostokathinno=new Intent(Pet.this,KostoKathinno.class);
			startActivity(inKostokathinno);
			break;

		}
		
	}

}
