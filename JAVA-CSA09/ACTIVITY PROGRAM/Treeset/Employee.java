package Treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class Employee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> employeeIDs = new TreeSet<>();

        int choice;

        do {
            System.out.println("\n===== Employee ID Management =====");
            System.out.println("1. Add Employee ID");
            System.out.println("2. Remove Employee ID");
            System.out.println("3. Search Employee ID");
            System.out.println("4. Display Employee IDs");
            System.out.println("5. First Employee ID");
            System.out.println("6. Last Employee ID");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    if (employeeIDs.add(id)) {
                        System.out.println("Employee ID added successfully.");
                    } else {
                        System.out.println("Employee ID already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    id = sc.nextInt();

                    if (employeeIDs.remove(id)) {
                        System.out.println("Employee ID removed successfully.");
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    id = sc.nextInt();

                    if (employeeIDs.contains(id)) {
                        System.out.println("Employee ID found.");
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 4:
                    if (employeeIDs.isEmpty()) {
                        System.out.println("No Employee IDs available.");
                    } else {
                        System.out.println("\nEmployee IDs (Sorted Order):");
                        for (int empId : employeeIDs) {
                            System.out.println(empId);
                        }
                    }
                    break;

                case 5:
                    if (employeeIDs.isEmpty()) {
                        System.out.println("No Employee IDs available.");
                    } else {
                        System.out.println("First Employee ID: " + employeeIDs.first());
                    }
                    break;

                case 6:
                    if (employeeIDs.isEmpty()) {
                        System.out.println("No Employee IDs available.");
                    } else {
                        System.out.println("Last Employee ID: " + employeeIDs.last());
                    }
                    break;

                case 7:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
