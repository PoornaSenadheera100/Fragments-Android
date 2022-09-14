package com.dreamsoft.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeFragment(View view) {
        Fragment fragment;
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (view == findViewById(R.id.btn_frag1)) {
            fragment = new Fragment1();
            ft.replace(R.id.fgmntDefault, fragment);
            ft.commit();
        } else if (view == findViewById(R.id.btn_frag2)) {
            fragment = new Fragment2();
            ft.replace(R.id.fgmntDefault, fragment);
            ft.commit();
        }
    }
}