package com.example.homework3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NomerViewHolder extends RecyclerView.ViewHolder {

    private TextView tvnomer;

    public NomerViewHolder(@NonNull View itemView) {
        super(itemView);
        tvnomer=itemView.findViewById(R.id.nomer);
    }
    public void bind(String nomer){
tvnomer.setText(nomer);
    }
}
