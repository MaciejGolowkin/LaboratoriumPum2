package com.example.maciek.aplikacjapogodowa;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

/**
 * Created by Maciek on 03.01.2018.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>{

    ArrayList<Place> Places_List= new ArrayList<>();
    private com.example.maciek.aplikacjapogodowa.OnItemClick listener;


    PlaceAdapter(ArrayList<Place> places, com.example.maciek.aplikacjapogodowa.OnItemClick listener) {
        Places_List = places;
        this.listener=listener;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_of_place, null);
        return new ViewHolder(itemLayoutView,listener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setNazwa(Places_List.get(position).getPlaceName());
        holder.setInformacja(Places_List.get(position).getPlaceInformation());
    }

    @Override
    public int getItemCount() {
        return Places_List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.textView4)
        TextView Nazwa;

        @BindView(R.id.textView6)
        TextView Informacja;



        public com.example.maciek.aplikacjapogodowa.OnItemClick listener;


        //Z wykładu

        public ViewHolder(View itemView, com.example.maciek.aplikacjapogodowa.OnItemClick listener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.listener = listener;
            itemView.setOnClickListener(this);
        }

        public void setNazwa(String nazwa)
        {
            Nazwa.setText(nazwa);
        }

        public void setInformacja(String informacja)
        {
            Informacja.setText(informacja);
        }
        @Override
        public void onClick(View view) {
            listener.onItemClick(view, getAdapterPosition()); //clicked item position
        }



    }
}
