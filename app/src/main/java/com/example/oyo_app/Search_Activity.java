package com.example.oyo_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.oyo_app.databinding.ActivitySearchBinding;

import java.util.ArrayList;

public class
Search_Activity extends AppCompatActivity {

    ActivitySearchBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        ArrayList<Models> list = new ArrayList<>();
        list.add(new Models("Vindavan"));
        list.add(new Models("Prem Mandir Vrindavan"));
        list.add(new Models("Banke Bihari Temple"));
        list.add(new Models("Fogle Ashramam"));
        list.add(new Models("MVT Guesthouse & Resaurant"));
        list.add(new Models("Kadamb Spiritual Stay"));
        ArrayList<Models> roomlist = new ArrayList<>();
        roomlist.add(new Models(R.drawable.wirzardimage));
        roomlist.add(new Models(R.drawable.mumbaiimage));
        roomlist.add(new Models(R.drawable.vindravan));
        roomlist.add(new Models(R.drawable.wirzardimage));
        roomlist.add(new Models(R.drawable.mathura));
        roomlist.add(new Models(R.drawable.mumbaiimage));
        roomlist.add(new Models(R.drawable.mathura));
        roomlist.add(new Models(R.drawable.vindravan));
        roomlist.add(new Models(R.drawable.mathura));

        ArrayList<Models> destinationlist = new ArrayList<>();
        destinationlist.add(new Models(R.drawable.mathura,"Mathura"));
        destinationlist.add(new Models(R.drawable.mumbaiimage,"Mumbai"));
        destinationlist.add(new Models(R.drawable.vindravan,"Vindavan"));
        destinationlist.add(new Models(R.drawable.mathura,"Mathura"));
        destinationlist.add(new Models(R.drawable.vindravan,"Vindavan"));
        destinationlist.add(new Models(R.drawable.mumbaiimage,"Mumbai"));
        destinationlist.add(new Models(R.drawable.mathura,"Mathura"));

        binding.locationRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        binding.locationRecyclerview.setAdapter(new LocationAdapter(list,this));

        binding.trendingoyoRecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        binding.trendingoyoRecyclerview.setAdapter(new gridelayoutAdapter(roomlist,this));

        binding.senitisedrecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        binding.senitisedrecyclerview.setAdapter(new gridelayoutAdapter(roomlist,this));


        binding.destinationrecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        binding.destinationrecyclerview.setAdapter(new destinationAdapter(destinationlist,this));
    }
}