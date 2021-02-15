package Chapter7Array;

import java.util.*;

/**
 * det här programmet kommer visa värden som sparats i arryn
 */

 public class ArrayDemo1
{
    public static void main(String [] args)
    {
        final int EMPLOYEES = 3;            //Variabel för att hålla antal anställda
        int[] hours = new int[EMPLOYEES];   //Array för timmar som jobbats

        // Skapar en scanner
        Scanner key = new Scanner(System.in);

        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees.");

        // Få in alla timmarna för anställd 1
        System.out.print("Employee 1: ");
        hours[0] = key.nextInt();

        // Få in alla timmar för anställd 2
        System.out.print("\nEmployee 2: ");
        hours[1] = key.nextInt();

        // Få in alla timmar för anställd 3
        System.out.print("\nEmployee 3: ");
        hours[2] = key.nextInt();

        // Visa all data 
        System.out.println("The hours you enterd are: ");
        System.out.println(hours[0]);
        System.out.println(hours[1]);
        System.out.println(hours[2]);

        key.close();
    }
}