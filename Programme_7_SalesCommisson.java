package homework3;

import java.util.Scanner;

//**//**Write a java program input sales id, seller's name, sales amount, and salary basic and
////then find the sales Commission
////Sales amount >= 50,000 35%
////Sales amount >= 30,000 20%
////Sales amount >= 20,000 10%
////Sales amount >= 10,000 5%
////Sales amount <= 10,000 2%
public class Programme_7_SalesCommisson {
    //static variables
    static int salesID;
    static String sellerName;
    static double salesAmount;
    static int salary;

        //expected inputs for end user to enter
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sale ID  ");
        salesID = scanner.nextInt();
        System.out.println("Enter seller name");
        sellerName = scanner.nextLine();
        System.out.println("Enter Sale amount  ");
        salesAmount = scanner.nextDouble();
        System.out.println("Enter Salary ");
        salary = scanner.nextInt();
        System.out.println("Commission is " + calculateCommission(salesAmount));
    }

    static double calculateCommission(double salesAmount){

        double commission = 0;
        if (salesAmount >=50000)
            commission= salesAmount * 0.35;

        // If sales amount is £30,000.01-£50,000 commission rate is 20%
        if (salesAmount > 30000)
            commission= salesAmount * 0.20;

        // If sales amount is £20,000-£30,000 commission rate is 10%
        if (salesAmount > 20000)
            commission= salesAmount * 0.10;

        // If sales amount is £10,000-£20,000 commission rate is 5%
        if (salesAmount > 10000)
            commission= salesAmount * 0.05;

        // If sales amount is £0-£10,000 commission rate is 2%
        if (salesAmount < 10000)
            commission= salesAmount * 0.02;


        return commission;
    }
}
