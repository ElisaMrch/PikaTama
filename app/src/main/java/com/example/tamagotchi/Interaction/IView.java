package com.example.tamagotchi.Interaction;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.tamagotchi.R;



public class IView extends LinearLayout{
    public IModel refMdl;
    public IController refCtrl;

    public Button btnGotoPnl1;
    public Button btnGotoPnl2;

    public IView(Context context) {
        super(context);

        LayoutInflater inflater= ((Activity)context).getLayoutInflater();
        inflater.inflate(R.layout.pnl_interaction, this);


        btnGotoPnl1= (Button)findViewById(R.id.btnGotoPnl1);
        btnGotoPnl2= (Button)findViewById(R.id.btnGotoPnl2);

    }

    public void setRefCtrl(IController c) {
        refCtrl= c;
        btnGotoPnl1.setOnClickListener(refCtrl);
        btnGotoPnl2.setOnClickListener(refCtrl);


    }


}