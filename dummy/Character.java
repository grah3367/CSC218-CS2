package project.dummy;


public class Character {

    // object data
    private double health;
    private double strength;
    private double dexterity;
    private double wisdom;
    private double accuracy;

    // object constructor
    public Character(double h, double s, double d, double w, double a) {
        health = h;
        strength = s;
        dexterity = d;
        wisdom = w;
        accuracy = a;
    }

    public void getHP(){
        System.out.println( Double.toString(health));
    }

    // access object data
    double getHealth() {
        return this.health;
    }

    double getStrength() {
        return this.strength;
    }

    double getDexterity() {
        return this.dexterity;
    }

    double getWisdom() {
        return this.wisdom;
    }

    double getAccuracy() {
        return this.accuracy;
    }

    // modify object data
    void setHealth(double h) {
        this.health = h;
    }

    void setStrength(double s) {
        this.strength = s;
    }

    void setDexterity(double d) {
        this.dexterity = d;
    }

    void setWisdom(double w) {
        this.wisdom = w;
    }

    void setAccuracy(double a) {
        this.accuracy = a;
    }

} // end Character class
