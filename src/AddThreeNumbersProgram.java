import java.util.Scanner;


public class AddThreeNumbersProgram {

    public static void main (String [] args) {

    int numberSum;

    Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input three numbers.: ");

        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int number3 = keyboard.nextInt();

        numberSum = (number1 + number2 + number3);

        System.out.println("This is the sum of " + number1 + "+" +number2 + "+" + number3);
        System.out.println(numberSum);


    }
}
