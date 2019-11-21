package com.samyam.indoorcricket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.samyam.indoorcricket.adapter.ViewPagerAdapter;
import com.samyam.indoorcricket.fragments.LoginFragment;
import com.samyam.indoorcricket.fragments.RegisterFragment;


public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab = findViewById(R.id.tabLayout);
        pager = findViewById(R.id.pager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new LoginFragment(), "Login");
        viewPagerAdapter.addFragment(new RegisterFragment(), "Register");

        pager.setAdapter(viewPagerAdapter);
        tab.setupWithViewPager(pager);
    }
}
