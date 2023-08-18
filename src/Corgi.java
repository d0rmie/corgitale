import java.util.ArrayList;

public class Corgi {
private String name;
private int wits;
private int str;
private int agl;
private int health;
private int fatigue;
private int currHealth;
private int currFatigue;
private ArrayList<Item> inventory;
    public Corgi(String name) {
        this.name = name;
        this.inventory = new ArrayList<Item>();
        this.setStats();
    }
public void setStats() {
    while ((this.wits + this.str + this.agl) < 10){
    this.wits = (int)Math.floor(Math.random() * (5-1+1)+1);
    this.agl = (int)Math.floor(Math.random() * (5-1+1)+1);
    this.str = (int)Math.floor(Math.random() * (5-1+1)+1);
    }
    System.out.println("Your little corgi has " + this.wits + " as his wits, then " + this.str + " for his strength, and " + this.agl + " as his agility!");
    this.health = this.str * 100;
    this.fatigue = this.agl * 100;
    this.currFatigue = this.fatigue;
    this.currHealth = this.health;
}
public String getName() {
    return this.name;
}
public int getStr() {
    return this.str;
}
public int getWits() {
    return this.wits;
}
public int getAgl() {
    return this.agl;
}
public int getHealth() {
    return this.health;
}
public int getCurrHealth() {
    return this.currHealth;
}
public void setCurrHealth(int adjust) {
    this.currHealth += adjust;
}
public int getCurrFatigue() {
    return this.currFatigue;
}
public void setCurrFatigue(int adjust) {
    this.currFatigue += adjust;
}
public void setHealth(int changeHealth) {
    this.currHealth += changeHealth;
}
public void setFatigue(int fatigueChange) {
    this.currFatigue += fatigueChange;
}
public boolean rollDice(int skill,int difficulty) {
    int diceRoll = (int) Math.floor(Math.random() * 5 + 1);
    System.out.println(diceRoll + " was your roll. Your skill applied is " + skill);
    return (diceRoll + skill) > difficulty;
}
public boolean rollDice(int skill,int difficulty, int modifier) {
    int diceRoll = (int) Math.floor(Math.random() * 5 + 1);
    System.out.println(diceRoll + " was your roll. Your skill applied is " + skill + ". You also had a modifier of " + modifier);
    return (diceRoll + skill + modifier) > difficulty;
}
public void addItem(Item itemToAdd) {
    this.inventory.add(itemToAdd);
}
public boolean hasItem(String itemToFind) {
    for (Item elm : this.inventory) {
        if (elm.getName().equals(itemToFind)) {
            return true;
        }
    }
    return false;
}
public void displayInventory() {
    for (Item elm : this.inventory) {
        System.out.println(elm.getName());
    }
}
public String toString() {
    return "Your corgi's name is " + this.getName() + "! He has strength of " + this.str + ", then wits of " + this.wits + " and he has an agility rating of " + this.agl + "! Health: " + this.currHealth + "\n Fatigue: " + this.currFatigue;
}
}