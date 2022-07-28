package com.example.oyo_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.oyo_app.databinding.FragmentBookingsBinding;

public class bookings_Fragment extends Fragment {

    FragmentBookingsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBookingsBinding.inflate(inflater,container,false);

        binding.bookingback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),MainActivity.class));
            }
        });

        binding.bookbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),Search_Activity.class);
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}