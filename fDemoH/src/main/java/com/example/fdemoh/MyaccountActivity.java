package com.example.fdemoh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class MyaccountActivity extends Activity {

	 ListView mainListView ;
	 ArrayAdapter<String> listAdapter ;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_myaccount);
	 /** Called when the activity is first created. */
	  mainListView = (ListView) findViewById( R.id.listView );  
		 
	    // Find the ListView resource. 
	    // Create and populate a List of planet names.
	    String[] FoodBanks = new String[] { "Acton Foodshare", "Churches On The Hill Food Bank", "Fort York Food Bank, "
	    		+ "The Good Shepherd Food Bank",
	                                      "North Hastings Community Cupboard", "North York Harvest Food Bank", "Madawaska Valley Food Bank", 
	                                      "Daily Bread Food Bank"};  
	 
	    List<String> FoodList = new ArrayList<String>();
	    FoodList.addAll( Arrays.asList(FoodBanks) );
	    
	    
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	              android.R.layout.simple_list_item_1, android.R.id.text1, FoodBanks); 
	    mainListView.setAdapter(adapter);
	    
	    mainListView.setOnClickListener(new OnClickListener() {

			public void onClick(AdapterView <?> parent ,View v,int position
					, long id) 
			{			int itemPosition = position;
						String itemValue = (String) mainListView.getItemAtPosition
								(position);
						  // Show Alert 
	                    Toast.makeText(getApplicationContext(),
	                      "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
	                      .show();
	                 
	                  }

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
	    
	             }); 
	        }
	    
	
	

}
