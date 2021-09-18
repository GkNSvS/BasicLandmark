package com.gknsvs.basiclandmark;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gknsvs.basiclandmark.databinding.RecyclerviewRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

    private ArrayList<Landmark> landmarks;

    public LandmarkAdapter(ArrayList<Landmark> landmarks) {
        this.landmarks = landmarks;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerviewRowBinding recyclerviewRowBinding=RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(recyclerviewRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {
        holder.binding.RecylerViewTextView.setText(landmarks.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(holder.itemView.getContext(),DetailsActivity.class);
                intent.putExtra("landmark",landmarks.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return landmarks.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{

        private RecyclerviewRowBinding binding;
        public LandmarkHolder(RecyclerviewRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
