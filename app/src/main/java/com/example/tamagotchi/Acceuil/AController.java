package com.example.tamagotchi.Acceuil;

import android.view.View;

import com.example.tamagotchi.PnlManager;
import com.example.tamagotchi.R;

public class AController implements View.OnClickListener {
    public PnlManager refPnlManager;

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnGotoPnl2) {
            refPnlManager.setPnl(2);
        }

        else if (view.getId() == R.id.btnGotoPnl3) {
            refPnlManager.setPnl(3);
        }
    }

}