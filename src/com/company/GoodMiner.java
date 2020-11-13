package com.company;

import java.util.Random;

public class GoodMiner extends Miner {
    public void ToString() {
        System.out.println("Я хороший шахтер");
    }

    public int kopat(Mine mine, int amount) {
        int took = 0;
        Random random = new Random();

        while (pickaxe.getHp() > 0 && amount > 0) {
            mine.setDiamonds(mine.getDiamonds() - 1);
            pickaxe.setHp(pickaxe.getHp() - random.nextInt(5));
            took += 2;
            amount -= 1;
            if (mine.getDiamonds() == 0) {
                break;
            }
        }
        this.ToString();
        if (pickaxe.getHp() <= 0) {
            pickaxe = getPickaxe();
        }

        diamonds += took;
        return took;
    }

}
