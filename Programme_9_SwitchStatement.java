package homework3;

import java.util.Scanner;

public class Programme_9_SwitchStatement {

//** Same as above program-8 using switch statement

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //request end user to enter alphabet
        System.out.println("Enter an alphabet (A to F): ");
        //declaration
        char alphabet = scanner.next(). charAt(0);
            //Expected outcome
            switch (alphabet) {
                case 'A':
                    System.out.println ("A is for Ankara");
                    break;
                case 'B':
                    System.out.println("B is for Barcelona");
                break;
                case 'C':
                    System.out.println("C is for Canned");
                    break;
                case 'D':
                    System.out.println("D is for Diu");
                    break;
                case 'E':
                    System.out.println("E is for Edinburgh");
                    break;
                case 'F':
                    System.out.println("F is Florance");
                    break;
                default:
                    System.out.println("Invalid Course Code");

            }
            scanner.close();
        }
    }


