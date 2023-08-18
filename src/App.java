import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Corgi ace = new Corgi("Ace");
        System.out.println(ace);
        ActThree thirdAct = new ActThree(ace, new Scanner(System.in));
        
        //ace.rollDice(ace.getAgl(),5,1);
        ActOne act1 = new ActOne(ace,new Scanner(System.in));
        ace = act1.FirstAct();
        System.out.println("This is ace after act 1" + ace);
        ace.displayInventory();
        ActTwo act2 = new ActTwo(ace, new Scanner(System.in));
        ace = act2.SecondAct();
        System.out.println("This is ace after act 2" + ace);
        ace = thirdAct.ThirdAct();
    }
}
