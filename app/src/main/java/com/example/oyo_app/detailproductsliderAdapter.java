package com.example.oyo_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class detailproductsliderAdapter extends SliderViewAdapter<detailproductsliderAdapter.Holder> {

    int[] images;
    Context context;

    public detailproductsliderAdapter(int[] images, Context context) {
        this.images = images;
        this.context = context;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.image_sample, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {

        viewHolder.imageView.setImageResource(images[position]);
        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,full_image_Activity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class Holder extends ViewHolder {

        ImageView imageView;

        public Holder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.roomimageview);

        }
    }

}
