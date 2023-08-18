import java.util.Scanner;
public class ActOne {
    private Corgi playerCorg;
    private Scanner input;
    public ActOne(Corgi playerCorg, Scanner input){
        this.playerCorg = playerCorg;
        this.input = input;
    }
    public Corgi FirstAct() throws InterruptedException {
        System.out.println("This is the first act");
        Thread.sleep(1000);
        System.out.println("You wake up from a nap in an alleyway. It's pretty dark, but only cause the building is blocking the light.");
        Thread.sleep(2000);
        boolean foundPicture = false;
        int modifier = 0;
        while (!foundPicture) {
            System.out.println("What do you do?\n1.Smell around.\t2.BORK!\t3.Sleep some more!");
            int response = input.nextInt();
            if (response == 1) {
                if (this.playerCorg.rollDice(this.playerCorg.getWits(),3,modifier)) {
                    System.out.println("You find a picture of some human. You feel like you should know this person.");
                    foundPicture = true;
                } else {
                    System.out.println("It smells like rot and poop. In other words: HEAVENLY!");
                }
            } else if (response == 2) {
                System.out.println("You bork, but none seem to come about in response.");
            } else if (response == 3) {
                System.out.println("It is always a good time for a nap!");
                modifier +=1;
            } else {
                System.out.println("Sorry, that didn't make sense. Try again?");
            }
        }
        boolean foundKnife = false;
        Thread.sleep(2000);
        System.out.println("Suddenly, a young man stumbles into the alleyway, clearly impaired from that juice humans drink to be happy. He has a half eaten turkey leg in his hand, when he falls and passes out in the same alleyway, next to a bin the nearby pub uses to store its trash before burning. What do you do?");
        modifier = 0;
        while (!foundKnife) {
            System.out.println("1. Sniff the man. 2. BORK! 3. Eat the turkey leg 4. EAT THE TURKEY LEG!");
            int response2 = input.nextInt();
            if (response2 == 1) {
                if (this.playerCorg.rollDice(this.playerCorg.getWits(),5,modifier)) {
                    System.out.println("You smell the man, who smells like happy juice and grease, along with body odor.");
                    Thread.sleep(2000);
                    System.out.println("As you sniff, you notice a glint of metal! It's a knife! You take the handle in your mouth. Why? It's SHINY!");
                    foundKnife = true;
                    Item knife = new Item("knife","a glinty piece of metal people use to cut stuff and each other.");
                    this.playerCorg.addItem(knife);
                }
                } else if (response2 == 2) {
                    System.out.println("Again, no one seems to notice. So weird. But it is FUN!");
                } else if (response2 == 3 || response2 == 4) {
                    if (this.playerCorg.rollDice(this.playerCorg.getStr(),4,modifier)) {
                    System.out.println("IT TASTES SO GOOD! MEAT IS NICE AND FUN");
                    modifier += 1;
                    } else {
                        System.out.println("You can't quite grasp it from the man's hands");
                    }
                }
            
        }
        Thread.sleep(1000);
        System.out.println("Well, perhaps you should get this guy some help.");
        Thread.sleep(1000);
        System.out.println("Thinking about it though, something is off. You feel like you should be doing something, and you aren't sure what. You can't really remember much.");
        Thread.sleep(1000);
        boolean decision = false;
        modifier = 0;
        while (!decision) {
            System.out.println("What do you do?\n1.Use your corgi powers of deduction to figure this out (WITS " + this.playerCorg.getWits() + "). 2. Run around town with the knife in your hand (AGL "+ this.playerCorg.getAgl() + "). 3. Bite the man to wake him up (STR " + this.playerCorg.getStr() + ").");
            int response3 = input.nextInt();
            if (response3 == 1) {
                if (this.playerCorg.rollDice(this.playerCorg.getWits(),6,modifier)) {
                    System.out.println("As if a premonition from the ghost of Queen Elizabeth herself, you realise what you have had to do all along: YOUR OWNER IS THE GUY IN THE PICTURE. HE CAN GIVE YOU PETS! YOU MUST FIND HIM!");
                    decision = true;
                } else {
                    System.out.println("Nah, just can't figure it out. We'll have to try something else");
                }
            } else if (response3 == 2) {
                if (this.playerCorg.rollDice(this.playerCorg.getAgl(),5,modifier)) {
                    System.out.println("You run about the center of town holding the shiny metal, which attracts a crowd. With the crowd, comes a guard. All the humans are speaking purposeless babble, as they usually do, but the guard says the name of your owner, apparently surprised. You remember you have an owner...and an owner can give you PETS. You must find him.");
                    decision = true;
                } else {
                    System.out.println("Ooof, a little too weighed down from the turkey leg. Gonna have to do this another way.");
                }
            } else if (response3 == 3) {
                if (this.playerCorg.rollDice(this.playerCorg.getStr(),4,modifier)) {
                    System.out.println("You bite down hard on the man's finger, and he rises up with a shocked twist. He tastes godawful, even for a corgi.");
                    Thread.sleep(2000);
                    System.out.println("Speaking of food, you should find your human guardian. You have one of those, you know.");
                    decision = true;
                } else {
                    System.out.println("Just can't muster up the gumption to do it. Probably tastes godawful.");
                    modifier += 1;
                }
            }
        }
        System.out.println("This concludes ACT ONE. THANK YOU FOR PLAYING SO FAR!");
        return this.playerCorg;
    }
}