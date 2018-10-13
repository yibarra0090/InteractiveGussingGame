//Yussef Ibarra
import java.util.Scanner;

public class AIGame {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int guess = (int)(Math.random()*100)+1;
        System.out.println("Is this your number"+""+" "+guess+""+"?(type 1 for correct, 2 for higher, or 3 for lower):");
        int ans = input.nextInt();
        while (ans!=1){
            if (ans == 2){
                guess = (int)(guess+101)/2;
                System.out.println("Is this your number"+""+" "+guess+""+"?(type 1 for correct, 2 for higher, or 3 for lower):");
                ans = input.nextInt();
            } else {
                if (ans == 3){
                    guess = (int)(guess+1)/2;
                    System.out.println("Is this your number"+""+" "+guess+""+"?(type 1 for correct, 2 for higher, or 3 for lower):");
                    ans = input.nextInt();
                }
            }
        }

    }
}
