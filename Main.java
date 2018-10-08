import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("What is your name: ");
        String name = sc.next();
        System.out.print("Your class will be mage. ");
        double Int = 21;//rand.nextInt(20)+10;
        double str = rand.nextInt(10)+10;
        double dex = 50 - (Int + str);
        System.out.println("Welcome " + name + ",to the mage class! Here are your stats for your adventure.");
        System.out.println("Your agility will be " + dex + "Pts.");
        System.out.println("Your strength will be " + str + "Pts.");
        System.out.println("Your inteligence will be " + Int + "Pts.");
        System.out.printf("Your quest hath begun! \nYou approach a tree, but theirs something odd about this tree..... \nThe tree was not a tree, BUT A LEVEL 10 ORC WITH 1000 HP!\n");
        double pwr = 5 * Int;
        double orc = 1000;
        double turns = 10;
        double mult = rand.nextDouble() + .5;
        double pwrr = pwr * mult;
        double tot = pwrr;
        
        //these lines are irrelvent for this one but not the next test
        double mult2 = rand.nextInt(1) + .5;
        double pwrr2 = pwr * mult;
        double tot2 = pwrr2;
        double mult3 = rand.nextInt(1) + .5;
        double pwrr3 = pwr * mult;
        double tot3 = pwrr3;
        double mult4 = rand.nextInt(1) + .5;
        double pwrr4 = pwr * mult;
        double tot4 = pwrr4;
        double mult5 = rand.nextInt(1) + .5;
        double pwrr5 = pwr * mult;
        double tot5 = pwrr5;
        double mult6 = rand.nextInt(1) + .5;
        double pwrr6 = pwr * mult;
        double tot6 = pwrr6;
        double mult7 = rand.nextInt(1) + .5;
        double pwrr7 = pwr * mult;
        double tot7 = pwrr7;
        double mult8 = rand.nextInt(1) + .5;
        double pwrr8 = pwr * mult;
        double tot8 = pwrr8;
        double mult9 = rand.nextInt(1) + .5;
        double pwrr9 = pwr * mult;
        double tot9 = pwrr9;
        double mult10 = rand.nextInt(1) + .5;
        double pwrr10 = pwr * mult;
        double tot10 = pwrr10;
        
        //pick code back up here 
        //this is the amount of damadge done and it give a - number for defeat and positive for fail
        double x = 1000 - tot * 10;
        System.out.println("Ahhh I have " + x + " Hp! Goodbye!");
        System.out.println("The intelegence would have to be 21 to win");
    }

}
