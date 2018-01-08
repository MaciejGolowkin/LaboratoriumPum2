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
        Glide.with(this).load("https://www.google.pl/search?client=firefox-b-ab&dcr=0&biw=1536&bih=732&tbm=isch&sa=1&ei=MsVTWtOHDdPVsAGymoGoBQ&q=weather&oq=weather&gs_l=psy-ab.3..0i67k1l2j0j0i67k1j0l6.12409.13832.0.13969.7.4.0.3.3.0.140.341.3j1.4.0....0...1c.1.64.psy-ab..0.7.370....0.jsq9EBlryE0#imgrc=MAr8HqJO9M6blM:").into(img);
        Intent getData = getIntent();
        Bundle bundle = getIntent().getExtras();


        if (bundle != null) {
            String place = bundle.getString("item");
            Show_City.setText(place);
        }




    }
}
