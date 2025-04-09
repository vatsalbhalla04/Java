// Static Var : 
import java.util.Scanner;

class Stu18{
    int sno; 
    String name ; 
    static int c_value ; 

    void setData(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student number :");
        sno = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the Student Name :");
        name = sc.nextLine();

        c_value++;
    }
    void printData(){
        System.out.println("Student number : "+sno + "Student Name : "+name + " C Value is :"+c_value);
    }
}

public class oops18{
    public static void main(String[] args) {
        Stu18 s1 = new Stu18();
        Stu18 s2 = new Stu18();

        s1.setData();
        s2.setData();

        s1.printData();
        s2.printData();
    }
}