package com.example.blogandroid1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class PlacesAdapter extends BaseAdapter {
 
    // Declare Variables
	Context context;
	String[] place;
    int[] place_pic;
    LayoutInflater inflater;
 
    public PlacesAdapter(Context context, String[] place, int[] place_pic) {
    	this.context = context;
        this.place = place;
        this.place_pic = place_pic;
    }
 
    public int getCount() {
        return place.length;
    }
 
    public Object getItem(int position) {
        return null;
    }
 
    public long getItemId(int position) {
        return 0;
    }
 
    public View getView(int position, View convertView, ViewGroup parent) {
 
        // Declare Variables
    	TextView txtplace;
        ImageView placepic;
 
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
        View itemView = inflater.inflate(R.layout.places_listview, parent, false);
 
        txtplace = (TextView) itemView.findViewById(R.id.place);
        
        placepic = (ImageView) itemView.findViewById(R.id.place_pic);
         
        txtplace.setText(place[position]);
 
        placepic.setImageResource(place_pic[position]);
 
        return itemView;
    }
}