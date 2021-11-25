package com.example.tamagotchi.Interaction;

import android.view.View;

import com.example.tamagotchi.PnlManager;
import com.example.tamagotchi.R;

public class IController implements View.OnClickListener {
    public IModel refMdl;

    public PnlManager refPnlManager;

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnGotoPnl1) {
            refPnlManager.setPnl(1);
        }
        else if(view.getId() == R.id.btnGotoPnl2){
            refPnlManager.setPnl(2);
        }
    }


}
