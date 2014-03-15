package com.example.blogandroid1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class LoginPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.signup_page, menu);
		return true;
	}
	
	/*public void onClick(View view) {
		// TODO Auto-generated method stub
		startActivity(new Intent(this,SignupPage.class));
		startActivity(new Intent(this,Home.class));
		
	}*/
	public void signup(View view) {
		// TODO Auto-generated method stub
		startActivity(new Intent(this,SignupPage.class));
	}
	
	public void login(View view) {
		// TODO Auto-generated method stub
		startActivity(new Intent(this,LoginPage.class));
	}

}
