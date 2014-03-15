package com.example.blogandroid1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {


	
	private Button loginbtn,signupbtn;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		loginbtn = (Button) findViewById(R.id.login);
		signupbtn = (Button) findViewById(R.id.signup);
		
		loginbtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View currentView) {
				Intent myIntent = new Intent(currentView.getContext(),Home.class);
				startActivityForResult(myIntent, 0);
			}
			
		});
		signupbtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View currentView) {
				Intent myIntent = new Intent(currentView.getContext(),SignupPage.class);
				startActivityForResult(myIntent, 0);
			}
			

		});
		
	}

}
