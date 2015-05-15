package com.example.saylik.lifecycle;

import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by saylik on 13/05/15.
 */
public class MyFragmentA extends Fragment implements View.OnClickListener {

    Button button;
    int counter = 0;
    Communicator comm;
//    public void onAttach(Activity activity){
//        Log.d("Log","in onattach methods");
//        super.onAttach(activity);
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstances){
//        Log.d("Log","in onCreate methods");
//        super.onCreate(savedInstances);
//    }


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


//    @Override
//    public void onActivityCreated(Bundle savedInstances){
//        Log.d("Log","in onActivityCreated methods");
//        super.onActivityCreated(savedInstances);
//    }
//
//    @Override
//    public void onStart(){
//        Log.d("Log","in onStart methods");
//        super.onStart();
//    }
//
//    @Override
//    public void onResume(){
//        Log.d("Log","in onResume methods");
//        super.onResume();
//    }
//
//    @Override
//    public void onPause(){
//        Log.d("Log","in onPause methods");
//        super.onPause();
//    }
//
//    @Override
//    public void onSaveInstanceState(Bundle outState){
//        Log.d("Log","in onSaveInstanceState methods");
//        super.onSaveInstanceState(outState);
//    }
//
//    @Override
//    public void onStop(){
//        Log.d("Log","in onStop methods");
//        super.onStop();
//    }
//
//    @Override
//    public void onDestroyView(){
//        Log.d("Log","in onDestroyView methods");
//        super.onDestroyView();
//    }
//
//    @Override
//    public void onDestroy(){
//        Log.d("Log","in onDestroy methods");
//        super.onDestroy();
//    }
//
//    @Override
//    public void onDetach(){
//        Log.d("Log","in onDetach methods");
//        super.onDetach();
//    }
}
