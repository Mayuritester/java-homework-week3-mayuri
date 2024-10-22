//**Write a java program to input any number and find out if it’s odd or even
package homework3;

import java.util.Scanner;

public class Programme_6_OddEven {

    //create main method
    public static void main(String[] args) {
        //scanner method to request details from end user
        Scanner scanner = new Scanner(System.in);

        //the dynamic you are requesting
        System.out.println("Enter any number");
        //declaration
        int num = scanner.nextInt();

        //if declaration
        if (num % 2 == 0) {
            //Expected output if Even
            System.out.println(num + " is even");
        }
        //else condition
        else {
            //expected output if odd
            System.out.println(num + " is odd");
        }

        scanner.close();
    }
}
