import java.util.Scanner;

//import java.util.Scanner;

public class CheckPoint
{
    public static void main(String [] args)
    {
        //CheckPoint Ch.7.2

    /**
    * 7.9
         
        int[] numbers1 = { 1, 3, 6, 9 };
        int[] numbers2 = { 2, 4, 6, 8 };
        int resultat;

        resultat = numbers1[0] * numbers2[3];
        System.out.println(resultat);

    */
    /**
    * 7.10 & 7.11

        int[] array;
        int val;

        //Create a scanner to read input.
        Scanner key = new Scanner(System.in);

        //Ask the user for list size.
        System.out.println("hur lång ska listan vara, ange i heltal. : ");
        val = key.nextInt();
        
        //create the array
        array = new int[val];

        for(int index = 0; index < val; index++ )
        {
            array[index] = -1;
            System.out.println(array[index]);
        }

    */

    /**
     * 7.12
    
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int[] b = new int[7];
        
        for(int index = 0; index < a.length; index++)
        {
        b[index] = a[index];

        System.out.println(a[index] + "\n" + b[index]);
        }
    */

    /**
     * 7.13 - 7.14
     */
        //Variable
        int user = 0;

        //create a scnner
        Scanner key = new Scanner(System.in);

        //Ask the user for the index.
        System.out.print("How many elements?: ");
        user = key.nextInt();

        //Create the array
        int[] numbers = new int[user];

        //Pass the array
        myMethod(numbers);

        key.close();
    }
        /**
         * The myMethod accepts a reference
         * to an array its argument.
         * @param array
         */
        private static void myMethod(int[] array)
        {
            //Display the array elements.
            for (int index = 0; index < array.length; index++)
                System.out.println(array[index] + " ");
        }

}