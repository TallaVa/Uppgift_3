package Code_Listing7_10;

/**
 * This program gathers sales amount for the week.
 * it uses the SalesData class to display the total,
 * avarage, highest, and lowest sales amounts.
 */

public class Sales
{
    public static void main(String[] args)
    {
        final int ONE_WEEK = 7;     //number of elements

        //Create an array to hold sales amounts for a week.
        double[] sales = new double[ONE_WEEK];

        //Get the week's sales figures.
        getValues(sales);

        //Create a SalesData object, initialized
        //with the week's sales figures.
        SalesData week = new SalesData(sales);
    }
}
