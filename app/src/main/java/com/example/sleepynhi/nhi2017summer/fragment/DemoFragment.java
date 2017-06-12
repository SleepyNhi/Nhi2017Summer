package com.example.sleepynhi.nhi2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;

import com.example.sleepynhi.nhi2017summer.LaunchModeActivity;
import com.example.sleepynhi.nhi2017summer.R;
import com.example.sleepynhi.nhi2017summer.ViewPagerActivity;
import com.example.sleepynhi.nhi2017summer.adapter.ListNormalAdapter;

import java.util.ArrayList;

public class DemoFragment extends Fragment {

    private ListView listView;
    private final ArrayList<String> contentList;
    private final Context context;

    public DemoFragment() {
        context = getContext();
        // Required empty public constructor
        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("a");
        contentList.add("b");
        contentList.add("c");
        contentList.add("9patch");
        contentList.add("LaunchMode");
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


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                switch(position) {
                    case 0:
                        Intent intent = new Intent(getActivity(),ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        Intent intent1 = new Intent(getActivity(), LaunchModeActivity.class);
                        startActivity(intent1);
                    default:
                }
            }
        });
        return view;




    }





}
