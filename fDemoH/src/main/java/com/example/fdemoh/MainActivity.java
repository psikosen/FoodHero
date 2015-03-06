package com.example.fdemoh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button next = (Button) findViewById(R.id.button1);
		
				next.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent activityChangeIntent = new Intent(MainActivity.this,
													IntroMainActivity.class);
						startActivity(activityChangeIntent);
					}
				});
	}
}
