package project.game.rpg;

import java.util.Random;

/**
 * Created by Dan on 3/21/2016.
 */
public class Organism {

    int health;
    int height;
    int weight;
    int strength;
    int intelligence;

    public  Organism(int health, int height, int weight, int strength, int intelligence){
        this.health = health;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.intelligence =intelligence;
    }

    void attack(){}


}

class Player extends Organism {

    protected int legs = 2;
    protected int arms = 2;
    String name = "Player";

    public Player(int health, int height, int weight, int strength, int intelligence) {
        super(health, height, weight, strength, intelligence);
    }


    void attack(Enemy e){
        //attack method
        Random r = new Random();
        // attack a random amount based on strength.
        int damage = r.nextInt(strength);
        System.out.println("Player attacks" + e.getName() + " for " + damage + "damage!");
        e.health -=damage;
    }

    String getName(){
        return this.name;
    }
    void setName(String name){this.name = name;}

}

class Enemy extends Organism {

    String name = "Enemy";

    public Enemy(int health, int height, int weight, int strength, int intelligence) {
        super(health, height, weight, strength, intelligence);
    }

    void attack(Player p){

        //attack method
        Random r = new Random();
        // attack a random amount based on strength.
        int damage = r.nextInt(strength);
        System.out.println(this.name + " attacks " + p.getName() + " for " + damage + "damage!");
        p.health -=damage;
    }

    String getName(){
        return this.name;
    }
    void setName(String name){this.name = name;}

}

