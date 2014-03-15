package com.example.blogandroid1;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class Home extends FragmentActivity {
	ViewPager Tab;
	TabPagerAdapter TabAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// ActionBar actionBar;
		super.onCreate(savedInstanceState);

		/*
		 * this.getWin
		 * down().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		 * WindowManager.LayoutParams.FLAG_FULLSCREEN);
		 */
		setContentView(R.layout.activity_pager);

		final ActionBar bar = getActionBar();
		bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		bar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
		bar.setDisplayUseLogoEnabled(false);

		TabAdapter = new TabPagerAdapter(getSupportFragmentManager());

		Tab = (ViewPager) findViewById(R.id.pager);
		Tab.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
			@Override
			public void onPageSelected(int position) {
				ActionBar actbar;
				actbar = getActionBar();
				actbar.setSelectedNavigationItem(position);
			}
		});
		Tab.setAdapter(TabAdapter);
		// bar = getActionBar();
		// Enable Tabs on Action Bar
		bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		ActionBar.TabListener tabListener = new ActionBar.TabListener() {

			@Override
			public void onTabReselected(android.app.ActionBar.Tab tab,
					FragmentTransaction ft) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

				Tab.setCurrentItem(tab.getPosition());
			}

			@Override
			public void onTabUnselected(android.app.ActionBar.Tab tab,
					FragmentTransaction ft) {
				// TODO Auto-generated method stub

			}
		};
		// Add New Tab
		bar.addTab(bar.newTab().setText("Home").setTabListener(tabListener));
		bar.addTab(bar.newTab().setText("Posts").setTabListener(tabListener));
		bar.addTab(bar.newTab().setText("Followers")
				.setTabListener(tabListener));
		bar.addTab(bar.newTab().setText("Following")
				.setTabListener(tabListener));

	}

}