package homework3;

import java.util.Scanner;

//**Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
public class Programme_16_PosNegZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // statement to request number from user
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        numberCheck(number);
        sc.close();
    }

    public static void numberCheck(double number) {

        // if expected output
        if (number > 0) {
            System.out.println("The number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The number is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }

    }

}
