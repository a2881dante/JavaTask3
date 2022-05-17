package org.example.keepers;

import org.example.models.Ad;

import java.util.ArrayList;

public class AdKeeper {
    public ArrayList<Ad> ads = new ArrayList<>();

    public AdKeeper() {
        ads.add(new Ad(10, "Dirol"));
        ads.add(new Ad(25, "Renault"));
        ads.add(new Ad(15, "Dior"));
        ads.add(new Ad(30, "Apple"));
    }
}
