package com.example.oyo_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.oyo_app.databinding.ActivityDetailBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;

import java.util.ArrayList;


public class detail_Activity extends AppCompatActivity {

    int [] images = {R.drawable.roomimage1,R.drawable.roomimage2,R.drawable.roomimage3,R.drawable.roomimage4};


    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Models> offerlist =new ArrayList<>();
        offerlist.add(new Models(R.drawable.mathura));
        offerlist.add(new Models(R.drawable.mathura));
        offerlist.add(new Models(R.drawable.mathura));
        offerlist.add(new Models(R.drawable.mathura));
        offerlist.add(new Models(R.drawable.mathura));
        offerlist.add(new Models(R.drawable.mathura));
        offerlist.add(new Models(R.drawable.mathura));




        getSupportActionBar().hide();
        TextView hidetext = findViewById(R.id.hidetext);

//        TextView paywithcard = findViewById(R.id.paywithcard);
//        paywithcard.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Card_fragment card_fragment = new Card_fragment();
//                card_fragment.show(getSupportFragmentManager(),"Card Fragment");
//            }
//        });
        TextView webview = findViewById(R.id.Viewguestpolicy);
        LinearLayout paymentbuttonicon = findViewById(R.id.paymentbuttonicon);
        paymentbuttonicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                payment_bottomSheetFragment payment_bottomSheetFragment = new payment_bottomSheetFragment();
                payment_bottomSheetFragment.show(getSupportFragmentManager(),"payment bottomsheet");
            }
        });
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detail_Activity.this,webview_activity.class);
                startActivity(intent);

            }
        });

        TextView viewmore = findViewById(R.id.viewmore);
        viewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hidetext.getVisibility() == View.GONE)
                {
                    hidetext.setVisibility(View.VISIBLE);
                    viewmore.setText("View less");
                }
                else if (hidetext.getVisibility()==View.VISIBLE)
                {
                    hidetext.setVisibility(View.GONE);
                    viewmore.setText("View more");
                }
            }
        });

        TextView viewallamenities = findViewById(R.id.viewallamenities);
        viewallamenities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                all_amenities bottomSheet = new all_amenities();

                bottomSheet.show(getSupportFragmentManager(),"ModalBottomSheet");
            }
        });


        ArrayList<Models> senitisedroomlist = new ArrayList<>();
        ArrayList<Models> reviewlist = new ArrayList<>();
        reviewlist.add(new Models("Tbvc soft","very good","3","23 May 2022",R.drawable.mathura));
        senitisedroomlist.add(new Models(R.drawable.mathura));

        RecyclerView reviewrecyclerview = findViewById(R.id.reviewrecyclerview);
        reviewrecyclerview.setLayoutManager(new LinearLayoutManager(this));
        reviewrecyclerview.setAdapter(new review_Adapter(reviewlist,this));

        binding.sanitisedrecyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        binding.sanitisedrecyclerview.setAdapter(new sanitisedAdapter(senitisedroomlist,this));

        binding.bestofferforyouRecyclerview.setAdapter(new offerAdapter(offerlist,this));
        binding.bestofferforyouRecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));


        detailproductsliderAdapter sliderAdapter = new detailproductsliderAdapter(images,this);
        binding.fullimagesliderdetail.setSliderAdapter(sliderAdapter);
        binding.fullimagesliderdetail.setIndicatorAnimation(IndicatorAnimationType.WORM);
        binding.fullimagesliderdetail.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        binding.detalbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}