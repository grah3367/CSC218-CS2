package project.game.rpg;


import java.util.Random;
import java.util.Scanner;
import java.lang.CharSequence;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rando = new Random(); // get a random number

        Player Player = new Player(100,56,200,10,25);
        System.out.print("please Enter a character name:");
        Player.name = input.nextLine();

        System.out.println("Character Name: "+ Player.name);
        System.out.println(Player.name+"'s Health = "+ Player.health);
        System.out.println(Player.name+"'s height = "+ Player.height +" inches");
        System.out.println(Player.name+"'s weight = "+ Player.weight + " lbs");
        System.out.println(Player.name+"'s strength = "+ Player.strength + " pts");
        System.out.println(Player.name+"'s intelligence = "+ Player.intelligence + " pts");


    }
}
