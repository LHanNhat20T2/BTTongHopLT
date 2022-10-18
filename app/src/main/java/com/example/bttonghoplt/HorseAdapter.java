package com.example.bttonghoplt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorseAdapter extends RecyclerView.Adapter<HorseAdapter.HorseViewHolder> {
    private List<Horse> listHorse;

    public HorseAdapter(List<Horse> listHorse) {
        this.listHorse = listHorse;
    }

    @NonNull
    @Override
    public HorseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horse, parent, false);
        return new HorseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorseViewHolder holder, int position) {
//    set dữ liệu lên item
        Horse horse = listHorse.get(position);
        if (horse == null) {
            return;
        }
        holder.imgHorse.setImageResource(horse.getImage());
        holder.tvnameHorse.setText(horse.getName());

    }

    @Override
    public int getItemCount() {
        if (listHorse != null){
            return listHorse.size();
          }
    return 0;
}

    public class HorseViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgHorse;
        private TextView tvnameHorse;

        public  HorseViewHolder(@NonNull View itemView) {
            super(itemView);
            imgHorse = itemView.findViewById(R.id.img_horse);
            tvnameHorse = itemView.findViewById(R.id.tv_name_horse);
        }
    }
}
