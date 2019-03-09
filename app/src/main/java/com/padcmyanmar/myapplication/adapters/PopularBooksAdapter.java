package com.padcmyanmar.myapplication.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.padcmyanmar.myapplication.R;
import com.padcmyanmar.myapplication.views.holders.PopularBookViewHolder;

public class PopularBooksAdapter extends RecyclerView.Adapter {

    public PopularBooksAdapter() {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        return new PopularBookViewHolder(inflater.inflate(R.layout.view_pod_popular, viewGroup, false));

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
