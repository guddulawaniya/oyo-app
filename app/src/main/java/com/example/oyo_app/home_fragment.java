package com.example.oyo_app;


import android.content.Intent;
import android.os.Bundle;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;



public class home_fragment extends Fragment {
    com.example.oyo_app.databinding.FragmentHomeFragmentBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = com.example.oyo_app.databinding.FragmentHomeFragmentBinding.inflate(inflater ,container , false);
        // Inflate the layout for this fragment


        binding.menuicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.drawer.openDrawer(Gravity.LEFT);


            }
        });

        binding.notifiIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),notification_Activity.class);
                startActivity(intent);
            }
        });
        binding.viewalloffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        binding.homesearchbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(),Search_Activity.class);
                startActivity(intent);

            }
        });

        ArrayList<Models> list = new ArrayList<>();
        ArrayList<Models> citylist = new ArrayList<>();
        CityAdapter cityAdapter = new CityAdapter(citylist,getContext());
        gridelayoutAdapter adapter = new gridelayoutAdapter(list,getContext());

        citylist.add(new Models(R.drawable.nearbyimage,"Nearby"));
        citylist.add(new Models(R.drawable.vindravan,"Mathura"));
        citylist.add(new Models(R.drawable.mumbaiimage,"Jaypur"));
        citylist.add(new Models(R.drawable.mathura,"Alighad"));
        citylist.add(new Models(R.drawable.mumbaiimage,"Kosi"));
        citylist.add(new Models(R.drawable.vindravan,"Chhata"));
        citylist.add(new Models(R.drawable.mathura,"Govardhan"));
        citylist.add(new Models(R.drawable.vindravan,"Vindravan"));
        citylist.add(new Models(R.drawable.mumbaiimage,"Mathura"));
        citylist.add(new Models(R.drawable.vindravan,"Jaypur"));
        citylist.add(new Models(R.drawable.mathura,"Alighad"));
        citylist.add(new Models(R.drawable.vindravan,"Kosi"));
        citylist.add(new Models(R.drawable.mumbaiimage,"Chhata"));
        citylist.add(new Models(R.drawable.allcityimage,"All City"));

        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.mumbaiimage));
        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.vindravan));
        list.add(new Models(R.drawable.mumbaiimage));
        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.vindravan));
        list.add(new Models(R.drawable.mathura));
        list.add(new Models(R.drawable.mumbaiimage));


        binding.cityrecyclerview.setAdapter(cityAdapter);
        binding.cityrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        binding.recommendedrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.recommendedrecyclerview.setAdapter(adapter);


        return binding.getRoot();
    }
}