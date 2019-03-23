package com.baimahu.battle;

import java.util.Random;

public class DodgeWarrior extends Warrior {
    public double dodgePercent;
    public Random rand = new Random();
    public DodgeWarrior(String name, int health, int attack, int defend, double dodgePercent){
        super(name, health, attack, defend);
        this.dodgePercent = dodgePercent;
    }

    @Override
    public int defend() {
        int defend;
        if(dodgePercent>rand.nextDouble()){
            defend = 1000;
        }else {
            defend = (int)(Math.random()*defendMax);
        }

        return defend;
    }
}
