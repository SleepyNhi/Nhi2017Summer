package com.example.sleepynhi.nhi2017summer;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sleepynhi.nhi2017summer.adapter.BaseViewPagerAdapter;
import com.example.sleepynhi.nhi2017summer.fragment.BlueFragment;
import com.example.sleepynhi.nhi2017summer.fragment.GreenFragment;
import com.example.sleepynhi.nhi2017summer.fragment.RedFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceListViewActivity extends BaseActivity {

    @BindView(R.id.activity_advance_list_view) ListView lv;

    @BindView(R.id.activity_quiz4_viewPager) ViewPager vp;


    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        ButterKnife.bind(this);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello, how are you?");
        list.add("I'm fine, thank you.");
        list.add("Hello");
        list.add("Hello, how are you?");
        list.add("I'm fine, thank you.");
        list.add("Hello");
        list.add("Hello, how are you?");
        list.add("I'm fine, thank you.");
        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list);
        lv.setAdapter(adapter);


//        TextView tv = new TextView(this);
//        tv.setText("HeaderView");
//        tv.setTextSize(50);


        vp = (ViewPager) findViewById(R.id.activity_quiz4_viewPager);
        ArrayList<Fragment> list2 = new ArrayList<>();
        list2.add(new RedFragment());
        list2.add(new GreenFragment());
        list2.add(new BlueFragment());
        BaseViewPagerAdapter pagerAdapter = new BaseViewPagerAdapter(this.getSupportFragmentManager(), list2);
        vp.setAdapter(pagerAdapter);

        View headerView = getLayoutInflater().inflate(R.layout.activity_view_pager , null , false);

        
        lv.addHeaderView(headerView);



        TextView tv_1 = new TextView(this);
        tv_1.setText("FooterView");
        tv_1.setTextSize(50);
        lv.addFooterView(tv_1);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        vp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                PointF downP = new PointF();
                PointF curP = new PointF();
                int act = event.getAction();
                if (act == MotionEvent.ACTION_DOWN || act == MotionEvent.ACTION_MOVE || act == MotionEvent.ACTION_UP) {
                    ((ViewGroup) v).requestDisallowInterceptTouchEvent(true);
                    if (downP.x == curP.x && downP.y == curP.y) {
                        return false;
                    }
                }
                return false;
            }
        });
    }
}
