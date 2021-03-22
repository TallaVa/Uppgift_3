import java.util.Scanner;

public class RectangleArray
{
    public static void main(String[] args) 
    {
        
        
        Rectangle[] elements = new Rectangle[5];

        createElements(elements);
        
        System.out.println(" test : ");

        for (int i = 0; i < elements.length; i++)
        {
            System.out.println(" test loop " + (i+1) + elements[i].getArea());
        }
    }

    /**
     * The createElements method skapar Recangle object
     * för varje element i arrayn. användaren får knappa 
     * in lengd och brädd.
     * @param array Arrayn som referear elements
     */
    private static void createElements(Rectangle[] array)
    {
        double langd;
        double bredd;

              Scanner key = new Scanner(System.in);
         
        for ( int index = 0; index < array.length; index++)
        {
            System.out.println("mata in längd för triangel " + (index + 1) + ": ");
            langd = key.nextDouble();
            array[index].setLength(langd);

            System.out.println("mata in brädd för triangel " + (index + 1) + ": ");
            bredd = key.nextDouble();
            array[index].setWidth(bredd);

            
        }

    }
}
