package com.example.fdemoh;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MapActivityActivity extends Activity {
		 static final LatLng SecondHarvest = new LatLng(43.760394,-79.467331);
	private GoogleMap map;
		 
		 @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map_activity);
		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		
		final Marker SecondHarvest2 = map.addMarker(new
				MarkerOptions().position(SecondHarvest).title("Second Harvest"));
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(SecondHarvest, 15));
		SecondHarvest2.showInfoWindow();
		SecondHarvest2.setSnippet("416.408.2594");
	
		SecondHarvest2.isVisible();
	    // Zoom in, animating the camera.
	    map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	    map.setOnMarkerClickListener(new OnMarkerClickListener() {

			@Override
			public boolean onMarkerClick(Marker arg0) {
				// TODO Auto-generated method stub
			
			// makes call to Second Harvest Number
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("Tel:" +"416.408.2594"));
			callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(callIntent);
				return true;
			}
			
	    	
	    	
	    
		
		
	}
);}
}