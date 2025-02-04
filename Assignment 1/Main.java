import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 10) + 1;
        System.out.println("Please guess a number.");
        int guess = kb.nextInt();
        for (int i = 1; i < 5; i++) {
            if (guess > randomNum) {
                System.out.println("Too high, try again.");
                guess = kb.nextInt();
            } else if (guess < randomNum) {
                System.out.println("Too Low, try again.");
                guess = kb.nextInt();
            }
            else if (guess == randomNum) {
                System.out.println("Congratulations! You've guessed the correct number.");
                break;
            }
        }
        if (guess != randomNum) {
            System.out.println("You have lost, The number was: " + randomNum);
        }
    }
}