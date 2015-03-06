package com.example.fdemoh;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro_main);

		final Button FindLocalFoodBank = (Button) findViewById(R.id.button2);
		FindLocalFoodBank.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Perform action on click
				// goToUrl("https://www.google.com/maps/search/Toronto+food+banks/@43.6620605,-79.5003375,12z/data=!3m1!4b1?sa=X&ei=o-tXVPP_C4vesASOsIDYCQ&ved=0CMsBELYD");
					
			Intent activityChangeIntent = new Intent(IntroMainActivity.this,
						MapActivityActivity.class);
           
				
				 startActivity(activityChangeIntent);

		//	MainActivity.this.startActivity(activityChangeIntent);
					
			}
		});

		final Button MyAccount = (Button) findViewById(R.id.myAccount1);
		MyAccount.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Perform action on click

			Intent activityChangeIntent = new Intent( IntroMainActivity.this,MyaccountActivity.class);

			startActivity(activityChangeIntent);

			}
		});
		final Button OurMission = (Button) findViewById(R.id.button3);
		OurMission.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Perform action on click
				goToSu(OurMission);

			}
		});
	}

	private void goToUrl(String url) {
		Uri uriUrl = Uri.parse(url);
		Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
		startActivity(launchBrowser);
	}

	public void goToSu(View view) {
		goToUrl("http://secondharvest.ca/about");
	}


	
}
