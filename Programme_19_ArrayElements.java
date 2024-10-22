package homework3;

import java.util.Scanner;

//**Write a Java program to calculate the average value of array elements.
public class Programme_19_ArrayElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     //print statement to request value from user
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // array dec
        double [] arr = new double[n];

       //double dec
        double sum = 0;

       //Array declaration
        System.out.println(" Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] =scanner.nextDouble();
            sum += arr[i];
        }
        // double declaration
        double average = sum / n;

        // expected output
        System.out.println("The average value of the array elements is: " + average);

        scanner.close();
    }
}
