package com.mobilesrvs.autoazkaralarm;

import java.util.ArrayList;
import java.util.Random;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Vibrator;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;


public class AlarmManagerBroadcastReceiver extends BroadcastReceiver {

	ArrayList<AthkarItem> localArrayList;

	public ArrayList<AthkarItem> GetData() {
		ArrayList<AthkarItem> list = new ArrayList<AthkarItem>();

		AthkarItem item = new AthkarItem();
		item.setThikrID(1);
		item.setSoundID(R.raw.aud1);
		item.setThikrName("تباركت يا ذا الجلال والاكرام");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(2);
		item.setSoundID(R.raw.aud2);
		item.setThikrName("اشهد ان لا اله الا الله وحده لا شريك له وان محمد عبده ورسوله");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(3);
		item.setSoundID(R.raw.aud3);
		item.setThikrName("بسم الله");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(4);
		item.setSoundID(R.raw.aud4);
		item.setThikrName("سبحانك اللهم وبحمدك");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(5);
		item.setSoundID(R.raw.aud5);
		item.setThikrName("توكلت على الله");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(6);
		item.setSoundID(R.raw.aud6);
		item.setThikrName("اللهم افتحلي ابواب رحمتك");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(7);
		item.setSoundID(R.raw.aud7);
		item.setThikrName("اللهم انت الملك لا الله الا انت");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(8);
		item.setSoundID(R.raw.aud8);
		item.setThikrName("سبحانك اللهم وبحمدك");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(9);
		item.setSoundID(R.raw.aud9);
		item.setThikrName("استغفرك واتوب اليك");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(10);
		item.setSoundID(R.raw.aud10);
		item.setThikrName("اللهم لك الحمد انت نور السموات والارض ومن في هن");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(11);
		item.setSoundID(R.raw.aud11);
		item.setThikrName("انت الاهي لا اله الا انت");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(12);
		item.setSoundID(R.raw.aud12);
		item.setThikrName("اللهم لا مانع لما اعطيت وما معطي لما منعت");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(13);
		item.setSoundID(R.raw.aud13);
		item.setThikrName("اللهم اهدني في من هديت");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(14);
		item.setSoundID(R.raw.aud14);
		item.setThikrName("اللهم اني اعوذ برضاك من سخطك");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(15);
		item.setSoundID(R.raw.aud15);
		item.setThikrName("اللهم صلي على محمد وعلى آل ومحمد");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(16);
		item.setSoundID(R.raw.aud16);
		item.setThikrName("استغفر الله");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(17);
		item.setSoundID(R.raw.aud17);
		item.setThikrName("لا اله الا الله وحده لا شريك له ,له الملك وله الحمد وهو على كل شئ قدير");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(18);
		item.setSoundID(R.raw.aud18);
		item.setThikrName("لا حول ولا قوة الا بالله");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(19);
		item.setSoundID(R.raw.aud19);
		item.setThikrName("لا اله الا الله ولا نعبد الا اياه");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(20);
		item.setSoundID(R.raw.aud20);
		item.setThikrName("اللهم اعني على ذكرك وشكرك وحسن عبادتك");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(21);
		item.setSoundID(R.raw.aud21);
		item.setThikrName("سبحان الله وبحمده");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(22);
		item.setSoundID(R.raw.aud22);
		item.setThikrName("حسبي الله لا اله الا هو عليه توكلت وهو رب العرش العظيم");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(23);
		item.setSoundID(R.raw.aud23);
		item.setThikrName("رضيت بالله ربا وبالاسلام دينا وبمحمد صلى الله عليه وسلم نبيا");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(24);
		item.setSoundID(R.raw.aud24);
		item.setThikrName("اللهم اني اسالك علماً نافعا ورزقاً طيبا وعمل متقبلا");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(25);
		item.setSoundID(R.raw.aud25);
		item.setThikrName("اللهم صلي وسلم على نبينا محمد");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(26);
		item.setSoundID(R.raw.aud26);
		item.setThikrName("اللهم مغفرتك اوسع من ذنوبي");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(27);
		item.setSoundID(R.raw.aud27);
		item.setThikrName("الحمدلله كثيراً طيباُ مبارك فيه");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(28);
		item.setSoundID(R.raw.aud28);
		item.setThikrName("الحمدلله الذي بنعمته تتم الصالحات");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(29);
		item.setSoundID(R.raw.aud29);
		item.setThikrName("لا اله الا الله العظيم الحليم");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(30);
		item.setSoundID(R.raw.aud30);
		item.setThikrName("يا حي يا قيوم برحمتك استغيث");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(31);
		item.setSoundID(R.raw.aud31);
		item.setThikrName("اعوذ بالله من الشيطان الرجيم");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(32);
		item.setSoundID(R.raw.aud32);
		item.setThikrName("اللهم اتنا في الدنيا حسنه وفي الاخرة حسنه وقنا عذاب النار");
		list.add(item);

		item = new AthkarItem();
		item.setThikrID(33);
		item.setSoundID(R.raw.aud33);
		item.setThikrName("يا مقلب القلوب ثبت قلبي على دينك");
		list.add(item);

		return list;
	}
	private MediaPlayer mMediaPlayer;

	public void stop() {
		if (mMediaPlayer != null) {
			if(mMediaPlayer.isPlaying())
				mMediaPlayer.stop();
			mMediaPlayer.reset();
			mMediaPlayer.release();
			mMediaPlayer = null;
		}
	}

	public void play(Context c, int rid) {
		stop();

		mMediaPlayer = MediaPlayer.create(c, rid);
		mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mediaPlayer) {
				stop();
			}
		});

		mMediaPlayer.start();
	}
	@Override
	public void onReceive(Context context, Intent intent) {
		try {

			localArrayList = GetData();
			// Get instance of Vibrator from current Context
			Vibrator v1 = (Vibrator) context
					.getSystemService(Context.VIBRATOR_SERVICE);

			// Vibrate for 300 milliseconds
			v1.vibrate(400);

			AthkarItem randomStr = localArrayList.get(new Random()
					.nextInt(localArrayList.size()));


			play(context, randomStr.getSoundID());


			Notification(context, randomStr.thikrName);
		} catch (Exception e) {

			AthkarItem randomStr = localArrayList.get(new Random()
					.nextInt(localArrayList.size()-1));


			play(context, randomStr.getSoundID());


			Notification(context, randomStr.thikrName);
			// Get instance of Vibrator from current Context
			Vibrator v1 = (Vibrator) context
					.getSystemService(Context.VIBRATOR_SERVICE);

			// Vibrate for 300 milliseconds
			v1.vibrate(400);
		}

	}
	public static final String CHANNEL_ID = "AlarmManagerBroadcastReceiver";
	public static String NOTIFICATION_ID = "notification-id" ;
	public static String NOTIFICATION = "notification" ;

	public void Notification(Context context, String message) {
		String strtitle = "منبه الاذكار الالي";
		// Create an explicit intent for an Activity in your app

		NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context. NOTIFICATION_SERVICE ) ;

		Intent intent = new Intent(context, FullAzkarActivity.class);
		intent.putExtra("title", strtitle);
		intent.putExtra("text", message);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
		PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

		NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
				.setSmallIcon(R.drawable.ic_launcher)
				.setContentTitle(strtitle)
				.setContentText(message)
				.setPriority(NotificationCompat.PRIORITY_DEFAULT)
				// Set the intent that will fire when the user taps the notification
				.setContentIntent(pendingIntent)
				.setAutoCancel(true);


		if (android.os.Build.VERSION. SDK_INT >= android.os.Build.VERSION_CODES. O ) {
			int importance = NotificationManager. IMPORTANCE_HIGH ;
			NotificationChannel notificationChannel = new NotificationChannel( CHANNEL_ID , "NOTIFICATION_CHANNEL_NAME" , importance) ;
			assert notificationManager != null;
			notificationManager.createNotificationChannel(notificationChannel) ;
		}

		assert notificationManager != null;
		notificationManager.notify(1 ,  builder.build()) ;
	}

	public void SetAlarm(Context context) {
		SharedPreferences pref = context.getSharedPreferences("autoazkaralarm",
				0);
		int NOTIFY_INTERVAL = 0;
		switch (pref.getInt("spinnerSSTIME", 0)) {
			case 0:
				NOTIFY_INTERVAL = 300 * 1000;
				break;
		case 1:
			NOTIFY_INTERVAL = 600 * 1000;
			break;
		case 2:
			NOTIFY_INTERVAL = 1800 * 1000;
			break;
		case 3:
			NOTIFY_INTERVAL = 3600 * 1000;
			break;
		case 4:
			NOTIFY_INTERVAL = 10800 * 1000;
			break;
		case 5:
			NOTIFY_INTERVAL = 21600 * 1000;
			break;
		case 6:
			NOTIFY_INTERVAL = 43200 * 1000;
			break;
		case 7:
			NOTIFY_INTERVAL = 86400 * 1000;
			break;

		default:
			break;
		}
		AlarmManager am = (AlarmManager) context
				.getSystemService(Context.ALARM_SERVICE);
		Intent intent = new Intent(context, AlarmManagerBroadcastReceiver.class);
		PendingIntent pi = PendingIntent.getBroadcast(context, 0, intent, 0);
		// After after 5 seconds
		am.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
				+ NOTIFY_INTERVAL, NOTIFY_INTERVAL, pi);
	}

	public void CancelAlarm(Context context) {
		Intent intent = new Intent(context, AlarmManagerBroadcastReceiver.class);
		PendingIntent sender = PendingIntent
				.getBroadcast(context, 0, intent, 0);
		AlarmManager alarmManager = (AlarmManager) context
				.getSystemService(Context.ALARM_SERVICE);
		alarmManager.cancel(sender);
	}

}