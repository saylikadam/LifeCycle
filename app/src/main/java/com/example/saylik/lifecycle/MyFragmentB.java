package com.example.saylik.lifecycle;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragmentB extends Fragment{
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater layoutInflater,ViewGroup container,Bundle savedInstanceState){
        Log.d("Log", "in onCreateView methods");
        return layoutInflater.inflate(R.layout.my_fragment_b_layout,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.textView_on_frag_b);
    }

    public void changeText(String data){
        textView.setText(data);
    }

}
