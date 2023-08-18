import java.util.Scanner;

public class ActThree {
    private Scanner input;
    private Corgi playerCorg;
    private Human drunkardNPC;
    public ActThree(Corgi playerCorg, Scanner input) {
        this.playerCorg = playerCorg;
        this.input = input;
        this.drunkardNPC = new Human("Drunkard",4,2,1);

    }
    public boolean BigFight(Corgi playerCorg, Human enemyHuman) {
        while ((playerCorg.getCurrHealth() > 0) && enemyHuman.getCurrHealth() > 0) {
            System.out.println("Health: " + playerCorg.getCurrHealth() + "\t FATIGUE: " + playerCorg.getCurrFatigue());
            System.out.println("ENEMY HEALTH: " + enemyHuman.getCurrHealth() + "\tFATIGUE: " + enemyHuman.getCurrFatigue());
            System.out.println("What do you do? 1. Fight\t2.Flee");
            int fightChoice = input.nextInt();
            int modifier = 0;
            if (fightChoice == 1) {
                if (playerCorg.getWits() > enemyHuman.getWits()) {
                    modifier += 1;
                }
                if (playerCorg.getCurrFatigue() > enemyHuman.getCurrFatigue()) {
                    modifier += 1;
                }
                if (playerCorg.rollDice(playerCorg.getStr(),enemyHuman.getAgl() + enemyHuman.getWits(),modifier)) {
                    enemyHuman.setCurrHealth(-(playerCorg.getStr() * 25));
                } else {
                    playerCorg.setCurrFatigue(-50);
                }
            }
            else if (fightChoice == 2) {
                if (playerCorg.getWits() > enemyHuman.getWits()) {
                    modifier += 1;
                }
                if (playerCorg.getCurrFatigue() > enemyHuman.getCurrFatigue()) {
                    modifier += 1;
                }
                if (playerCorg.rollDice(playerCorg.getAgl(),enemyHuman.getStr()+enemyHuman.getWits(),modifier)) {
                    enemyHuman.setCurrFatigue(-100);
                } else {
                    playerCorg.setCurrHealth(-(enemyHuman.getStr()*50));
                }
            }
        }
        if (playerCorg.getCurrHealth() > 0) {
            System.out.println("You won the fight!");
            return true;
        } else {
            System.out.println("Oh no! You lost!");
            return false;
        }
    }
    public Corgi ThirdAct() throws InterruptedException {
        System.out.println("You feel it in your heart. It is time to square up with the town menace. He is not happy, and will continue to kick and harass little doggies until he is stopped!");
        if (this.BigFight(this.playerCorg,this.drunkardNPC)) {
            System.out.println("You stand over the defeated drunkard, unhappy to have hurt someone, but glad you've protected your friend and probably the citizens. He lays there, still gurgling a little.");
            Thread.sleep(2000);
            System.out.println("Town residents gather about, not sure what's going on.");
            Thread.sleep(2000);
            System.out.println("of course, with a crowd, comes the guards.");
            Thread.sleep(2000);
            System.out.println("It seems like the townspeople are concerned you might be dangerous, but a guard holding a spear comes to the forefront of the crowd, his face obscured by a helmet, but still familiar.");
            Thread.sleep(3000);
            System.out.println("IT IS YOUR HUMAN!");
            Thread.sleep(1000);
            System.out.println("He gives you pets as his partner takes the drunkard in, since they must have already been looking for him.");
            System.out.println("You go home once your human's shift is over, and you sleep beside him in his bed with his wife.");
            Thread.sleep(3000);
            System.out.println("All is well with the world, and thank you for playing Corgitale!");
        } else {
            System.out.println("GAME OVER!");
        }
        return this.playerCorg;
    }
}
