package com.example.tamagotchi.Configuration;

import android.view.View;

import com.example.tamagotchi.PnlManager;
import com.example.tamagotchi.R;

public class CController implements View.OnClickListener {
    public CModel refMdl;

    public PnlManager refPnlManager;

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnGotoPnl1) {
            refPnlManager.setPnl(1);
        }
        else if(view.getId() == R.id.btnGotoPnl3){
            refPnlManager.setPnl(3);
        }
    }


}
