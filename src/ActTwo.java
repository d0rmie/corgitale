import java.util.Scanner;
public class ActTwo {
    private Corgi playerCorg;
    private Scanner input;
    public ActTwo(Corgi playerCorg, Scanner input){
        this.playerCorg = playerCorg;
        this.input = input;
    }
    public Corgi SecondAct() throws InterruptedException{
        System.out.println("This is the second act.");
        Thread.sleep(2000);
        System.out.println("So, you now have a goal, to find your owner. Perhaps the other dogs in the neighbor could offer advice, if they're around.");
        Thread.sleep(2000);
        System.out.println("You do happen to see another Corgi, Sampson. If you want, you can address him to see if he knows anything about where your master is.");
        boolean sampsonConvoOver = false;
        boolean noticedSampsonMood = false;
        System.out.println("You bork to get Sampson's attention, and he attends immediately to you. His location is pretty consistent, right by the butcher, where he can smell the meat. A choice spot to hang out while his human companion is out.");
        while (!sampsonConvoOver) {
        System.out.println("What do you ask Sampson?\n1.'Hello, kinsman, would you know where my human might be?'2. Sniff his backside, just to be sure everything is okay. 3. Sniff the area of the butcher shop with him.");
        if (noticedSampsonMood) {
            System.out.println("4. Ask Sampson if everything is okay.");
        }
        int choice1 = input.nextInt();
        if (choice1 == 1) {
            System.out.println("Sampson isn't too sure where to find him, since he apparently goes all over the town. Usually, they work by standing in one spot, but not your person.");
        } else if (choice1 == 2) {
            System.out.println("You give him a short sniff, and you notice he is melancholic. This is unusual for Sampson.");
            noticedSampsonMood = true;
        } else if (choice1 == 3) {
            System.out.println("The butcher shop smells like carcasses and blood...in other words BEAUTIFUL!");
        } else if (choice1 == 4 && noticedSampsonMood) {
            System.out.println("Sampson is concerned because there was some crazy drunkard running about town with a knife and turkey leg. He tried to kick him, too. It was scary.");
            while (!sampsonConvoOver) {
                Thread.sleep(2000);
                System.out.println("So strange, you just found someone like that");
                if (this.playerCorg.hasItem("knife")) {
                    System.out.println("As a matter of fact, you have that knife on you!");
                }
                Thread.sleep(2000);
                System.out.println("Well, with this information, what do you think you should ask Sampson?\n1. He tried to hit you? 2. The turkey leg was really nice.");
                if (this.playerCorg.hasItem("knife")) {
                    System.out.println("3. I think I have his knife here, right?");
                }
                int choice2 = input.nextInt();
                if (choice2 == 1) {
                    System.out.println("Yeah, he tried kicking me, which is a silly thing to do, since we're designed specifically to be able to avoid that. And he was super drunk. It was still scary!");
                    sampsonConvoOver = true;
                } else if (choice2 == 2) {
                    System.out.println("Turkey legs are lovely!");
                } else if (choice2 == 3) {
                    System.out.println("Wow, at least he doesn't have that anymore!");
                    sampsonConvoOver = true;
                }
            }
        }          
        }
        System.out.println("While talking to Sampson, someone stumbles up towards the butcher shop. It's the drunkard! He looks very mad!");
        return this.playerCorg;
    }
}
