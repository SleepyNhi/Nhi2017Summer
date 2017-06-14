package com.example.sleepynhi.nhi2017summer;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class NotificationActivity extends BaseActivity {

    private NotificationManager manager;
    private int notifyId = 100;

    @OnClick(R.id.activity_notification_small)
    public void smallNotification(View v){
        showToast("smallNotification");

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        mBuilder.setContentTitle("Title")
                .setContentText("Text")
                .setContentIntent(getDefaultIntent(Notification.FLAG_AUTO_CANCEL))
                .setNumber(10)
                .setTicker("Ticker")
                .setWhen(System.currentTimeMillis())
                .setPriority(Notification.PRIORITY_DEFAULT)
                .setAutoCancel(true)
                .setOngoing(false)
                .setDefaults(Notification.DEFAULT_SOUND)
                .setDefaults(Notification.DEFAULT_VIBRATE)
                .setSmallIcon(R.mipmap.ic_launcher);
        manager.notify(notifyId, mBuilder.build());
    }


    private PendingIntent getDefaultIntent(int flags){
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 1, new Intent(), flags);
        return pendingIntent;
    }
    @OnClick(R.id.activity_notification_small)
    public void bigNotification(View v){
        showToast("bigNotification");


    }
    @OnClick(R.id.activity_notification_small)
    public void picNotification(View v){
        showToast("picNotification");



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        ButterKnife.bind(this);
        manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
    }
}
