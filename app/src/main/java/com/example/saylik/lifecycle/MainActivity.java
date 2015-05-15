package com.example.saylik.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Log","in main activity as onCreate");

//        MyFragment frag = new MyFragment();
//        FragmentManager manager = getFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.fragment_id,frag,"helloFragments");
//        transaction.commit();
    }

    @Override
    public void respond(String data){
        FragmentManager manager = getFragmentManager();
        MyFragmentB f2 = (MyFragmentB) manager.findFragmentById(R.id.fragment2);
        f2.changeText(data);
    }


}
