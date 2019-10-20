package com.yokoapps.alarmzeker;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends Activity {

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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		AdView adView = (AdView) this.findViewById(R.id.adView);
		AdRequest adRequest1 = new AdRequest.Builder().build();
		adView.loadAd(adRequest1);


		Button btnAzkarSetting = (Button) findViewById(R.id.buttonAzkarSetting);
		btnAzkarSetting.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,
						ServiceSettingActivity.class);
				startActivity(intent);
			}
		});
		Button btnAzkarList = (Button) findViewById(R.id.buttonAzkarList);
		btnAzkarList.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,
						ThikrListActivity.class);
				startActivity(intent);
			}
		});
		
		Button btnApps = (Button) findViewById(R.id.buttonApps);
		btnApps.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					try {
						startActivity(new Intent(Intent.ACTION_VIEW, Uri
								.parse("market://developer?id=mobilesrvs")));
					} catch (android.content.ActivityNotFoundException anfe) {
						startActivity(new Intent(
								Intent.ACTION_VIEW,
								Uri.parse("http://play.google.com/store/apps/developer?id=mobilesrvs")));
					}
				} catch (Exception ex) {
				}
			}
		});
		Button btnShare = (Button) findViewById(R.id.buttonAppsShare);
		btnShare.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("text/plain");
					i.putExtra(Intent.EXTRA_SUBJECT, "منبه الاذكار الالي");
					String sAux = "Auto Athkar Alarm: ";
					sAux = "https://play.google.com/store/apps/details?id=com.mobilesrvs.autoazkaralarm";
					i.putExtra(Intent.EXTRA_TEXT, sAux);
					startActivity(Intent.createChooser(i, "مشاركة عبر.."));

				} catch (Exception ex) {
				}
			}
		});
	}
}
