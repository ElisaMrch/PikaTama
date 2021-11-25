package com.example.tamagotchi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.tamagotchi.PnlManager manager= com.example.tamagotchi.PnlManager.getInstance(this);
        manager.setPnl(1);
    }
}