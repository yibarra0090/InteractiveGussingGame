//Yussef Ibarra
import java.util.Scanner;
public class Game {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int num = (int)((Math.random()*11)+1);
        System.out.println("Guess the number between 1 and 10:");
        int guess = input.nextInt();
        int numOfguess = 1;
        while (guess != num){
            System.out.println("Guess Again:");
            guess = input.nextInt();
            numOfguess += 1;
        }
        System.out.println("Good Job!");
        System.out.println("It took you"+" "+""+numOfguess+""+" "+""+"guess(es) to get the right answer");
    }
}
