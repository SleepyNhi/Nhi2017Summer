package com.example.sleepynhi.nhi2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.example.sleepynhi.nhi2017summer.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Sleepynhi on 6/21/17.
 */

public class CustomDialog extends Dialog {

    private final ICustomDialogListener listener;


    public interface ICustomDialogListener{
        public void onOKClicked(String msg);

    }

    @OnClick(R.id.dialog_custom_ok)
    public void ok(View view){
        listener.onOKClicked("You clicked OK");
        cancel();
    }

    public CustomDialog(@NonNull Context context, ICustomDialogListener listener) {
        super(context,R.style.dialog);
        setContentView(R.layout.dialog_custom);
        ButterKnife.bind(this);
        this.listener = listener;
    }
}
