package com.example.blogandroid1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class FollowingAdapter extends BaseAdapter {
 
    // Declare Variables
	Context context;
	String[] name;
    String[] post;
    int[] pic;
    LayoutInflater inflater;
 
    public FollowingAdapter(Context context, String[] name, String[] post, int[] pic) {
    	this.context = context;
        this.name = name;
        this.post = post;
        this.pic = pic;
    }
 
    public int getCount() {
        return name.length;
    }
 
    public Object getItem(int position) {
        return null;
    }
 
    public long getItemId(int position) {
        return 0;
    }
 
    public View getView(int position, View convertView, ViewGroup parent) {
 
        // Declare Variables
    	TextView txtname;
        TextView txtpost;
        ImageView profpic;
 
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
        View itemView = inflater.inflate(R.layout.following_listview_item, parent, false);
 
        txtname = (TextView) itemView.findViewById(R.id.name);
        txtpost = (TextView) itemView.findViewById(R.id.post);
        
        profpic = (ImageView) itemView.findViewById(R.id.pic);
 
        txtname.setText(name[position]);
        txtpost.setText(post[position]);
 
        profpic.setImageResource(pic[position]);
 
        return itemView;
    }
}