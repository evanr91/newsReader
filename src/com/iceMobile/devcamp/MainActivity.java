package com.iceMobile.devcamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	private EditText usernameText;
	private EditText passwordText;
	private Button loginButton;
	//private TextView textview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//r. is een klasse die wordt gegenereerd door het systeem, die bevat alle identifiers.
		usernameText = (EditText) findViewById(R.id.edit_text_username);
		passwordText = (EditText) findViewById(R.id.edit_text_password);
		//textview = (TextView) findViewById(R.id.textView1);
		loginButton = (Button) findViewById(R.id.button_login);
		
		loginButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onClick(View v){
		if(v.equals(loginButton)){
			if(usernameText.getText().toString().equals("user") &&
				passwordText.getText().toString().equals("pass")){
				Toast.makeText(this, R.string.login_succesful, Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(this, NewsListActivity.class);
				startActivity(intent);
			}else{
				Toast.makeText(this, R.string.login_error, Toast.LENGTH_SHORT).show();
			}
			
			//textview.setText(usernameText.getText());
				
			
			
		}
	}

}
