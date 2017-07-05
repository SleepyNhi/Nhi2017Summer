package com.example.sleepynhi.nhi2017summer.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;

import com.example.sleepynhi.nhi2017summer.util.UtilLog;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Sleepynhi on 7/3/17.
 */

public class TestService extends Service {
    private Timer timer = new Timer();
    private int update = 0;
    public static final String UPDATE = "update";
    public static final String ACTION = "TestAction";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String value = intent.getStringExtra("Service");
        timer.schedule(new UpdateTask(), 0, 2000);
        return super.onStartCommand(intent, flags, startId);

    }

    private class UpdateTask extends TimerTask {
        public void run(){
            Intent intent = new Intent();
            intent.setAction(ACTION); //necessary
            intent.putExtra(UPDATE,++update);
            sendBroadcast(intent);
            UtilLog.d("Service", update + "");
        }
    }
}
