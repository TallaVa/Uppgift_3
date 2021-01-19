package Examination_3;

import java.util.Scanner;

public class EmployeDemo
{
    private static Scanner scanner = new Scanner(System.in);
    private static Employe employeeList[] = new Employe[20];
    private static int index = 0;


    public static void main(String[] args) {


        System.out.println("Hello");
        boolean quit = false;
        int choice = 0;


        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printEmployeeList(employeeList);
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    removeEmployee();
                    break;
                case 4:
                    searchForEmployee();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    printInstructions();
            }
        }
    }

    private static void printEmployeeList(Employe[] anstallda) {
        for (int i = 0; i < anstallda.length; i++) {
            if (anstallda[i] != null)
                System.out.println(anstallda[i].toString());
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the contact list.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To remove a contact.");
        System.out.println("\t 4 - To search for a contact.");
        System.out.println("\t 5 - To quit.");
    }

    public static boolean idOnFile(Employe[] anstallda) {
        boolean isDuplicate = false;

        for (int i = 0; i < anstallda.length; i++) 
        {
            for (int j = i + 1; j < anstallda.length; j++) 
            {
                if (anstallda[i] != null && anstallda[j] != null)
                {
                    if (anstallda[i].getEmplyerId().equals(anstallda[j].getEmplyerId())) 
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
        addNewEmplyee(employeeList, index);
        if (idOnFile(employeeList)) 
        {
            System.out.println("Duplicate, change the ID");
            addNewEmplyee(employeeList, index);
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
        String employeeJob = scanner.nextLine();

        System.out.print("Enter how many hours does this employee work in a week: ");
        String employeeHourWeek = scanner.nextLine();

        System.out.print("Enter how much does this employee get payed by the hour: ");
        String employeePay = scanner.nextLine();

        anstallda[i] = new Employe(employeeId, employeeJob, employeeFirstName, employeeLastName, employeeCity, Integer.parseInt(employeeAge), Integer.parseInt(employeePay), Integer.parseInt(employeeHourWeek));


    }


    public static void removeEmployee() {
        System.out.println("Not implemented");
    }

    public static void searchForEmployee() {
        System.out.println("Not implemented");
    }
}