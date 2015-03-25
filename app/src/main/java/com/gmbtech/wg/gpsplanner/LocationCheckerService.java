package com.gmbtech.wg.gpsplanner;


import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class LocationCheckerService extends IntentService{
	private static final String TAG = "LocationCheckerService";

	public LocationCheckerService(){
		super(TAG);
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		Log.i(TAG, "Got intent!");
	}
}
