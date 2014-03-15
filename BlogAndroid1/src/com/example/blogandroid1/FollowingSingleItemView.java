package com.example.blogandroid1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
 
public class FollowingSingleItemView extends Activity {
	// Declare Variables
	TextView txtname;
    TextView txtpost;
    ImageView profpic;
    String[] name;
    String[] post;
    int[] pic;
    int position;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.following_singleitemview);
        // Retrieve data from MainActivity on item click event
        Intent i = getIntent();
        // Get a single position
        position = i.getExtras().getInt("position");
        // Get the list of name
        name = i.getStringArrayExtra("name");
        // Get the list of post
        post = i.getStringArrayExtra("post");
        // Get the list of pic
        pic = i.getIntArrayExtra("pic");
        
        txtname = (TextView) findViewById(R.id.name);
        txtpost = (TextView) findViewById(R.id.post);
        
        profpic = (ImageView) findViewById(R.id.pic);
 
        txtname.setText(name[position]);
        txtpost.setText(post[position]);
        
        profpic.setImageResource(pic[position]);
    }
}
