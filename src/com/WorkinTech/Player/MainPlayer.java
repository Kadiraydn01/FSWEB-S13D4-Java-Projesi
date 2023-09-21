package com.WorkinTech.Player;

public class MainPlayer {
    public static void main(String[] args){
        Player player = new Player("Kadir" , 1000 , Weapon.RIFLE );
        System.out.println("Initial Health " + player.healthRemaining());
        player.loseHealth(25);
        System.out.println("After Damage: " + player.healthRemaining());
        player.restoreHealth(300);
        System.out.println("After Potion:  " + player.healthRemaining());
        player.loseHealth(101);
        System.out.println(player.healthRemaining());
    }
}
