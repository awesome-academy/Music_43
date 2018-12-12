package com.example.uyen.music_43.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdaper extends FragmentPagerAdapter {

    private List<Fragment> mFragment;

    public ViewPagerAdaper(FragmentManager fm) {
        super(fm);
        mFragment = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int i) {
        return mFragment.get(i);
    }

    @Override
    public int getCount() {
        return mFragment.size();
    }

    public void addFragment(Fragment fragment){
        mFragment.add(fragment);
    }
}
