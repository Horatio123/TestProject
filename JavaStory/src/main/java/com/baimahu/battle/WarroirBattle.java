package com.baimahu.battle;

public class WarroirBattle {
    public static void main(String[] args) throws InterruptedException {
        Warrior junye = new Warrior("junye", 800, 100, 20);
        Warrior zhonglei = new Warrior("zhonglei",800, 100,50);
        Warrior zhangfei = new DodgeWarrior("zhangfei",800,150, 60, .5);
        Battle.startFight(zhangfei,junye);
    }
}
