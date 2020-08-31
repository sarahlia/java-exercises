package com.sarahlia;

public class GameApp {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Sarah";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 15;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 7;
//        player.health = 150; //we DON'T want to let outsiders to access our fields or methods this way! So let's use the EnhancedPlayer class instead.
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Sarah", 175, "sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
