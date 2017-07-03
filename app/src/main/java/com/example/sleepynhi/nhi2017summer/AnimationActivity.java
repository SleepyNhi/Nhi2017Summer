package com.example.sleepynhi.nhi2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends BaseActivity {


    @BindView(R.id.activity_animation_tv)
    TextView textView;


    private Animation alphaAnimation;
    private Animation scaleAnimation;
    private Animation rotateAnimation;
    private Animation transAnimation;
    private Animation setAnimation;

    @OnClick(R.id.button1)
    public void alpha(View v){
        textView.startAnimation(alphaAnimation);

    }
    @OnClick(R.id.button2)
    public void scale(View v){
        textView.startAnimation(scaleAnimation);
    }
    @OnClick(R.id.button3)
    public void rotate(View v){
        textView.startAnimation(rotateAnimation);
    }
    @OnClick(R.id.button4)
    public void trans(View v){
        textView.startAnimation(transAnimation);
    }
    @OnClick(R.id.button5)
    public void set(View v){
        textView.startAnimation(setAnimation);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
        initialAnimation();
    }
    private void initialAnimation(){
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        transAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_trans);
        setAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_set);
    }
}
