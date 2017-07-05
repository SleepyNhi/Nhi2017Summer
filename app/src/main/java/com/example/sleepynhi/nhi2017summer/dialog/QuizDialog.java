package com.example.sleepynhi.nhi2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.sleepynhi.nhi2017summer.BaseActivity;
import com.example.sleepynhi.nhi2017summer.R;
import com.example.sleepynhi.nhi2017summer.fragment.WorkFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Sleepynhi on 7/4/17.
 */

public class QuizDialog extends Dialog {

    @BindView(R.id.activity_quiz2_radio)
    RadioGroup radioGroup;

    public final IQuizDialogListener listener2;



    public interface IQuizDialogListener{
        public void onOKClicked(String msg);
    }


    private int checkedID = 0;
    @OnClick(R.id.activity_quiz2_ok_bt)
    public void okButton(View view){
        switch (checkedID){
            case R.id.activity_quiz2_no:
                listener2.onOKClicked("No");
                cancel();
                break;
            case R.id.activity_quiz2_yes:
                listener2.onOKClicked("Yes");
                cancel();
                break;
            case R.id.activity_quiz2_exit:
                listener2.onOKClicked("Exit");
                cancel();
                break;
            default:

                break;
        }
    }

    @OnClick(R.id.activity_quiz2_cancelbt)
    public void onCancel(){
        cancel();
    }






    public QuizDialog(@NonNull Context context, IQuizDialogListener listener2) {
        super(context, R.style.dialog);
        setContentView(R.layout.activity_quiz2_dialog);
        ButterKnife.bind(this);
        this.listener2 = listener2;
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                checkedID = checkedId;
            }
        });
    }


}
