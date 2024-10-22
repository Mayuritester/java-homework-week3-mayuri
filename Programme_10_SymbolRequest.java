package homework3;
//** .Write a java program to input any two number and ask user to enter their symbol (+, -,

import java.util.Scanner;

/// , *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)
public class Programme_10_SymbolRequest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Resquest end user to enter numbers
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Requerst end use to enter operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        opration(num1, num2, operator);

    }

    public static void opration(double num1, double num2, char operator) {

        // declaration for each operator
        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));

        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));

        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));

        } else if (operator == '/') {

            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator! Please enter one of +, -, *, /.");

            main(null);
        }
    }

}
