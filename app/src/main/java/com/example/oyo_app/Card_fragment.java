package com.example.oyo_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oyo_app.databinding.FragmentCardFragmentBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class Card_fragment extends BottomSheetDialogFragment {


    FragmentCardFragmentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCardFragmentBinding.inflate(inflater,container,false);
        binding.Cardfragmentcloseicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}