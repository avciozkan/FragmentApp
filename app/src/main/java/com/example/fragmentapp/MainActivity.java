package com.example.fragmentapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoFirstFragment(View view){

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        FirstFragment firstFragment= new FirstFragment();
        //fragmentTransaction.add(R.id.frameLayout,firstFragment);
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit();
    }

    public void gotoSecondFragment(View view){

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        SecondFragment secondFragment= new SecondFragment();
        //fragmentTransaction.add(R.id.frameLayout,firstFragment);
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit();
    }
}