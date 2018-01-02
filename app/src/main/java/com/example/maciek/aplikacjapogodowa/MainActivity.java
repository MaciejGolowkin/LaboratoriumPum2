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

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.ZmienMiejsce)
    Button ZmienMiejsce;
    @BindView(R.id.Write_text)
    EditText Write_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button Button_Name=findViewById(R.id.ZmienMiejsce);
        //final EditText Edit_Name=findViewById(R.id.Write_text);
        final TextView Text_Name=findViewById(R.id.Show_City);
        Button Button_show= findViewById(R.id.PokazListe);
        final Intent intent = new Intent(this, Main2Activity.class);
        final Bundle bundle = new Bundle();
        ButterKnife.bind(this);

        intent.putExtras(bundle);

        ZmienMiejsce.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Text_Name.setText(Write_text.getText().toString());
                bundle.putString("klucz" , Text_Name.getText().toString());
            }
        });

        Button_show.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}
