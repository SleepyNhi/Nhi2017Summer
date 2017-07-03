package com.example.sleepynhi.nhi2017summer;

import android.app.Application;
import android.util.Log;

import com.example.sleepynhi.nhi2017summer.util.UtilLog;

/**
 * Created by Sleepynhi on 6/19/17.
 */

public class NhiApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true);
    }

}
