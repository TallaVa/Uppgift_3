package Chapter7Array;

import java.util.Scanner;

public class PayArray
{
    public static void main (String [] args)
    {
        final int EMPL = 5;  //antal arbetare
        double payRate;     // timlön
        double grossPay;    // lön

        // Skapar array som håller timlön
        int[] hours = new int[EMPL];

        // Skapar en scanner för input
        Scanner key = new Scanner(System.in);

        // Få in timmarna som jobbas per anställd
        System.out.println("Ange arbetade timmar på " + EMPL + " arbetare som har samma timlön.");

        for(int index = 0; index < EMPL; index++)
        {
            System.out.print("Arbetare #" + (index +1) + ": ");
            hours[index] = key.nextInt();
        }

        // Få timlönen.
        System.out.print("Ange timön för arbetarna: ");
        payRate = key.nextDouble();

        // Visa anstäldas löner
        System.out.println("Här presenteras anstäldas löner: ");
        for (int index = 0; index < EMPL; index++)
        {
            grossPay = hours[index] * payRate;
            System.out.println("Arbetare #" + (index + 1) + ": $" + grossPay);
        }

        key.close();
    }    
}
