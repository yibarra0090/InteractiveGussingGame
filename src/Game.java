//Yussef Ibarra
import java.util.Scanner;
public class Game {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int guess = 0;
        int num = (int)((Math.random()*11)+1);
        System.out.println("Guess the number between 1 and 10:");
        guess = input.nextInt();
        while (guess != num){
            System.out.println("Guess Again:");
            guess = input.nextInt();
        }
        System.out.println("Good Job!");
    }


}
