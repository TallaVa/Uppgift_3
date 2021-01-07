import java.util.*;

/**
 * This program runs a simple test
 * of the CellPhone Class.
 */

public class CellPhoneTest
{
    public static void main(String[] args)
    {
        String testMan;     //To hold a manufacturer
        String testMod;     //To hold a model number
        double testPrice;   //To hold a price

        //Create a Scanner for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Get the manufacturer name.
        System.out.println("Enter the manufacturer: ");
        testMan = keyboard.nextLine();

        //Get the model number.
        System.out.println("Enter the model number: ");
        testMod = keyboard.nextLine();

        //Get the retail price.
        System.out.println("Enter the retail price: ");
        testPrice = keyboard.nextDouble();

        //Create an instance of the CellPhone class.
        //Passing the data that was entered as arguments
        //to the constructor.
        CellPhone phone = new CellPhone(testMan, testMod, testPrice);

        //Get the data from the phone and display it.
        System.out.println();
        System.out.println("Here is the data that you provided:");
        System.out.println("Manufacturer: " + phone.getManufact());
        System.out.println("Model number: " + phone.getModel());
        System.out.println("Retail price: " + phone.getRetailPrice());
    }    
}
