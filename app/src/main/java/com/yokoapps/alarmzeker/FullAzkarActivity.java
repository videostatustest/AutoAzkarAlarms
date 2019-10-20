package com.yokoapps.alarmzeker;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FullAzkarActivity extends Activity {

	private InterstitialAd interstitial;
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();

	}
	public void displayInterstitial() {
		if (interstitial.isLoaded()) {
			interstitial.show();
			AdView adView = (AdView)this.findViewById(R.id.adView1);
	        AdRequest adRequest1 = new AdRequest.Builder()
	                  .build();
	        adView.loadAd(adRequest1);
		}
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_full_azkar);
		//
		interstitial = new InterstitialAd(this);
		interstitial.setAdUnitId(getString(R.string.ads_full_id));
		// Create ad request.
		interstitial.setAdListener(new AdListener() {
			@Override
			public void onAdLoaded() {
				super.onAdLoaded();
				displayInterstitial();
			}

			@Override
			public void onAdFailedToLoad(int errorCode) {
				super.onAdFailedToLoad(errorCode);

			}
		});
		AdRequest adRequest = new AdRequest.Builder().build();
		// Begin loading your interstitial.
		interstitial.loadAd(adRequest);

		TextView txtFullTitle=(TextView)findViewById(R.id.txtFullTitle);
		
		String newString;
		
		if (savedInstanceState == null) {
		    Bundle extras = getIntent().getExtras();
		    if(extras == null) {
		        newString= "اذكر الله";
		    } else {
		        newString= extras.getString("text");
		    }
		} else {
		    newString= (String) savedInstanceState.getSerializable("text");
		}
		
		txtFullTitle.setText(newString);
	}

}
