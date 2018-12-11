package com.example.uyen.music_43;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.uyen.music_43.home.DownloadFragment;
import com.example.uyen.music_43.home.HomeFragment;
import com.example.uyen.music_43.home.LibraryFragment;
import com.example.uyen.music_43.home.ViewPagerAdaper;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdaper mAdaper;
    private TabLayout mLayout;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addFragment();
    }

    public void initView() {
        mLayout = findViewById(R.id.tabs);
        mPager = findViewById(R.id.view_pager);
    }

    public void addFragment() {
        mAdaper = new ViewPagerAdaper(getSupportFragmentManager());
        mAdaper.addFragment(new HomeFragment());
        mAdaper.addFragment(new DownloadFragment());
        mAdaper.addFragment(new LibraryFragment());
        mPager.setAdapter(mAdaper);
        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mLayout));
        mLayout.setTabsFromPagerAdapter(mAdaper);//deprecated
        mLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mPager));
        mLayout.setupWithViewPager(mPager);
    }


}
