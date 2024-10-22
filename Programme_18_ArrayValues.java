package homework3;
//**Write a Java program to sum values of an array.

public class Programme_18_ArrayValues {

    public static void main(String[] args) {
        //Array Values
        int[] numbers = {4, 5, 6, 7, 8, 9};

        // Expected output method
        int sum = sumArray(numbers);
        System.out.println("The sum of the array value is: " + sum);
    }

    //main method
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

}
