import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class testUppgifter {

    /**
     * det här programmet kommer skriva random nummer på fil
     * 
     * @throws FileNotFoundException
     */

    public static void main(String[] args) throws FileNotFoundException 
        {
            int maxNumbers; //Max nummer av random number
            int number;     //Hålla aktuell nummer
         
            //Skapa en scanner object för inmatning 
            Scanner keyboard = new Scanner(System.in);

            //Skapa ett random object att skapa numer
            Random num = new Random();

            //Skapa en skrivar object att skriva till fil
            PrintWriter outputFile = new PrintWriter("number.txt");

            //Printa ut numren till filen
            System.out.println("Hur många nr ska skrivas: ");
            maxNumbers = keyboard.nextInt();

            //Skriv ut det på fil
            for (int count = 0; count < maxNumbers; count++)
            {
                //Generera en random integer
                number = num.nextInt();

                //Skriva ut numret till filen
                outputFile.println(number);
            }

            //Stäng filen
            outputFile.close();
            keyboard.close();
            System.out.println("Färdigt");
            
        }
}
