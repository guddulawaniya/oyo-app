package com.example.oyo_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oyo_app.databinding.FragmentOfferBinding;

import java.util.ArrayList;

public class offer_Fragment extends Fragment {

    FragmentOfferBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentOfferBinding.inflate(inflater , container,false);


        ArrayList<Models> list = new ArrayList<>();

        list.add(new Models(R.drawable.cleartax));
        list.add(new Models(R.drawable.cleartax));
        list.add(new Models(R.drawable.cleartax));
        list.add(new Models(R.drawable.cleartax));
        list.add(new Models(R.drawable.cleartax));
        list.add(new Models(R.drawable.cleartax));
        list.add(new Models(R.drawable.cleartax));
        list.add(new Models(R.drawable.cleartax));

        Eciting_offersAdapter adapter = new Eciting_offersAdapter(list,getContext());
        binding.ectingoffrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.ectingoffrecyclerview.setAdapter(adapter);



        return binding.getRoot();
    }
}