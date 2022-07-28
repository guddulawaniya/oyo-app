package com.example.oyo_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oyo_app.databinding.FragmentPaymentBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class payment_bottomSheetFragment extends BottomSheetDialogFragment {


    FragmentPaymentBottomSheetBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPaymentBottomSheetBinding.inflate(inflater, container,false);

        binding.paywithcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Card_fragment card_fragment = new Card_fragment();
                card_fragment.show(getChildFragmentManager(),"card fragment");
            }
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}