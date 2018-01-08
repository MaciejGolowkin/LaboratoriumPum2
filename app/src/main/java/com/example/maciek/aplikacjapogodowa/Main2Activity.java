package com.example.maciek.aplikacjapogodowa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Main2Activity extends AppCompatActivity {


    @BindView(R.id.recyclerView)
    RecyclerView recycler_View;

    @BindView(R.id.MojText)
    TextView text;
    private String Wstawienie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        RecyclerView.LayoutManager layout_Manager= new LinearLayoutManager(getApplicationContext());





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
        recycler_View.setLayoutManager(layout_Manager);
        PlaceAdapter placeAdapter= new PlaceAdapter(Places_List);
        recycler_View.setAdapter(placeAdapter);



       /* OnItemClick listener = (view, position) -> {

            Wstawienie = Places_List.get(position).getPlaceName();

            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Bundle bundle = new Bundle();

            bundle.putString("item", Wstawienie);
            intent.putExtras(bundle);
            startActivity(intent);
        };
    */

    }
}
