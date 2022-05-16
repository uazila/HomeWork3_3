package com.example.homework3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.AbstractList;
import java.util.ArrayList;

public class NomerAdapter extends RecyclerView.Adapter<NomerViewHolder> {
    private AbstractList<String> nomers=new ArrayList<>();

    public NomerAdapter(AbstractList<String> nomers){
        this.nomers = nomers;
    }

    @NonNull
    @Override
    public NomerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NomerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NomerViewHolder holder, int position) {
        holder.bind(nomers.get(position));
    }


    @Override
    public int getItemCount() {
        return nomers.size();
    }
}
