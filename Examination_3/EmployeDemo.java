package Examination_3;

import java.util.Scanner;

public class EmployeDemo
{
    private static Scanner scanner = new Scanner(System.in);
    private static Employe employeeArray[] = new Employe[20];
    private static int index = 0;


    public static void main(String[] args) {


        System.out.println("Välj ett av nedan choise för att gå vidare. avsluta med 5 " +
                            " eller 0 för att se menyn igen");
        boolean exit = false;
        int choise = 0;


        printInstructions();
        while (!exit) 
        {
            System.out.println("Enter your choise: ");
            choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) 
            {
                case 0:
                    exit = true;
                    break;
                case 1:
                    addEmployee();
                    break;
                case 2:
                    //changeEmployee();
                    break;
                case 3:
                    removeEmployee();
                    break;
                case 4:
                    searchForEmployee();
                    break;
                case 5:
                    //printWeekPay();
                    break;
                case 6:
                    //searchForArbetsTitel();
                    break;
                case 7:
                    //searchArbetsTitel();
                case 8:
                    printemployeeArray(employeeArray);
                    break;
                case 9:
                    //searchLessPay();

                case 10:
                    printInstructions();
                    break;

                default:
                    printInstructions();
            }
        }
    }

    private static void printemployeeArray(Employe[] anstallda) {
        for (int i = 0; i < anstallda.length; i++) {
            if (anstallda[i] != null)
                System.out.println(anstallda[i].toString());
        }
    }

    public static void printInstructions() {
        System.out.println("\n -- Meny -- ");
        System.out.println("\t 1 - Lägg till anställd.");
        System.out.println("\t 2 - Ändra anstälds arbets titel.");
        System.out.println("\t 3 - Ta bort anställd.");
        System.out.println("\t 4 - Sök anställd.");
        System.out.println("\t 5 - Kolla veckolön för anställd.");
        System.out.println("\t 6 - Sök alla anställda med samma arbetstitel.");
        System.out.println("\t 7 - Summera alla med samma arbetstitel.");
        System.out.println("\t 8 - Lista alla anställda.");
        System.out.println("\t 9 - Sök efter anställd med lägre lön.");
        System.out.println("\t 0 - Avsluta.");
    }

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


    public static void addNewEmplyee(Employe[] anstallda, int i) {

        System.out.print("Enter the anstallda ID: ");
        String employeeId = scanner.nextLine();


        System.out.print("Enter the anstallda first name: ");
        String employeeFirstName = scanner.nextLine();

        System.out.print("Enter the anstallda last name: ");
        String employeeLastName = scanner.nextLine();

        System.out.print("Enter the anstallda age: ");
        String employeeAge = scanner.nextLine();

        System.out.print("Enter the anstallda city: ");
        String employeeCity = scanner.nextLine();

        System.out.print("Enter the anstallda job title: ");
        String employeeTitle = scanner.nextLine();

        System.out.print("Enter how many hours does this employee work in a week: ");
        String employeeHourWeek = scanner.nextLine();

        System.out.print("Enter how much does this employee get payed by the hour: ");
        String employeePay = scanner.nextLine();

        anstallda[i] = new Employe(employeeId, employeeTitle, employeeFirstName, employeeLastName, employeeCity, 
                                    Integer.parseInt(employeeAge), 
                                    Integer.parseInt(employeePay), 
                                    Integer.parseInt(employeeHourWeek));


    }


    public static void removeEmployee() {
        System.out.println("vem tar vi bort ? :");
        String aNumer = scanner.nextLine();
        employeeArray.length(aNumer);

    }

    public static void searchForEmployee() {
        System.out.println("Not implemented");
    }
}