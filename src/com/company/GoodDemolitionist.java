package com.company;

import java.util.Random;

public class GoodDemolitionist extends Demolitionist {
    public int blow(Mine mine) {
        int took;
        Random random = new Random();
        int explode = random.nextInt(11);
        if (mine.getDiamonds() >= explode) {
            mine.setDiamonds(mine.getDiamonds() - explode);
            took = explode;
        } else {
            took = mine.getDiamonds();
            mine.setDiamonds(0);
        }
        System.out.println("Я хороший подрывник");
        diamonds += took;
        return took;
    }
}
