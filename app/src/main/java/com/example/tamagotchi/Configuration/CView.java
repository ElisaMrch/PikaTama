package com.example.tamagotchi.Configuration;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.tamagotchi.R;

public class CView extends LinearLayout{
    public CModel refMdl;
    public CController refCtrl;

    public Button btnGotoPnl1;
    public Button btnGotoPnl3;

    public CView(Context context) {
        super(context);

        LayoutInflater inflater= ((Activity)context).getLayoutInflater();
        inflater.inflate(R.layout.pnl_configuration, this);


        btnGotoPnl1= (Button)findViewById(R.id.btnGotoPnl1);
        btnGotoPnl3= (Button)findViewById(R.id.btnGotoPnl3);


    }

    public void setRefCtrl(CController c) {
        refCtrl= c;
        btnGotoPnl1.setOnClickListener(refCtrl);
        btnGotoPnl3.setOnClickListener(refCtrl);

    }


}
