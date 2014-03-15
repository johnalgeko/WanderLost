package com.example.blogandroid1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.support.v4.app.Fragment;

public class PostsPage extends Fragment {
	Context context;
	String[] place;
	int[] pic;
	ListView list;
	PostsPageAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.followerstab, container,
				false);
		// Generate sample data
		place = new String[] { "Colon", "Carbon", "Divisoria", "London",
				"Japan", "Lapu Lapu" };

		pic = new int[] { R.drawable.brazil,
				R.drawable.banff_national_park_canada, R.drawable.japan,
				R.drawable.boracay, R.drawable.korea, R.drawable.norway };

		list = (ListView) rootView.findViewById(R.id.listview);

		adapter = new PostsPageAdapter(getActivity(), place, pic);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent i = new Intent(getActivity(), PostsSingleItemView.class);
				i.putExtra("place", place);

				i.putExtra("pic", pic);
				i.putExtra("position", position);
				startActivity(i);
			}

		});
		return rootView;
	}
}
