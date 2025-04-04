// File: oops03.java
// Obj as Args
import java.util.Scanner;

class Math1 {
    int a, b;

    void setData() {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = s.nextInt();
        System.out.println("Enter the value of b:");
        b = s.nextInt();
    }

    void printData() {
        System.out.println("Value of A is: " + a + " and B is: " + b);
    }

    void add(Math1 m1, Math1 m2) {  
        a = m1.a + m2.a;
        b = m1.b + m2.b;
    }
}

public class oops11 {
    public static void main(String[] args) {
        Math1 m1 = new Math1();
        Math1 m2 = new Math1();
        Math1 m3 = new Math1();

        System.out.println("Enter values for m1:");
        m1.setData();
        
        System.out.println("Enter values for m2:");
        m2.setData();

        System.out.println("\nValues of m1:");
        m1.printData();
        
        System.out.println("Values of m2:");
        m2.printData();

        m3.add(m1, m2);
        
        System.out.println("\nResult of addition (m3):");
        m3.printData();
    }
}
