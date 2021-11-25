package com.example.tamagotchi.Acceuil;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.tamagotchi.R;

public class AView extends LinearLayout {
    public AController refCtrl;

    public Button btnGotoPnl2;
    public Button btnGotoPnl3;

    public AView(Context context) {
        super(context);

        LayoutInflater inflater= ((Activity)context).getLayoutInflater();
        inflater.inflate(R.layout.pnl_acceuil, this);

        btnGotoPnl2= (Button)findViewById(R.id.btnGotoPnl2);
        btnGotoPnl3= (Button)findViewById(R.id.btnGotoPnl3);

    }

    public void setRefCtrl(AController c) {
        refCtrl= c;
        btnGotoPnl2.setOnClickListener(refCtrl);
        btnGotoPnl3.setOnClickListener(refCtrl);

    }


}
