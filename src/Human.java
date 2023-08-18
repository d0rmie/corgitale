public class Human {
    private String name;
    private int str;
    private int agl;
    private int wits;
    private int health;
    private int currHealth;
    private int fatigue;
    private int currFatigue;

    public Human(String name, int str, int agl, int wits) {
        this.name = name;
        this.str = str;
        this.agl = agl;
        this.wits = wits;
        this.health = this.str * 100;
        this.fatigue = this.agl * 25;
        this.currHealth = this.health;
        this.currFatigue = this.fatigue;
    }
    public String getName() {
        return this.name;
    }
    public int getStr() {
        return this.str;
    }
    public int getAgl() {
        return this.agl;
    }
    public int getWits() {
        return this.wits;
    }
    public int getCurrHealth(){ 
        return this.currHealth;
    }
    public int getCurrFatigue() {
        return this.currFatigue;
    }
    public void setCurrHealth(int adjust) {
        this.currHealth += adjust;
    }
    public void setCurrFatigue(int adjust) {
        this.currFatigue += adjust;
    }
    
}
