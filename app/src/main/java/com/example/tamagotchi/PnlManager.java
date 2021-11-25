package com.example.tamagotchi;

import android.app.Activity;
import android.content.Context;

import com.example.tamagotchi.Acceuil.AController;
import com.example.tamagotchi.Acceuil.AView;
import com.example.tamagotchi.Configuration.CController;
import com.example.tamagotchi.Configuration.CModel;
import com.example.tamagotchi.Configuration.CView;
import com.example.tamagotchi.Interaction.IController;
import com.example.tamagotchi.Interaction.IView;
import com.example.tamagotchi.Interaction.IModel;

public class PnlManager {
    private static PnlManager instance= null;

    private int pnl;

    private AView view1;
    private CView view2;
    private IView view3;
    private AController ctrl1;
    private CController ctrl2;
    private IController ctrl3;
    private CModel mdl2;
    private IModel mdl3;



    public Activity refAct;

    private PnlManager(Context context) {
        pnl= -1;
        ctrl1= new AController();
        view1= new AView(context);
        mdl2= new CModel();
        ctrl2= new CController();
        view2= new CView(context);
        mdl3= new IModel();
        ctrl3=new IController();
        view3=new IView(context);

        view1.setRefCtrl(ctrl1);
        ctrl1.refPnlManager= this;

        view2.refMdl= mdl2;
        ctrl2.refMdl= mdl2;
        view2.setRefCtrl(ctrl2);
        ctrl2.refPnlManager= this;

        view3.refMdl= mdl3;
        ctrl3.refMdl= mdl3;
        view3.setRefCtrl(ctrl3);
        ctrl3.refPnlManager= this;



        refAct= (Activity)context;


    }

    public static PnlManager getInstance(Context context) {
        if (instance == null) {
            instance = new PnlManager(context);
        }
        return instance;
    }

    public void setPnl(int p) {
        if (p == 1 && pnl != 1) {
            refAct.setContentView(view1);
            pnl= 1;
        }
        if (p == 2 && pnl != 2) {
            refAct.setContentView(view2);
            pnl= 2;
        }
        if (p == 3 && pnl != 3) {
            refAct.setContentView(view3);
            pnl= 3;
        }
    }
}


