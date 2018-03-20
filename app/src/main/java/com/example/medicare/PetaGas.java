package com.example.medicare;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class PetaGas extends Activity{
	TextView tvPetaGas,tvPetaGas1,tvPetaGas2,tvPetaGas3,tvPetaGas4,tvPetaGas5,tvPetaGas6,tvPetaGas7,tvPetaGas8;
	Typeface font;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.peta_gas);
		
		tvPetaGas=(TextView)findViewById(R.id.tv_petaGas);
		tvPetaGas1=(TextView)findViewById(R.id.tv_petaGas1);
		tvPetaGas2=(TextView)findViewById(R.id.tv_petaGas2);
		tvPetaGas3=(TextView)findViewById(R.id.tv_petaGas3);
		tvPetaGas4=(TextView)findViewById(R.id.tv_petaGas4);
		tvPetaGas5=(TextView)findViewById(R.id.tv_petaGas5);
		tvPetaGas6=(TextView)findViewById(R.id.tv_petaGas6);
		tvPetaGas7=(TextView)findViewById(R.id.tv_petaGas7);
		tvPetaGas8=(TextView)findViewById(R.id.tv_petaGas8);
		
		font =Typeface.createFromAsset(getAssets(), "S.TTF");
		tvPetaGas.setTypeface(font);
		tvPetaGas1.setTypeface(font);
		tvPetaGas2.setTypeface(font);
		tvPetaGas3.setTypeface(font);
		tvPetaGas4.setTypeface(font);
		tvPetaGas5.setTypeface(font);
		tvPetaGas6.setTypeface(font);
		tvPetaGas7.setTypeface(font);
		tvPetaGas8.setTypeface(font);
		
	}
}
