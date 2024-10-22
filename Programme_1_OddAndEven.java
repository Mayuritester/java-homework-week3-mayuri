package homework3;

import java.util.Scanner;

//**1. Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator



public class Programme_1_OddAndEven {

    //create main method
    public static void main(String[] args) {
        //scanner method to request details from end user
        Scanner scanner = new Scanner(System.in);

        //the dynamic you are requesting
        System.out.println("Enter any number");
        //declaration
        int num = scanner.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        //expected output
        System.out.println(num + " is " + evenOdd);

        scanner.close();
    }

}
