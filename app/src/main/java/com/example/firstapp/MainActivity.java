package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtSaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSaida = (TextView) findViewById(R.id.txtSaida);
    }

    public void btClick(View v) {
        String txt;
        Button bt = (Button) v;
        txt = bt.getText().toString();
        Log.d("EVT", txt);

        txtSaida.setText(txt);
    }
}