package Examination_3_2;

import java.util.Scanner;

public class BilHandlare 
{

   //Privata variabler som kommer användas i klassen.
    private static Scanner keyboard = new Scanner(System.in);

    //Skapa array som ska användas för att hålla alla  bilar.
    // kommer ha plats för 20 bilar.
    private static Bil bilarArray[] = new Bil[4];
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
         val = keyboard.nextInt();
         keyboard.nextLine();

         switch (val)
         {
            case 0:
                  utskriftMeny();      
                  break;
            case 1:
                  if(index <4 )
                  laggtillBil();
                  else
                  {
                     System.out.println("Listan är full." +
                        " Ta bort bil för att lägga till ny bil.");
                  }
                  break; 
                    
            case 2:
                  andraMil(bilarArray);
                  break;         
            case 3:
                  tabortBil(bilarArray);
                  break;
            case 4:
                  utskriftBilar(bilarArray);
                  break;
            case 5:
                  geRabatt(bilarArray);
                  break;
            case 9:
                  exit = true;
                  break;
            default:
                  utskriftMeny();
         }

      }


   }
/**
 * Skriver ut Menyn
 */
public static void utskriftMeny()
{
   System.out.println("\n\t   -- Meny --");
   System.out.println("\t 0 - Visa meny");
   System.out.println("\t 1 - Lägg till ny bil.");
   System.out.println("\t 2 - Ändra miltal på bil i listan.");
   System.out.println("\t 3 - Ta bort bil.");
   System.out.println("\t 4 - Skriv ut allt i arrayn.");
   System.out.println("\t 5 - Ge rabatt.\n");
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

/**
 * laggtillBil dubbelkollar om identisk bil existerar
 * så ett meddelande kan printas.
 */
public static void laggtillBil()
{
   laggTillNyBil(bilarArray, index);
   if (regExisterar(bilarArray))
   {
      System.out.println("En bil existerar redan med samma regnr. Ange en ny.\n");
      laggTillNyBil(bilarArray, index);
   }
   index++;
}


/**
 * laggTillNyBil metoden används för att lägga till ny bil.
 * användaren kommer få nedan frågor att svara på om nya bilen.
 * @param listaBilar
 * @param i
 */
public static void laggTillNyBil(Bil[] listaBilar, int i)
{
  
   System.out.println("Ange Bilens regnr: ");
   String regNr = keyboard.nextLine();

   System.out.println("Ange Bilens märke: ");
   String marke = keyboard.nextLine();

   System.out.println("Ange Bilens modell: ");
   String model = keyboard.nextLine();

   System.out.println("Ange Bilens årtal: ");
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

   //Dubbelkollar så arrayn inte är "out of bounds"
   // och då lägger in informationen man angav in i arrayn.
   
   if (index <= 4)
      { 
         for ( int j = 0; j < listaBilar.length; j++)
         {
            if (listaBilar[j] == null)
            {
               i = j;
               listaBilar[i] = new Bil(regNr, marke, model, Integer.parseInt(artal), Integer.parseInt(miltal), vaxel, farg, drivmedel, Double.parseDouble(pris), ovrigt);
               System.out.println("\tBil registrerat.\n");
               utskriftMeny(); 
            }
         }   
      } 
   else if (index > 4 )
      {
         System.out.println("Listan är full");
         utskriftMeny();
      }
     
   
}
/**
 * andraMil metoden används om man vill ändra mil på 
 * en existerande bil i listan.
 * @param listaBilar
 */
public static void andraMil(Bil[] listaBilar)
{
   System.out.println("Ange regnr för den bil du vill "
                     +"uppdatera miltalen på: ");
      String regNr = keyboard.nextLine();
   System.out.println("Ange det uppdaterade miltalen: ");
      int nyaMil = keyboard.nextInt();

   for (int i = 0; i < listaBilar.length; i++)
   {
      if (listaBilar[i] != null && listaBilar[i].getregNr().equalsIgnoreCase(regNr))
      
         listaBilar[i].setmiltal(nyaMil);      
      else
         System.out.println("Fel regnr eller så existerar inte bilen.\n");
         break;
   }
}

public static void tabortBil(Bil[] listaBilar)
{
   System.out.println("Ange regnr på bil som önskas tas bort från listan: ");
      String regNr = keyboard.nextLine();

      for (int i = 0; i < listaBilar.length; i ++)
      {
         if (listaBilar[i] != null && listaBilar[i].getregNr().equalsIgnoreCase(regNr))
         {
            listaBilar[i] = null;
            index--;
            break;
         }
         if (i == listaBilar.length -1)
         {
            System.out.println("Bil med regnr " +regNr + " existerar ej.");
         }
      }
}

/**
 * Metod som printar ut allt enligt toString.
 * @param listaBilar
 */
private static void utskriftBilar(Bil[] listaBilar)
{
   for (int i = 0; i < listaBilar.length; i++)
   {
      if (listaBilar[i] != null)
      {
         System.out.println(listaBilar[i].toString() + "\n");
      }
   }
   utskriftMeny();
}


/**
 * Den här metoden ska leta efter bilar äldre än året
 * som användaren anger och ge ett rabatterat pris på 10%.
 * @param listaBilar
 */
public static void geRabatt(Bil[] listaBilar)
{
   System.out.println("Vilket årtal får det inte överstiga ?");
   int input = keyboard.nextInt();

      for (int i = 0; i < listaBilar.length; i++)
      {
         if (listaBilar[i] != null && listaBilar[i].getartal() > input)
         {
            System.out.println("------------------\n");
            System.out.println(listaBilar[i].getregNr());
            System.out.println(listaBilar[i].getmarke());
            System.out.println(listaBilar[i].getmodel());
            System.out.println(listaBilar[i].getartal());
            System.out.println(listaBilar[i].getmiltal());
            System.out.println(listaBilar[i].getvaxel());
            System.out.println(listaBilar[i].getfarg());
            System.out.println(listaBilar[i].getdrivmedel());
            System.out.println(listaBilar[i].getpris() + " kr\t" + listaBilar[i].getRabattpris() + " kr nytt pris");
            System.out.println(listaBilar[i].gerovrigt() + "\n");
            
            double nyttPris = listaBilar[i].getRabattpris();
            listaBilar[i].setpris(nyttPris);
         }
         
      }
}
}