package com.example.maciek.aplikacjapogodowa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recycler_View;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView.LayoutManager layout_Manager= new LinearLayoutManager(getApplicationContext());

        recycler_View.setLayoutManager(layout_Manager);
        Place p1= new Place();
        p1.setPlaceName("Warszawa");
        p1.setPlaceInformation("Pada śnieg");
        Place p2= new Place();
        p2.setPlaceName("Opole");
        p2.setPlaceInformation("Słonecznie");
        Place p3= new Place();
        p3.setPlaceName("Zabrze");
        p3.setPlaceInformation("Pochmurnie");
        ArrayList<Place> Places_List= new ArrayList<>();
        Places_List.add(p1);
        Places_List.add(p2);
        Places_List.add(p3);
        PlaceAdapter placeAdapter= new PlaceAdapter(Places_List);
        recycler_View.setAdapter(placeAdapter);
    }
}
