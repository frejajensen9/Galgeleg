package com.example.galgeleg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Galgelogik spil = new Galgelogik();
        spil.startNytSpil();

        spil.logStatus();

        spil.gætBogstav("e");
        spil.logStatus();

        spil.gætBogstav("a");
        spil.logStatus();
        System.out.println("" + spil.getAntalForkerteBogstaver());
        System.out.println("" + spil.getSynligtOrd());
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("i");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("s");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("r");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("l");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("b");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("o");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("t");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("n");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("m");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("y");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("p");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;

        spil.gætBogstav("g");
        spil.logStatus();
        if (spil.erSpilletSlut()) return;
    }
}