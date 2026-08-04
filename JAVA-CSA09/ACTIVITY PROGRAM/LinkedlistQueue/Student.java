package LinkedlistQueue;

public class Student {
    int reg_no;
    String name;
    Student(int reg_no,String name){
        this.reg_no=reg_no;
        this.name=name;
    }
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Reg_no :"+reg_no);
    }
}
