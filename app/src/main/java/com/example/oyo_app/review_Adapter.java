package com.example.oyo_app;

import android.content.Context;
import android.media.Rating;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class review_Adapter extends RecyclerView.Adapter<review_Adapter.viewholder>{

    ArrayList<Models> list;
    Context context;

    public review_Adapter(ArrayList<Models> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.review_sample,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Models models = list.get(position);
        holder.reviewname.setText(models.getReviewusername());
        holder.comment.setText(models.getComment());
//        holder.rating.setText(models.getRating());
        holder.date.setText(models.getDate());
        holder.image.setImageResource(models.getReviewimage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class  viewholder extends RecyclerView.ViewHolder {
        TextView reviewname,comment,date,rating;
        ImageView   image;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            reviewname = itemView.findViewById(R.id.review_username);
            comment = itemView.findViewById(R.id.cm);
//            rating = itemView.findViewById(R.id.userreviewrating);
            date = itemView.findViewById(R.id.reviewdate);
            image = itemView.findViewById(R.id.reviewimage);

        }
    }
}
