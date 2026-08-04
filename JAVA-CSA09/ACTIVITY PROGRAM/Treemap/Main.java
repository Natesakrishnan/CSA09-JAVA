package Treemap;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Student Marks Management");
            System.out.println("1.Add Student");
            System.out.println("2.Display All Students");
            System.out.println("3.Search Student");
            System.out.println("4.Remove Student");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    students.put(name, marks);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student records available.");
                    } else {
                        System.out.println("Student Records :");
                        for (Map.Entry<String,Integer> entry :students.entrySet()) {
                            System.out.println(entry.getKey()+" : "+entry.getValue());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Student Name to Search: ");
                    name = sc.nextLine();
                    if (students.containsKey(name)) {
                        System.out.println(name + " Marks = " + students.get(name));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Student Name to Remove: ");
                    name = sc.nextLine();
                    if (students.containsKey(name)) {
                        students.remove(name);
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("thank you");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);
    }
}
