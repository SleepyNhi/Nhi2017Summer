package com.example.sleepynhi.nhi2017summer;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Sleepynhi on 6/14/17.
 */

public class BaseActivity extends AppCompatActivity {
    public void showToast(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
