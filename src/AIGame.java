//Yussef Ibarra
import java.util.Scanner;

public class AIGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int guess = 50;
        System.out.println("Is this your number" + "" + " " + guess + "" + "?(type 1 for correct, 2 for higher, or 3 for lower):");
        int ans = input.nextInt();
        while (ans != 1) {
            if (ans == 2) {
                min = guess+1;
                guess = (int)((max+min)/2);
            }
            if (ans == 3) {
                max = guess-1;
                guess = (int)((max+min)/2);
            }
            System.out.println("Is this your number" + "" + " " + guess + "" + "?(type 1 for correct, 2 for higher, or 3 for lower):");
            ans = input.nextInt();
        }
        System.out.println("Good Game!");
    }
}



