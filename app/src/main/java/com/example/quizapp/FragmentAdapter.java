package com.example.quizapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.quizapp.history.HistoryFragment;
import com.example.quizapp.main.MainFragment;
import com.example.quizapp.settings.SettingsFragment;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MainFragment();
            case 1:
                return new SettingsFragment();
            case 2:
                return new HistoryFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3 ;
    }
}
