package Examination_3;

import java.util.Scanner;

public class EmployeDemo
{
    private static Scanner scanner = new Scanner(System.in);
    private static Employe employeeList[] = new Employe[50];
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
            }
        }
    }

    private static void printEmployeeList(Employe[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i].toString());
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

    public static boolean idOnFile(Employe[] employees) {
        boolean isDuplicate = false;

        for (int i = 0; i < employees.length; i++) 
        {
            for (int j = i + 1; j < employees.length; j++) 
            {
                if (employees[i] != null && employees[j] != null)
                {
                    if (employees[i].getEmplyerId().equals(employees[j].getEmplyerId())) 
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


    public static void addNewEmplyee(Employe[] employees, int i) {

        System.out.print("Enter the employees ID: ");
        String employeeId = scanner.nextLine();


        System.out.print("Enter the employees first name: ");
        String employeeFirstName = scanner.nextLine();

        System.out.print("Enter the employees last name: ");
        String employeeLastName = scanner.nextLine();

        System.out.print("Enter the employees age: ");
        String employeeAge = scanner.nextLine();

        System.out.print("Enter the employees city: ");
        String employeeCity = scanner.nextLine();

        System.out.print("Enter the employees job title: ");
        String employeeJob = scanner.nextLine();

        System.out.print("Enter how many hours does this employee work in a week: ");
        String employeeHourWeek = scanner.nextLine();

        System.out.print("Enter how much does this employee get payed by the hour: ");
        String employeePay = scanner.nextLine();

        employees[i] = new Employe(employeeId, employeeJob, employeeFirstName, employeeLastName, employeeCity, Integer.parseInt(employeeAge), Integer.parseInt(employeePay), Integer.parseInt(employeeHourWeek));


    }


    public static void removeEmployee() {
        System.out.println("Not implemented");
    }

    public static void searchForEmployee() {
        System.out.println("Not implemented");
    }
}