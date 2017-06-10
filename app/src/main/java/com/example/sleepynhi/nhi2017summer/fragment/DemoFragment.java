package com.example.sleepynhi.nhi2017summer.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.sleepynhi.nhi2017summer.R;
import com.example.sleepynhi.nhi2017summer.adapter.ListNormalAdapter;

import java.util.ArrayList;

public class DemoFragment extends Fragment {

    private ListView listView;
    private final ArrayList<String> contentList;


    public DemoFragment() {
        // Required empty public constructor
        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");
        contentList.add("9patch");


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo,container,false);
        listView = (ListView)view.findViewById(R.id.fragment_demo_lv);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(),contentList);
        listView.setAdapter(adapter);

        return view;

    }

}
