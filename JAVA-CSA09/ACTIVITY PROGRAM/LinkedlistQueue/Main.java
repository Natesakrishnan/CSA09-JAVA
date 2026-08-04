package LinkedlistQueue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Student> LL=new LinkedList<>();

        int n,e;
        do{
            System.out.println("operations");
            System.out.println("1.add student");
            System.out.println("2.remove student");
            System.out.println("3.seach student");
            System.out.println("4.Didplay all student");
            System.out.println("5.exit or continue");

            System.out.println("Enter a choice:");
            n=sc.nextInt();

            switch(n){
                case 1:
                    System.out.println("Enter a student reg_no:");
                    int reg_no=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter a student name:");
                    String name=sc.nextLine();
                    LL.add(new Student(reg_no,name));
                    break;
                case 2:
                    System.out.println("Enter a reg_no of student to be removed :");
                    int r= sc.nextInt();
                    for(Student s:LL){
                        if(s.reg_no==r){
                            LL.remove(s);
                            System.out.println("Student removed successfully");
                            break;
                        }
                        else
                            System.out.println("Student reg_no is not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter a student reg_no to be found :");
                    int re= sc.nextInt();
                    Student search=null;

                    for(Student se:LL){
                        if(se.reg_no==re){
                            System.out.println("Student found");
                            search=se;
                            System.out.println("Name :"+search.name);
                            System.out.println("reg_no :"+search.reg_no);
                            break;
                        }
                        else
                            System.out.println("Student not found");
                    }
                    break;
                case 4:
                    for(Student d:LL){
                        int i=1;
                        System.out.println("Student : "+(i));
                        d.display();
                        i++;
                    }
                    break;
                case 5:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid choice");

            }
            System.out.println("Enter 5 to continue and 7 to exit");
            e= sc.nextInt();
        }while(e==5);

    }
}
