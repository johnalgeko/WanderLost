package com.example.blogandroid1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.support.v4.app.Fragment;

public class FollowingPage extends Fragment {
	String[] name;
	String[] post;
	int[] pic;
	ListView list;
	FollowingAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.followingtab, container,
				false);
		// Generate sample data
		name = new String[] { "Kris", "Lay", "Chen", "Xuimin", "DO", "Kai" };

		post = new String[] { "Kung Fu Panda", "Rich Leader!",
				"Eye Liner King!", "Happy Virus!", "Baby Hunnie", "Cutie Dear" };

		pic = new int[] { R.drawable.kris, R.drawable.lay, R.drawable.chen,
				R.drawable.xuimin, R.drawable.kyungsoo, R.drawable.kai };

		list = (ListView) rootView.findViewById(R.id.listview);

		adapter = new FollowingAdapter(getActivity(), name, post, pic);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent i = new Intent(getActivity(),
						FollowingSingleItemView.class);
				i.putExtra("name", name);
				i.putExtra("post", post);
				i.putExtra("pic", pic);
				i.putExtra("position", position);
				startActivity(i);
			}

		});
		return rootView;
	}
}
