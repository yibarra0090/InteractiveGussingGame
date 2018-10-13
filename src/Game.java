//Yussef Ibarra
/**
 * 
 */

import java.util.Scanner;
public class Game {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("What is your name?:");
        String name = input.nextLine();
        int num = (int)((Math.random()*11)+1);
        System.out.println("Guess the number between 1 and 10"+" "+name+""+" "+":");
        int guess = input.nextInt();
        int numOfguess = 1;
        while (guess != num){
            System.out.println("Guess Again"+""+" "+""+name+"");
            guess = input.nextInt();
            numOfguess += 1;
        }
        System.out.println("Good Job"+""+" "+""+name+""+":!");
        System.out.println("It took you"+" "+""+numOfguess+""+" "+""+"guess(es) to get the right answer");
    }
}
