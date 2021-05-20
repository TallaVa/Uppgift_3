package Examination_3_2;

import java.util.Scanner;

public class BilHandlare 
{
   // Skapar Scanner som anänds för att registrera input.
   //Privata variabler som kommer användas i klassen.
    private static Scanner keyboard = new Scanner(System.in);

    //Skapa array som ska användas för att hålla alla  bilar.
    // kommer ha plats för 20 bilar.
    private static Bil bilarArray[] = new Bil[20];
    private static int index =0;
    
    


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
         System.out.print("Val: ");
         val = keyboard.nextInt();
         keyboard.nextLine();

         switch (val)
         {
            case 0:
                  utskriftMeny();      
                  break;
            case 1:
                  if ( index >= 20)
                  {
                     System.out.println("Listan är full.");   
                  } 
                  else
                  {
                     laggTillNyBil(bilarArray);
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
            case 6:
                  sokMarke(bilarArray);
                  break;
            case 7:
                  sokBil(bilarArray);
                  break;
            case 8:
                  kopAllaBilar(bilarArray);
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
 * Skriver ut Menyn för användaren
 */
public static void utskriftMeny()
{
   System.out.println("\n\t   -- Meny --");
   System.out.println("\t 0 - Visa meny");
   System.out.println("\t 1 - Lägg till ny bil.");
   System.out.println("\t 2 - Ändra miltal på bil i listan.");
   System.out.println("\t 3 - Ta bort bil.");
   System.out.println("\t 4 - Skriv ut allt i arrayn.");
   System.out.println("\t 5 - Ge rabatt.");
   System.out.println("\t 6 - Sök efter bilar baserat på märke.");
   System.out.println("\t 7 - Sök information på registrerad bil.");
   System.out.println("\t 8 - Visa pris för alla bilar tillsammans.");
   System.out.println("\t 9 - Avsluta. \n");
}

/**
 * laggTillNyBil metoden används för att lägga till ny bil.
 * användaren kommer få nedan frågor att svara på om nya bilen.
 * @param listaBilar
 * @param
 */
public static void laggTillNyBil(Bil[] listaBilar)
{
      
   System.out.println("Ange Bilens regnr på bil som du vill lägga till: ");
   String regNr = keyboard.nextLine();

   for ( int j = 0; j < listaBilar.length; j++ )
   {
      if (listaBilar[j] !=null && listaBilar[j].getregNr().equalsIgnoreCase(regNr))
      {    
         System.out.println("Finns dublett. testa lägga till en annan regnr.");
         utskriftMeny();
         break;
      }
      if (j == listaBilar.length -1)
      {
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

         for (int i =0; i < listaBilar.length; i++)
         {
            if (listaBilar[i] == null)
            {
               listaBilar[i] = new Bil(regNr, marke, model, Integer.parseInt(artal), Integer.parseInt(miltal), vaxel, farg, drivmedel, Double.parseDouble(pris), ovrigt);
               System.out.println("---- Bil registrerat----\n");
               utskriftMeny();
               index++;
               break;
            }      
         }
      } 
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
                     +"uppdatera miltalen på: \n");
      String regNr = keyboard.nextLine();

      System.out.println("Ange det uppdaterade miltalen: ");
      int nyaMil = keyboard.nextInt();

   for (int i = 0; i < listaBilar.length; i++)
   {
      if (listaBilar[i] != null && listaBilar[i].getregNr().equalsIgnoreCase(regNr))
         {
            listaBilar[i].setmiltal(nyaMil);
            System.out.println("---- Uppdaterad ----\n");
            
         } 
   }
   System.out.println("\n");
   utskriftMeny();
}

/**
 * tabortBil metoden tar bort vald bil genom regnr.
 * @param listaBilar
 */
public static void tabortBil(Bil[] listaBilar)
{
   System.out.println("Ange regnr på bil som önskas tas bort från listan: \n");
      String regNr = keyboard.nextLine();

      for (int i = 0; i < listaBilar.length; i++)
      {
         if (listaBilar[i] != null && listaBilar[i].getregNr().equalsIgnoreCase(regNr))
         {
            listaBilar[i] = null;
            index--;
            System.out.println("---- Bil borttagen ----\n");
            utskriftMeny();
            break;
         }
         if (i == listaBilar.length -1)
         {
            System.out.println("---- Bil med regnr " +regNr + " existerar ej ----\n");
            System.out.println("------------------------\n");
            utskriftMeny();
            break;
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
   System.out.println("------------------------\n");
   utskriftMeny();
}


/**
 * Den här metoden ska leta efter bilar äldre än året
 * som användaren anger och ge ett rabatterat pris på 10%.
 * @param listaBilar
 */
public static void geRabatt(Bil[] listaBilar)
{
   int input = 2005;

      for (int i = 0; i < listaBilar.length; i++)
      {
         if (listaBilar[i] != null && listaBilar[i].getartal() < input)
         {
            System.out.println("Regnr     : " + listaBilar[i].getregNr());
            System.out.println("Märke     : " + listaBilar[i].getmarke());
            System.out.println("Model     : " + listaBilar[i].getmodel());
            System.out.println("Årtal     : " + listaBilar[i].getartal());
            System.out.println("Miltal    : " + listaBilar[i].getmiltal());
            System.out.println("Växel     : " + listaBilar[i].getvaxel());
            System.out.println("Färg      : " + listaBilar[i].getfarg());
            System.out.println("Drivmedel : " + listaBilar[i].getdrivmedel());
            System.out.print("Pris      : " + listaBilar[i].getpris() + " kr\t Det nya priset är : ");
            System.out.printf("%.2f", listaBilar[i].getRabattpris());
            System.out.println(" kr");
            System.out.println("Övrigt    : " + listaBilar[i].gerovrigt() + "\n");
            double nyttPris = listaBilar[i].getRabattpris();
            listaBilar[i].setpris(nyttPris);
            System.out.println("------------------------\n");
         }
         
      }
      System.out.println("\n");
      utskriftMeny();
   }

   /**
    * Den här metoden kommer visa information 
    * om bilar baserad på Märket på bilar
    * man sökt efter.
    * @param listaBilar
    */
   public static void sokMarke(Bil[] listaBilar)
   {
      System.out.println("Efter vilket märke vill du söka ? ");
      String marke = keyboard.nextLine();

      for (int i = 0; i < listaBilar.length; i++)
      {
         if (listaBilar[i] != null && listaBilar[i].getmarke().equalsIgnoreCase(marke))
         {
            System.out.println("------------------\n");
            System.out.println(listaBilar[i].toString());
         }
         
      }
      System.out.println("\n");
      utskriftMeny();
   }

   /**
    * sokBil metoden tillåter användaren 
    * att söka information om enstaka bilar.
    * @param listaBilar
    */
   public static void sokBil(Bil[] listaBilar)
   {
      System.out.println("Ange regnr på bilen du söker ? " 
                           +"\n(tom eller fel reg tar tig tillbaka till menyn.)");
      String reg = keyboard.nextLine();

      for (int i = 0; i < listaBilar.length; i++)
      {
         if (listaBilar[i] != null && listaBilar[i].getregNr().equalsIgnoreCase(reg))
            {
               System.out.println("------------------\n");
               System.out.println(listaBilar[i].toString());    
               break;           
            }   
      }
      System.out.println("\n");
      utskriftMeny();
   }

   /**
    * Metoden listar total priset för alla bilar 
    * i listan.
    * @param listaBilar
    */
   public static void kopAllaBilar(Bil[] listaBilar)
   {
      double sum = 0;

      for (int i = 0; i < listaBilar.length; i++)
      {
         if (listaBilar[i] != null)
         {
         sum += listaBilar[i].getpris();
         }
      }
      System.out.print("---- ");
      System.out.printf("%.2f", sum);
      System.out.print(" kr för alla bilar i listan");
      System.out.println(" ---- \n");
   }
}