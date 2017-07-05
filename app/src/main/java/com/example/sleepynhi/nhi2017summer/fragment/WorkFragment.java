package com.example.sleepynhi.nhi2017summer.fragment;


import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.Pair;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sleepynhi.nhi2017summer.R;
import com.example.sleepynhi.nhi2017summer.adapter.ViewFragmentStateAdapter;
import com.example.sleepynhi.nhi2017summer.dialog.CustomDialog;
import com.example.sleepynhi.nhi2017summer.dialog.QuizDialog;
import com.example.sleepynhi.nhi2017summer.util.UtilLog;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WorkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WorkFragment extends Fragment {

    public WorkFragment() {

    }

    @BindView(R.id.button_submit1)
    Button button;
    @OnClick(R.id.button_submit1)
    public void OnClick(){
        button.setTextColor(Color.RED);
    }

    @BindView(R.id.quizTab)
    RelativeLayout rl;
    @OnClick(R.id.activity_work_quiz2)
    public void OnClickQuiz2(View view) {
        // Create and show the dialog.
        QuizDialog quizDialog = new QuizDialog(getContext(), new QuizDialog.IQuizDialogListener() {
            @Override
            public void onOKClicked(String msg) {
                Toast.makeText(getContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });
        quizDialog.setCanceledOnTouchOutside(true);
        quizDialog.show();
    }




    public static WorkFragment newInstance(String param1, String param2) {
        WorkFragment fragment = new WorkFragment();
        Bundle args = new Bundle();
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_work, container, false);
        ButterKnife.bind(this,view);
        return view;
    }


}
