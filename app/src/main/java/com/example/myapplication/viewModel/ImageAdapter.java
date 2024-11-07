package com.example.myapplication.viewModel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.model.Image;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> implements Filterable {

    public ArrayList<Image> imageList;
    public ArrayList<Image> imageListOld;

    public ImageAdapter(ArrayList<Image> imageList) {
        this.imageList = imageList;
        this.imageListOld = imageList;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item, parent, false);
        return new ViewHolder(view);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private Context context = itemView.getContext();
        private ImageView image;

        public ViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.image_id);
        }
    }
    @Override
    public Filter getFilter() {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageAdapter.ViewHolder holder, int position) {
        Image img = imageList.get(position);
        if(img == null){
            return;
        }
        Glide.with(holder.context).load(img.getUrlimage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}
