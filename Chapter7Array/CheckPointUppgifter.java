package Chapter7Array;

public class CheckPointUppgifter 
{
    public static void main (String [] args)
    {

        /**
         * uppgift 7.7
         */
        //int[] values = new int[5];
        //for (int count = 0; count < 5; count++){
        //values[count] = count + 1;
        //}
        // För att få lite cleanCode så behövs inte två for loops att få samma utfall.
        //for (int count = 0; count < 5; count++)
        //System.out.println(values[count]);


        /**
         * uppgift 7.8
         */
        double[] test = {1.7, 6.4, 8.9, 3.1, 9.2};
        for(int index = 0; index < test.length; index++)
            System.out.println(test[index]);
           
    }
}
