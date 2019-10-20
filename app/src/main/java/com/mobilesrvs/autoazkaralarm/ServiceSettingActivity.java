package com.mobilesrvs.autoazkaralarm;

import java.util.ArrayList;
import java.util.List;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ServiceSettingActivity extends Activity{
	private Spinner spinnerSSState, spinnerSSTIME;
	private AlarmManagerBroadcastReceiver alarm;
	String tonePath;
	Button btn_setrengtone;

	public void addItemsOnspinnerSSTIME() {
		SharedPreferences pref = this.getSharedPreferences("autoazkaralarm", 0);
		spinnerSSTIME = (Spinner) findViewById(R.id.spinnerSSTIME);
		List<String> list = new ArrayList<String>();
		list.add("    كل 5 دقائق");
		list.add("    كل 10 دقائق");
		list.add("    كل 30 دقيقة");
		list.add("    كل ساعة");
		list.add("    كل 3 ساعات");
		list.add("    كل 6 ساعات");
		list.add("    كل 12 ساعة");
		list.add("    كل يوم");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list);
		dataAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerSSTIME.setAdapter(dataAdapter);
		//
		spinnerSSTIME.setSelection(pref.getInt("spinnerSSTIME", 0));
	}

	public void addItemsOnspinnerSSState() {
		SharedPreferences pref = this.getSharedPreferences("autoazkaralarm", 0);
		spinnerSSState = (Spinner) findViewById(R.id.spinnerSSState);
		List<String> list = new ArrayList<String>();
		list.add("    تشغيل المذكر");
		list.add("    ايقاف المذكر");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list);
		dataAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerSSState.setAdapter(dataAdapter);
		//
		spinnerSSState.setSelection(pref.getInt("spinnerSSState", 0));
		if (spinnerSSState.getSelectedItemPosition() == 0) {
			alarm.CancelAlarm(getApplicationContext());

			alarm.SetAlarm(getApplicationContext());
		} else {
			alarm.CancelAlarm(getApplicationContext());
		}
	}

	protected void SetupControls() {
		SharedPreferences pref = this.getSharedPreferences("autoazkaralarm", 0);
		final Editor editor = pref.edit();

		// TODO Auto-generated method stub
		try {
			addItemsOnspinnerSSState();
			addItemsOnspinnerSSTIME();
			Button btn_ok = (Button) findViewById(R.id.btn_SSok);

			btn_ok.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					editor.putInt("spinnerSSTIME",
							spinnerSSTIME.getSelectedItemPosition());
					editor.putInt("spinnerSSState",
							spinnerSSState.getSelectedItemPosition());
					editor.commit();

					if (spinnerSSState.getSelectedItemPosition() == 0) {
						alarm.CancelAlarm(getApplicationContext());

						alarm.SetAlarm(getApplicationContext());
					} else {
						alarm.CancelAlarm(getApplicationContext());
					}
					//
					Toast.makeText(ServiceSettingActivity.this,
							"تم الحفظ بنجاح", Toast.LENGTH_LONG).show();
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
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
		setContentView(R.layout.activity_service_setting);

		alarm = new AlarmManagerBroadcastReceiver();
		
		AdView adView = (AdView) this.findViewById(R.id.adView2);
		AdRequest adRequest1 = new AdRequest.Builder().build();
		adView.loadAd(adRequest1);

		SetupControls();
	}


}
