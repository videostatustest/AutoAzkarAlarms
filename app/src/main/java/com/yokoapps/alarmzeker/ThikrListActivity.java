package com.yokoapps.alarmzeker;

import java.util.ArrayList;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ThikrListActivity extends Activity {
    ItemListBaseAdapter adapter;
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
        }else
        {
            AdRequest adRequest = new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thikr_list);
        //
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId(getString(R.string.ads_full_id));
//        // Create ad request.
//        interstitial.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                super.onAdLoaded();
//                displayInterstitial();
//            }
//
//            @Override
//            public void onAdFailedToLoad(int errorCode) {
//                super.onAdFailedToLoad(errorCode);
//
//            }
//        });


        AdView adView = (AdView) this.findViewById(R.id.adView3);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        adView.loadAd(adRequest1);

        ListView lv1 = (ListView) findViewById(R.id.list);


        final ArrayList<AthkarItem> localArrayList = GetData();
        adapter = new ItemListBaseAdapter(this, localArrayList);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                try {
                    AthkarItem o = localArrayList.get(position);
                    final AthkarItem obj_itemDetails = (AthkarItem) o;

                    play(ThikrListActivity.this, obj_itemDetails.getSoundID());
                    displayInterstitial();

                } catch (Exception ex) {
                }


            }
        });

    }
    private MediaPlayer mMediaPlayer;

    public void stop() {
        if (mMediaPlayer != null) {
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

}
