package com.padcmyanmar.myapplication.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.padcmyanmar.myapplication.R;
import com.padcmyanmar.myapplication.views.holders.FeaturesViewHolder;

public class FeaturesAdapter extends RecyclerView.Adapter<FeaturesViewHolder> {

    public FeaturesAdapter() {
    }

    @NonNull
    @Override
    public FeaturesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        return new FeaturesViewHolder(inflater.inflate(R.layout.view_pod_features, viewGroup, false));

    }

    @Override
    public void onBindViewHolder(@NonNull FeaturesViewHolder sliderViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
