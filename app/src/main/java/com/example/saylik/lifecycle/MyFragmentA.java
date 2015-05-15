package com.example.saylik.lifecycle;

import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyFragmentA extends Fragment implements View.OnClickListener {

    Button button;
    int counter = 0;
    Communicator comm;

    @Override
    public View onCreateView(LayoutInflater layoutInflater,ViewGroup container,Bundle savedInstanceState){
        return layoutInflater.inflate(R.layout.my_fragment_a_layout,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity();
        button = (Button) getActivity().findViewById(R.id.button_on_frag_a);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        counter++;
        comm.respond("button cliked"+counter);
    }

}
