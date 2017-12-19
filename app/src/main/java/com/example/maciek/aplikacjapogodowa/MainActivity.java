package com.example.maciek.aplikacjapogodowa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Button_Name=findViewById(R.id.ZmienMiejsce);
        final EditText Edit_Name=findViewById(R.id.Write_text);
        final TextView Text_Name=findViewById(R.id.Show_City);

        Button_Name.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Text_Name.setText(Edit_Name.getText().toString());
            }
        });

    }
}
