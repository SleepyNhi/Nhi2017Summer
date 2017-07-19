package com.example.sleepynhi.nhi2017summer.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Sleepynhi on 7/5/17.
 */

public class AdvanceViewPagerAdapter extends ViewPager {

    private float xDown;
    private float xMove;
    private float yDown;
    private float yMove;
    private boolean viewpagersroll = false;

    public AdvanceViewPagerAdapter(Context context) {
        super(context);
    }

    public AdvanceViewPagerAdapter(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) { // è®°å½•æŒ‰ä¸‹æ—¶çš„ä½ç½®
            xDown = ev.getRawX();
            yDown = ev.getRawY();
        } else if (ev.getAction() == MotionEvent.ACTION_MOVE) {
            xMove = ev.getRawX();
            yMove = ev.getRawY();
            if (viewpagersroll) { // viewpagerè‡ªå·±å¤„ç†æ»‘åŠ¨æ•ˆæžœ
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.dispatchTouchEvent(ev);
            } // è¿™é‡Œçš„åŠ¨ä½œåˆ¤æ–­æ˜¯Viewpageræ»‘åŠ¨,ListViewä¸æ»‘åŠ?
            if (Math.abs(yMove - yDown) < 5 && Math.abs(xMove - xDown) > 20) {
                viewpagersroll = true;
            } else { // ç”±çˆ¶å®¹å™¨listviewæ¥å¤„ç†æ»‘åŠ¨æ•ˆæž?
                return false;
            }
        } else if (ev.getAction() == MotionEvent.ACTION_UP) {
            viewpagersroll = false;
        }
        return super.dispatchTouchEvent(ev);
    }
}
