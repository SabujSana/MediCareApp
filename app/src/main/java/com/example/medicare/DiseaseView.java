package com.example.medicare;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class DiseaseView extends Activity{
	WebView wvHtml;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.view_disease);
			
			wvHtml=(WebView)findViewById(R.id.wvHtml);
			wvHtml.loadUrl("file://android_asset/sordiJor.html");
		}
}
