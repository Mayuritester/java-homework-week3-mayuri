package homework3;

//** Write a java program to print the numbers between 1 to 100 which can be divided by 3
//and 5 separately.
public class Programme_11_1To100Division {

    public static void main(String[] args) {
            //request from end users
           System.out.println("Numbers divisible by 3:");
           //for declaration
            for (int i = 1; i <= 100; i++) {
            if  (i % 3 == 0) {
                //expected output with result
                System.out.print(i + " ");
            }
        }
            //request from end user
            System.out.println("\n\nNumbers divisible by 5:");
            //for Declaration
            for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                //expected output with result
                System.out.print(i + " ");
            }
        }

    }
}
