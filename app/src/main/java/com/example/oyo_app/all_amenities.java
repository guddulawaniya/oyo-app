package com.example.oyo_app;

import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oyo_app.databinding.FragmentAllAmenitiesBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class all_amenities extends BottomSheetDialogFragment {


    FragmentAllAmenitiesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAllAmenitiesBinding.inflate(inflater,container,false);

        binding.dialogcloseiocn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();

            }
        });


        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}