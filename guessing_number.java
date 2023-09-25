import java.util.Random;
import java.util.Scanner;

public class guessing_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int min = 1;
        int max= 100;
        int randno = random.nextInt(max-min+1)+min;
        

        int attempts = 0;
        boolean correctguess = false;

        System.out.println("!!!!WELCOME TO GUESSING GAME!!!!");
        System.out.println("Think of a number between "+ min +"and " + max + ".");

        while(!correctguess){
            System.out.println("Enter your guessing number :");
            int guess = scanner.nextInt();
            attempts++;

            if(guess < min || guess > max) {
                System.out.println("Enter no between" + +min + "and" + max + ".");

            }else if(guess < randno){
                System.out.println("Too low! Try again.");
            }else if(guess > randno){
                System.out.println("Too high! Try again.");
            }else{
                correctguess = true;
                System.out.println("!!CONGRATULATIONS!! You Won.");
                System.out.println("No. of attempts attempted" + attempts);
            }
        }
        scanner.close();
    } 
}
