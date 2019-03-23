package com.baimahu.battle;

public class Warrior {
    protected String name = "Warrior";
    public int health = 100;
    public int attackMax;
    public int defendMax;

    public Warrior(){}
    public Warrior(String name, int hea, int attack, int defend){
        this.name = name;
        this.health = hea;
        this.attackMax = attack;
        this.defendMax = defend;
    }

    public int attack(){
        return (int)(Math.random() * attackMax);
    }
    public int defend(){
        return (int)(Math.random() * defendMax);
    }
}
