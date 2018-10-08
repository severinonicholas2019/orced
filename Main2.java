iimport java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
       // System.out.print("What is your name: ");
       // String name = sc.next();
        System.out.print("Your class will be mage. ");
        double Int = 10;//rand.nextInt(20)+10;
        double str = rand.nextInt(10)+10;
        double dex = 50 - (Int + str);
        System.out.println("Welcome" +",to the mage class! Here are your stats for your adventure.");
        System.out.println("Your agility will be " + dex + "Pts.");
        System.out.println("Your strength will be " + str + "Pts.");
        System.out.println("Your inteligence will be " + Int + "Pts.");
        System.out.printf("Your quest hath begun! \nYou approach a tree, but theirs something odd about this tree..... \nThe tree was not a tree, BUT A LEVEL 10 ORC WITH 1000 HP!\n");
        double pwr = 10 * Int;
        double orc = 1000;
        double turns = 10;
        double mult = rand.nextDouble() + .5;
        double pwrr = pwr * mult;
        double mult2 = rand.nextDouble() + .5;
        double pwrr2 = pwr * mult2;
        double mult3 = rand.nextDouble() + .5;
        double pwrr3 = pwr * mult3;
        double mult4 = rand.nextDouble() + .5;
        double pwrr4 = pwr * mult4;
        double mult5 = rand.nextDouble() + .5;
        double pwrr5 = pwr * mult5;
        double mult6 = rand.nextDouble() + .5;
        double pwrr6 = pwr * mult6;
        double mult7 = rand.nextDouble() + .5;
        double pwrr7 = pwr * mult7;
        double mult8 = rand.nextDouble() + .5;
        double pwrr8 = pwr * mult8;
        double mult9 = rand.nextDouble() + .5;
        double pwrr9 = pwr * mult9;
        double mult10 = rand.nextDouble() + .5;
        double pwrr10 = pwr * mult10;
        double x = orc - (pwrr+pwrr2+pwrr3+pwrr4+pwrr5+pwrr6+pwrr7+pwrr8+pwrr9+pwrr10);
        System.out.println("Ahhh I have " + x + " Hp! Goodbye!");
        System.out.println("The damadge of the maguc missle would have to be 18.25 to win with a 60-70%");

    }

}

