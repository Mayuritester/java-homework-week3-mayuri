package homework3;

import java.util.Scanner;

//** Write a program that tells us
//input value is number or an alphabet or symbol.*/
public class Programme_12_NumberSymbolOrAlphabet {

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // print statement for end sure
        System.out.print("Enter a character: ");
        char value = sc.next().charAt(0);
        // declare method
        whatIsThis(value);
    }

    public static void whatIsThis(char value) {
        // if else declaration to give expected result
        if (Character.isDigit(value)) {
            System.out.println("The input is a number.");
        } else if (Character.isLetter(value)) {
            System.out.println("The input is an alphabet.");
        } else {
            System.out.println("The input is a symbol.");
        }


    }

}
