package com.example.tugasbottomnav;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VacationAdapter extends RecyclerView.Adapter<VacationAdapter.ViewHolder> {
    private List<VacationModel>models;
    private OnItemClickListener<VacationModel> clickListener;


    public void setClickListener(OnItemClickListener<VacationModel> clickListener) {
        this.clickListener = clickListener;
    }


    @NonNull
    @Override
    public VacationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(models.get(position));

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public void setVacation(ArrayList<VacationModel> models){
        this.models = models;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView ivVacayPhoto;
        TextView tvVacayPlaces;
        TextView tvVacayDesc;
        VacationModel model;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            ivVacayPhoto = itemView.findViewById(R.id.iv_photo);
            tvVacayPlaces = itemView.findViewById(R.id.tv_name);
            tvVacayDesc = itemView.findViewById(R.id.tv_sum);

        }

        public void onBind(VacationModel model){
            this.model = model;
            ivVacayPhoto.setImageResource(model.getPhoto());
            tvVacayPlaces.setText(model.getName());
            tvVacayDesc.setText(model.getSummary());
        }

        @Override
        public void onClick(View view){
            clickListener.onClick(model);
        }
    }
}

