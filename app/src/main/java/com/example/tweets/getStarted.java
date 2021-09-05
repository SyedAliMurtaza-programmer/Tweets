package com.example.tweets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class getStarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

    }
    public void gettingAccountId(View view){
        Intent intent = new Intent(this,getAccountId.class);
        startActivity(intent);
    }
}