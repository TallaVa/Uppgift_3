package Examination_3_2;

import java.util.Scanner;

public class BilHandlare 
{

   //Privata variabler som kommer användas i klassen.
    private static Scanner keyboard = new Scanner(System.in);

    //Skapa array som ska användas för att hålla alla  bilar.
    // kommer ha plats för 20 bilar.
    private static Bil bilarArray[] = new Bil[5];
    private static int index = 0;

  


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
                           

   index = 3;
                           
   // Välkomst text   
      boolean exit = false;
      int val = 0;

      //Skriver ut menyn
      utskriftMeny();
      while (!exit)
      {
         System.out.print("Välj i menyn: ");
         val = keyboard
.nextInt();
         keyboard
.nextLine();

         switch (val)
         {
            case 0:
                  utskriftMeny();      
                  break;
            case 1:
                  laggtillBil();
                  break;            
            case 2:
                  utskriftBilar(bilarArray);
                  break;
            default:
                  utskriftMeny();
         }

      }


   }

public static void utskriftMeny()
{
   System.out.println("\n\t   -- Meny --");
   System.out.println("\t 0 - Visa meny");
   System.out.println("\t 1 - Lägg till ny Bil.");
   System.out.println("\t 2 - Skriv ut allt i arrayn.");
}

/**
 * regExisterar metoden kommer att kontrolera så det inte 
 * finns dubbletter innan man kan lägga till nya bilar i
 * arrayn.
 * @param listaBilar
 * @return Om det finns dublett eller inte.
 */
public static boolean regExisterar(Bil[] listaBilar)
{
   boolean existerar = false;

   for (int i = 0; i < listaBilar.length; i++)
   {
      for (int j = i + 1; j < listaBilar.length; j++)
      {
         if (listaBilar[i] != null && listaBilar[j] != null)
         {
            if (listaBilar[i].getregNr().equals(listaBilar[j].getregNr()))
            {
               existerar = true;
            }
         }
      }
   }
   return existerar;
}

public static void laggtillBil()
{
   laggTillNyBil(bilarArray, index);
   if (regExisterar(bilarArray))
   {
      System.out.println("En bil existerar redan med samma regnr.");
      laggTillNyBil(bilarArray, index);
   }
   index++;
}

public static void laggTillNyBil(Bil[] listaBilar, int i)
{
   System.out.println("Ange Bilens regnr: ");
   String regNr = keyboard.nextLine();

   System.out.println("Ange Bilens märke: ");
   String marke = keyboard.nextLine();

   System.out.println("Ange Bilens modell: ");
   String model = keyboard.nextLine();

   System.out.println("Ange Bilens artal: ");
   String artal = keyboard.nextLine();

   System.out.println("Ange Bilens miltal: ");
   String miltal = keyboard.nextLine();

   System.out.println("Ange Bilens Växellåda (M/A): ");
   String vaxel = keyboard.nextLine();

   System.out.println("Ange Bilens Färg: ");
   String farg = keyboard.nextLine();

   System.out.println("Ange Bilens drivmedel: ");
   String drivmedel = keyboard.nextLine();

   System.out.println("Ange Bilens pris: ");
   String pris = keyboard.nextLine();

   System.out.println("Ange övrig information: ");
   String ovrigt = keyboard.nextLine();

   //Lägget till infon till arrayn.
   listaBilar[i] = new Bil(regNr, marke, model, Integer.parseInt(artal), Integer.parseInt(miltal), vaxel, farg, drivmedel, Double.parseDouble(pris), ovrigt);
 
   
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