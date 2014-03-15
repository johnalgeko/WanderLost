package com.example.blogandroid1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.view.LayoutInflater;
 
public class PostsSingleItemView extends Activity {
	// Declare Variables
	TextView txtname;
    TextView txtpost;
    ImageView profpic;
    String[] name, place;
    String[] post;
    int[] pic, place_pic;
    int position;
    ListView list;
    PlacesAdapter adapter;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        place = new String[] { "Colon", "Carbon", "Divisoria", "London","Japan", "Lapu Lapu"  };

        place_pic = new int[] { R.drawable.colon, R.drawable.thailand,R.drawable.boracay, R.drawable.london,
                R.drawable.japan, R.drawable.lapulapu  };
        
        setContentView(R.layout.followers_singleitemview);
        Intent i = getIntent();
        position = i.getExtras().getInt("position");
        name = i.getStringArrayExtra("name");
        post = i.getStringArrayExtra("post");
        pic = i.getIntArrayExtra("pic");
        
        txtname = (TextView) findViewById(R.id.name);
        txtpost = (TextView) findViewById(R.id.post);
        
        profpic = (ImageView) findViewById(R.id.pic);
 
        txtname.setText(name[position]);
        txtpost.setText(post[position]);
        profpic.setImageResource(pic[position]);  
        
       
 
        list = (ListView) this.findViewById(R.id.listview);
 
        adapter = new PlacesAdapter(getApplication(), place, place_pic);
        
        list.setAdapter(adapter);
    }
}
