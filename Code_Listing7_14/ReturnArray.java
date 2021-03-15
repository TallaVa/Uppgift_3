package Code_Listing7_14;

/**
 * This program demonstrates how a referance to an 
 * array can be returned from a method.
 */

public class ReturnArray
{
    public static void main(String [] args)
    {
        double[] values;

        values = getArray();
        for (double num : values)
            System.out.print(num + " \t");
    }

    /**
     * getArray method
     * @return A reference to an array of doubles.
     */

     public static double[] getArray()
     {
         double[] array = {1.2, 2.3, 4.5, 6.7, 8.9};

        return array;    
    }
        
}
