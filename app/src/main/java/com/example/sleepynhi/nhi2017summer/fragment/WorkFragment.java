package com.example.sleepynhi.nhi2017summer.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.sleepynhi.nhi2017summer.R;
import com.example.sleepynhi.nhi2017summer.adapter.ViewFragmentStateAdapter;

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

    private ArrayList<Pair<String,Fragment>> list = new ArrayList<Pair<String, Fragment>>();

    public WorkFragment() {

    }

    @BindView(R.id.button_submit1)
    Button button;
    @OnClick(R.id.button_submit1)
    public void OnClick(){
        button.setTextColor(Color.RED);
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
