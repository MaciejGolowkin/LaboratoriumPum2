package com.example.maciek.aplikacjapogodowa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.Zmien_Miejsce)
    Button ZmienMiejsce;
    @BindView(R.id.Write_text)
    EditText Write_text;
    @BindView(R.id.Show_City)
    TextView Show_City;
    @BindView(R.id.Pokaz_Liste)
    Button PokazListe;
    @BindView(R.id.imageView)
    ImageView img;
    @BindView(R.id.Informacja)
    TextView inf;
    @OnClick(R.id.Zmien_Miejsce)
    public void ShowCity() {

        Show_City.setText(Write_text.getText().toString());
        //bundle.putString("klucz" , Show_City.getText().toString());
    }


    @OnClick(R.id.Pokaz_Liste)
    public void ShowList() {

        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Glide.with(this).load("https://cbsbaltimore.files.wordpress.com/2016/11/category_weather_500x500.png?w=310&h=310&crop=1").into(img);
        Intent getData = getIntent();
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String place = bundle.getString("item");
            Show_City.setText(place);
            String information= (String) bundle.get("item2");
            inf.setText(information);
        }




    }
}
