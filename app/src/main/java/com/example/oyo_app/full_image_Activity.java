package com.example.oyo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.oyo_app.databinding.ActivityFullImageBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;

public class full_image_Activity extends AppCompatActivity {


    ActivityFullImageBinding binding;
    int [] images = {R.drawable.roomimage1,R.drawable.roomimage2,R.drawable.roomimage3,R.drawable.roomimage4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFullImageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ImageView cross = findViewById(R.id.crossbutton);
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        productsliderAdapter sliderAdapter = new productsliderAdapter(images);
        binding.fullimageslider.setSliderAdapter(sliderAdapter);
        binding.fullimageslider.setIndicatorAnimation(IndicatorAnimationType.WORM);
        binding.fullimageslider.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
    }
}