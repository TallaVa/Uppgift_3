package Examination_3_2;

import java.util.Scanner;

public class BilHandlare 
{

   //Privata variabler som kommer användas i klassen.
    private static Scanner scanner = new Scanner(System.in);

    //Skapa array som ska användas för att hålla alla  bilar.
    // kommer ha plats för 20 bilar.
    private static Bil bilarArray[] = new Bil[20];

  


   public static void main(String[] args) 
   {
     
      //Startar med att lägga in tre bilar i arrayn.

   // Bil 1.
   bilarArray[0] = new Bil("ASD123", "Volvo", "v50", Integer.parseInt("2005"), Integer.parseInt("2000"), 
                           "manuell", "grå", "bensin", Double.parseDouble("20000.00"), "-");

   //Bil 2.
   bilarArray[1] = new Bil("QWE123", "Saab", "9.3 2.2 TiD", Integer.parseInt("2000"), Integer.parseInt("2500"), 
                           "manuell", "vit", "diesel", Double.parseDouble("4000.00"), "-");

   //Bil 3.
   bilarArray[2] = new Bil("ZXC123", "Volvo", "v70", Integer.parseInt("2010"), Integer.parseInt("1200"), 
                           "manuell", "svart", "bensin", Double.parseDouble("60000.00"), "-");

   
                           
   // Välkomst text
      System.out.println("Välj i menyn: ");
      
      boolean exit = false;
      int val = 0;

      //Skriver ut menyn
      utskriftMeny();
      while (!exit)
      {
         System.out.println("välj i menyn: ");
         val = scanner.nextInt();
         scanner.nextLine();

         switch (val)
         {
            case 0:
                  utskriftBilar(bilarArray);
                  break;
            case 1:
                  utskriftMeny();
                  break;
            default:
                  utskriftMeny();
         }

      }


   }

public static void utskriftMeny()
{
   System.out.println("\n -- Meny --");
   System.out.println("\t 0 - skriv ut allt");
   System.out.println("\t 1 . Visa meny igen.");
}

/**
 * Metod som skriver ut allt enligt toString.
 * @param listaBilar
 */
private static void utskriftBilar(Bil[] listaBilar)
{
   for (int i = 0; i < listaBilar.length; i++)
   {
      if (listaBilar[i] != null)
      {
         System.out.println(listaBilar[i].toString());
      }
   }
}
}