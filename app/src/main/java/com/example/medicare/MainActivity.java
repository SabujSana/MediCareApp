package com.example.medicare;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	Button nakKanGola,mukMatha,pet,tak,porsab,rokto;
	Typeface font;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initialize();
		nakKanGola.setOnClickListener(this);
		mukMatha.setOnClickListener(this);
		pet.setOnClickListener(this);
		tak.setOnClickListener(this);
		porsab.setOnClickListener(this);
		rokto.setOnClickListener(this);
		
		
		font=Typeface.createFromAsset(getAssets(), "S.TTF");
		nakKanGola.setTypeface(font);
		mukMatha.setTypeface(font);
		pet.setTypeface(font);
		tak.setTypeface(font);
		porsab.setTypeface(font);
		rokto.setTypeface(font);
		
	}

	private void initialize() {
	nakKanGola=(Button)findViewById(R.id.bNakKanGola);
	mukMatha=(Button)findViewById(R.id.bMathaMuk);
	pet=(Button)findViewById(R.id.bPet);
	tak=(Button)findViewById(R.id.bTak);
	porsab=(Button)findViewById(R.id.bPorsab);
	rokto=(Button)findViewById(R.id.bRokto);
	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bNakKanGola:
			Intent inNakKanGola=new Intent(MainActivity.this,NakeKanGola.class);
			startActivity(inNakKanGola);
			break;
		case R.id.bMathaMuk:
			Intent inMathaMuk=new Intent(MainActivity.this,MukMatha.class);
			startActivity(inMathaMuk);
			break;
		case R.id.bPet:
			Intent inPet=new Intent(MainActivity.this,Pet.class);
			startActivity(inPet);
			break;
		case R.id.bTak:
			Intent inToak=new Intent(MainActivity.this,Toak.class);
			startActivity(inToak);
			break;
		case R.id.bPorsab:
			Intent inPorsab=new Intent(MainActivity.this,Porsab.class);
			startActivity(inPorsab);
			break;
		case R.id.bRokto:
			Intent inRokto=new Intent(MainActivity.this,Rokto.class);
			startActivity(inRokto);
			break;
		
		}
		
	}
}
