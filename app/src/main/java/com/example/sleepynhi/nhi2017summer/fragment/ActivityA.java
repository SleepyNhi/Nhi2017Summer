package com.example.sleepynhi.nhi2017summer.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sleepynhi.nhi2017summer.BaseActivity;
import com.example.sleepynhi.nhi2017summer.R;
import com.example.sleepynhi.nhi2017summer.audio.BaseBean;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityA extends BaseActivity {



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
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        Intent intent =getIntent();
        Bundle bundle = intent.getBundleExtra("Bundle");
        String bs = bundle.getString("StringBundle");
        int bi = bundle.getInt("IntegerBundle",0);
        BaseBean bean = (BaseBean)bundle.getSerializable("Object");
        shortToast(bean.getName());
        //shortToast(bs);
        //shortToast("Interger is:"+bi);
        //String s = intent.getStringExtra("StringInfo");
        //int i = intent.getIntExtra("IntegerInfo", 0);
        //shortToast(s);
        //shortToast(i + ""); //or String.valueOf(i) but "" is faster casting.
        //shortToast("Integer is:"+i);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        shortToast("onIntent");
    }
}
