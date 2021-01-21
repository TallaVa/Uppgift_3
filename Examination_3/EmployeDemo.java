package Examination_3;

import java.util.Scanner;

public class EmployeDemo
{
    //Privata variabler för EmployeDemo klassen 
    //här skapas en array.
    private static Scanner scanner = new Scanner(System.in);
    private static Employe employeeArray[] = new Employe[20];
    private static int index = 0;
    

    public static void main(String[] args) {

        //Börjar med att lägga in tre anställda att börja programmet med,
        //skickar dem direkt så konstruktorn initierar dem.
        employeeArray[0] = new Employe("E1", "Snickare", "Hanna", "Bell", "Falun", 
                                        Integer.parseInt("22"), 
                                        Integer.parseInt("180"), 
                                        Integer.parseInt("40"));

        employeeArray[1] = new Employe("E2", "Systemutvecklare", "Lina", "Morberg", "Gegnef", 
                                        Integer.parseInt("29"), 
                                        Integer.parseInt("220"), 
                                        Integer.parseInt("35"));
                                        
        employeeArray[2] = new Employe("E3", "Radiopratare", "Helge", "Skolhage", "Ludvika", 
                                        Integer.parseInt("58"), 
                                        Integer.parseInt("200"), 
                                        Integer.parseInt("20"));
      
        //Välkomst text med meny och sätter boolean "exit" till false.
        System.out.println("Välj ett av nedan för att gå vidare. avsluta med 0, " +
                            " ange 10 för att se menyn igen");
        boolean exit = false;
        int val = 0;

        //Printar ut Menyn och medans exit = false körs programmet 
        //while loopen avslutas då "exit" får värdet true.
        printInstructions();
        while (!exit)
        {
            System.out.println("Välj annat val eller avsluta: ");
            val = scanner.nextInt();
            scanner.nextLine();

            //Switch används för att läsa av valen som användaren anger.
            switch (val) 
            {
                case 0:
                    exit = true;
                    break;
                case 1:
                    addEmployee();
                    break;
                case 2:
                    modifyEmployee(employeeArray);
                    break;
                case 3:
                    removeEmployee(employeeArray);
                    break;
                case 4:
                    searchForEmployee(employeeArray);
                    break;
                case 5:
                    printWeekPay(employeeArray);
                    break;
                case 6:
                    searchAllByTitle(employeeArray);                    
                    break;
                case 7:
                    searchTitleSum(employeeArray);
                    break;
                case 8:
                    printemployeeArray(employeeArray);
                    break;
                case 9:
                    searchLessPay(employeeArray);
                    break;
                case 10:
                    printInstructions();
                    break;

                default:
                    printInstructions();
            }
        }
    }

    // Alla anställda presenteras med . ID. Förnamn och Arbetstitel.
    private static void printemployeeArray(Employe[] anstallda) {
        for (int i = 0; i < anstallda.length; i++) 
        {
            if (anstallda[i] != null)
            {
                System.out.println(anstallda[i].toString());

                anstallda[0] = new Employe("E1", "Snickare", "Hanna", "Bell", "Falun", 
                                    Integer.parseInt("22"), 
                                    Integer.parseInt("180"), 
                                    Integer.parseInt("40"));
            }
        }
    }
    
    // Visar menyn på skärmen.
    public static void printInstructions() {
        System.out.println("\n -- Meny -- ");
        System.out.println("\t 0 - Avsluta.");
        System.out.println("\t 1  - Lägg till anställd.");
        System.out.println("\t 2  - Ändra anstälds arbets titel.");
        System.out.println("\t 3  - Ta bort anställd.");
        System.out.println("\t 4  - Sök anställd.");
        System.out.println("\t 5  - Kolla veckolön för anställd.");
        System.out.println("\t 6  - Sök alla anställda med samma arbetstitel.");
        System.out.println("\t 7  - Summera alla med samma arbetstitel.");
        System.out.println("\t 8  - Lista alla anställda.");
        System.out.println("\t 9  - Sök efter anställd med lägre lön.");
        System.out.println("\t 10 - Visa meny.");        
    }

    // Arrayn söks om det finns en dubblett med samma ID.
    public static boolean idOnFile(Employe[] anstallda) {
        boolean isDuplicate = false;

        for (int i = 0; i < anstallda.length; i++) 
        {
            for (int j = i + 1; j < anstallda.length; j++) 
            {
                if (anstallda[i] != null && anstallda[j] != null)
                {
                    if (anstallda[i].getemployeID().equals(anstallda[j].getemployeID())) 
                    {
                        isDuplicate = true;
                    }
                }    
            }
        }
        return isDuplicate;
    }

    // addEmployee dubbelkollar så varje ny anställd inte 
    // existerar redan genom att kolla med idOnFile ovan,
    // sedan lägger till det i Arrayn.
    public static void addEmployee() 
    {
        addNewEmplyee(employeeArray, index);
        if (idOnFile(employeeArray)) 
        {
            System.out.println("Duplicate, change the ID");
            addNewEmplyee(employeeArray, index);
        }
        index++;

    }

    //Här lägger man till nya anställda och uppdaterar 
    //användaren får skriva in alla uppgifter vars efter sparas 
    //arrayn med anställd.
    public static void addNewEmplyee(Employe[] anstallda, int i) {

        System.out.print("Ange ID: ");
        String empID = scanner.nextLine();

        System.out.print("Ange förnamn: ");
        String empfNamn = scanner.nextLine();

        System.out.print("Ange efternamn: ");
        String empeNamn = scanner.nextLine();

        System.out.print("Ange ålder: ");
        String empAlder = scanner.nextLine();

        System.out.print("Ange stad: ");
        String empStad = scanner.nextLine();

        System.out.print("Ange arbetstitel: ");
        String empTitle = scanner.nextLine();

        System.out.print("Ange timlön: ");
        String empTimLon = scanner.nextLine();

        System.out.print("Ange timmar per vecka: ");
        String empVecka = scanner.nextLine();

        anstallda[i] = new Employe(empID, empTitle, empfNamn, empeNamn, empStad, 
                                    Integer.parseInt(empAlder), 
                                    Integer.parseInt(empVecka), 
                                    Integer.parseInt(empTimLon));
        
    }


    //Här tas användare bort. Avändaren matar in ID
    //på den som ska tas bort ur arrayn.
    //Arrayn söks med det sökbara kriteriet.
    public static void removeEmployee(Employe[] anstallda) 
    {
        
        System.out.println("Ange ID på anställd du önskar ta bort: ");
        String empID = scanner.nextLine();
        
        for (int i = 0; i < anstallda.length; i++)
        {
            if (anstallda[i] != null && anstallda[i].getemployeID().equalsIgnoreCase(empID))
            {
                anstallda[i] = null;
            break;
            }

                if(i == anstallda.length -1)
                {
                    System.out.println("Anställd existerar ej.");
                }
        }

    }

    //Här kan användaren söka på arbetstitel och sedan uppdatera
    //med en ny arbetstitel. Arrayn söks med det sökbara kriteriet.
    public static void modifyEmployee(Employe[] anstallda)
    {
        System.out.println("Ange ID på anställd du önskar ändra arbets titel på: ");
        String empID = scanner.nextLine();
        System.out.println("Ange ny arbetstitel: ");
        String nyTitel = scanner.nextLine();
        
        for (int i = 0; i < anstallda.length; i++)
        {
            if (anstallda[i] != null && anstallda[i].getemployeID().equalsIgnoreCase(empID))
            {
                anstallda[i].setarbetsTitel(nyTitel);
                
            }         
                
        }

    }

    //Här kan användaren söka på enskild anställd
    //genom att ange ett ID på den som ska visas.
    //Arrayn söks med det sökbara kriteriet.
    public static void searchForEmployee(Employe[] anstallda) 
    {
        System.out.println("Ange ID på anställd söker efter: ");
        String empID = scanner.nextLine();

        for (int i = 0; i < anstallda.length; i++)
        {
            if (anstallda[i] != null && anstallda[i].getemployeID().equalsIgnoreCase(empID))
            {
                System.out.println("ID:\t\t" + anstallda[i].getemployeID());
                System.out.println("Arbetstitel:\t" + anstallda[i].getarbetsTitel());
                System.out.println("Förnamn:\t" + anstallda[i].getfNamn());
                System.out.println("Efternamn:\t" + anstallda[i].geteNamn());
                System.out.println("Ålder:\t\t" + anstallda[i].getalder());
                System.out.println("Timmlön:\t" + anstallda[i].getlonPerTim());
                System.out.println("Arbetad tid:\t" + anstallda[i].gettimVecka());
                System.out.println("Stad:\t\t" + anstallda[i].getstad());
            }
        }
    }

    //Här kan användaren söka arrayn för en summa på
    //hur många av dens ansällda har samma arbetstitel
    //arrayn kommer då presentera det med en int.
    public static void searchTitleSum(Employe[] anstallda)
    {
        System.out.println("Ange arbetstitel du vill söka efter: ");
        String empTitel = scanner.nextLine();
        
        int count = 0;
        
        for (int i = 0; i < anstallda.length; i++) 
        {
            if (anstallda[i] != null && anstallda[i].getarbetsTitel().equalsIgnoreCase(empTitel))
            {
                count++;
            }          
      
        }
        
        System.out.println("Det finns totalt " + count + " anställda med den arbetstiteln.");
    }

    //Här kan användaren söka arrayn och få en lista
    //på alla anställda som har samma arbetstitel.
    public static void searchAllByTitle(Employe[] anstallda)
    {
        System.out.println("Ange arbetstitel du vill söka efter: ");
        String empTitel = scanner.nextLine();

        for (int i = 0; i < anstallda.length; i++)
        {
            if (anstallda[i] != null && anstallda[i].getarbetsTitel().equalsIgnoreCase(empTitel))
            {
                System.out.println("ID:\t\t" + anstallda[i].getemployeID());
                System.out.println("Arbetstitel:\t" + anstallda[i].getarbetsTitel());
                System.out.println("För namn:\t" + anstallda[i].getfNamn());
                System.out.println("Efter namn:\t" + anstallda[i].geteNamn());
                System.out.println("Ålder:\t\t" + anstallda[i].getalder());
                System.out.println("Timmlön:\t" + anstallda[i].getlonPerTim());
                System.out.println("Arbetad tid:\t" + anstallda[i].gettimVecka());
                System.out.println("Stad:\t\t" + anstallda[i].getstad());
                System.out.println("");
            }

        }
    }


    //Här kommer användaren kunna ange ID och få
    //presenterad förnamn och vad den anställda har 
    //tjärnat ihop på en vecka. uträkningen hämtar värden
    //genom getmetoderna och presenterar produkten.
    public static void printWeekPay(Employe[] anstallda)
    {
        System.out.println("Ange ID för den som du vill se vecko lön för: ");
        String empID = scanner.nextLine();

        for (int i = 0; i < anstallda.length; i++)
        {
            if (anstallda[i] != null && anstallda[i].getemployeID().equalsIgnoreCase(empID))
            {
                System.out.print(anstallda[i].getfNamn());
                System.out.println(" har en vecko lön på : " 
                                    + anstallda[i].getlonPerTim()*anstallda[i].gettimVecka()
                                    + " kr");
            }
    
        }
    }
    
    //Här kan användaren ange en lön och få
    //fram alla som tjärnar mindre än det man angav.
    public static void searchLessPay(Employe[] anstallda)
    {
        System.out.println("Ange lön: ");
        double input = scanner.nextDouble();

        for (int i = 0; i < anstallda.length; i++)
        {
            if (anstallda[i] != null)
            {
                double sum = anstallda[i].getlonPerTim()*anstallda[i].gettimVecka();

                if (input > sum)
                {
                    System.out.println("Nedan arbetare har lägre lön: ");
                    System.out.println("ID:\t\t" + anstallda[i].getemployeID());
                    System.out.println("Arbetstitel:\t" + anstallda[i].getarbetsTitel());
                    System.out.println("För namn:\t" + anstallda[i].getfNamn());
                    System.out.println("Efter namn:\t" + anstallda[i].geteNamn());
                    System.out.println("Ålder:\t\t" + anstallda[i].getalder());
                    System.out.println("Timmlön:\t" + anstallda[i].getlonPerTim());
                    System.out.println("Arbetad tid:\t" + anstallda[i].gettimVecka());
                    System.out.println("Stad:\t\t" + anstallda[i].getstad());
                    System.out.println("");
                }
            }
        }
    }
        
}