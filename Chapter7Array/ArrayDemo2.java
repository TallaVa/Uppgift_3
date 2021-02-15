package Chapter7Array;

import java.util.*;


/**
 * det här programmet kommer visa värden som sparats i arryn
 */

 public class ArrayDemo2
{
    public static void main(String [] args)
    {
        final int EMPLOYEES = 3;            //Variabel för att hålla antal anställda
        int[] hours = new int[EMPLOYEES];   //Array för timmar som jobbats

        // Skapar en scanner.
        Scanner key = new Scanner(System.in);

        System.out.println("Enter the hours worked for " + EMPLOYEES + " employees.");

        // få timmarna för varje anställd.
        for(int index = 0; index < EMPLOYEES; index++)
        {
            System.out.print("\nEmployee " + (index +1) + ": ");
            hours[index] = key.nextInt();
        }

        System.out.println("The hours you entered are: ");

        // Visa de slagna värden.
        for (int index = 0; index < EMPLOYEES; index++)
            System.out.println(hours[index]);

        key.close();

    }
}