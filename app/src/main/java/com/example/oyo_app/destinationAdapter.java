package com.example.oyo_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class destinationAdapter extends RecyclerView.Adapter<destinationAdapter.viewholder>{

    ArrayList<Models> list;
    Context context;

    public destinationAdapter(ArrayList<Models> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.destination_sample,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Models models = list.get(position);
        holder.cityname.setText(models.getCityname());
        holder.cityimages.setImageResource(models.getCityimage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class  viewholder extends RecyclerView.ViewHolder {
        ImageView cityimages;
        TextView cityname;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            cityimages = itemView.findViewById(R.id.destinationimage);
            cityname = itemView.findViewById(R.id.destinationtext);
        }
    }
}
