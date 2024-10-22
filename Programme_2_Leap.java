package homework3;

import java.util.Scanner;

//** 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
//not?
public class Programme_2_Leap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter the year as input
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        boolean isleapYear;


        //divisible by 4
        isleapYear = (year % 4 == 0);

        //divisible by 4, not by 100, or divisible by 400
        isleapYear = isleapYear && (year % 100 !=0 || year % 400 == 0);

        if (isleapYear){
            System.out.println(year + "is a leap year");

            } else {
                    System.out.println(year + "is not a leap year");
                }
        scanner.close();
            }
        }











