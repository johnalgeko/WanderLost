package com.example.blogandroid1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i) {
		switch (i) {
        case 0:
            //Fragment for HomePage Tab
            return new HomePage();
        case 1:
           //Fragment for PostsPage Tab
            return new PostsPage();
        case 2:
            //Fragment for FolloweresPage Tab
            return new FollowersPage();
        case 3:
            //Fragment for FollowersPage Tab
            return new FollowingPage();
        }
		return null;
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3; //No of Tabs
	}
}
