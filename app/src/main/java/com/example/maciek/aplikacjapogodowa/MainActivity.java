package com.example.maciek.aplikacjapogodowa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
    TextView PokazListe;
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




    }
}
