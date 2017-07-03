package com.example.sleepynhi.nhi2017summer.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.sleepynhi.nhi2017summer.BaseActivity;
import com.example.sleepynhi.nhi2017summer.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityD extends BaseActivity {

    @OnClick(R.id.buttonA)
    public void toA(View v){
        goToActivity(ActivityA.class);
    }
    @OnClick(R.id.buttonB)
    public void toB(View v){
        goToActivity(ActivityB.class);
    }
    @OnClick(R.id.buttonC)
    public void toC(View v){
        goToActivity(ActivityC.class);
    }
    @OnClick(R.id.buttonD)
    public void toD(View v){
        goToActivity(ActivityD.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        ButterKnife.bind(this);
        longToast("onCreate");
    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        shortToast("onIntent");
    }

}
