package com.example.sleepynhi.nhi2017summer.util;

import android.util.Log;

/**
 * Created by Sleepynhi on 6/19/17.
 */

public class UtilLog {
    private static boolean isLog = false;

    public static void setIsLog(Boolean b){
        isLog = b;

    }

    public static void d(String tag, String msg){
        if(isLog){
            Log.d(tag,msg);
        }

    }
}

