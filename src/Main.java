import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        boolean wasNumberGuessed = false;

        Scanner scanner = new Scanner(System.in);

        while (!wasNumberGuessed) {
            System.out.println("Odgadnij liczbę z przedziału 1-100");
            int userNumber = scanner.nextInt();
            if (userNumber > numberToGuess ) {
                System.out.println("twoja liczba jest za duża");
            }else  if (userNumber < numberToGuess) {
                System.out.println("twoja liczba jest za mała");
            }else {
                System.out.println("zgadłeś! prawdziwy z cb kocur!");
                wasNumberGuessed = true;
            }
        }
    }
}
