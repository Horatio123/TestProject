package com.baimahu.battle;

public class Battle {
    public static int round = 1;
    public static void startFight(Warrior warriorA, Warrior warriorB) throws InterruptedException {
        while (true){
            if (getAttackResult(warriorA, warriorB) < 0){
                System.out.printf("%s defeat %s\n", warriorA.name, warriorB.name);
                break;
            }else if(getAttackResult(warriorB, warriorA) < 0){
                System.out.printf("%s defeat %s\n", warriorB.name, warriorA.name);
                break;
            }
        }
    }

    public static int getAttackResult(Warrior a, Warrior b) throws InterruptedException {
       int att = a.attack();
       int def = b.defend();
        int dmg2b = att - def;
        if (dmg2b >= 0){
            b.health -= dmg2b;
        }else {
            dmg2b = 0;
        }
        System.out.printf("Round %d: attack is %d, defend is %d, damage to %s is %d\n",round, att,def,b.name, dmg2b);
        System.out.printf("now the health of %s is %d\n\n", b.name, b.health);
        round++;
        Thread.sleep(1000);
        return b.health;
    }
}
