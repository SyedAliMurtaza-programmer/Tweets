package com.example.tweets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class getAccountId extends AppCompatActivity {
    Spinner sp1;
    TextInputEditText input;
    CustomAdapter adapter;
    String[] names = {"+44", "+92","+98","+91"};
    int[] images = {R.drawable.china,R.drawable.pak,R.drawable.ban,R.drawable.ind};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_account_id);
        sp1 = (Spinner) findViewById(R.id.spinner);
        input = findViewById(R.id.mobile_input);
        adapter = new CustomAdapter(this,names,images);
        sp1.setAdapter(adapter);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    input.setText("+44 - ");
                } else if (i == 1) {
                    input.setText("+92 - ");
                } else if (i == 2) {
                    input.setText("+98 - ");
                } else if (i == 3) {
                    input.setText("+91 - ");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}