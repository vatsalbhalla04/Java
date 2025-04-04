// File: oops05.java
// Basic class program using Scanner class:
import java.util.Scanner;
class stu1 {
    int sno ; 
    String sname ; 

    void setData(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student Number :");
        sno = sc.nextInt();
        System.out.print("Enter the Student Name :");
        sname = sc.next();
    }
    void printData(){
        System.out.println("Student Name : " + sname + " || " + "Student Roll Number : "+ sno);
    }
}

public class oops2 {
    public static void main(String[] args) {
        stu1 s1 = new stu1();
        stu1 s2 = new stu1();

        s1.setData();
        s2.setData();

        s1.printData();
        s2.printData();
    }   
}
