// Single inheritance : 
import java.util.Scanner;

class Base{
    int a ; 
    void setA(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num A :");
        a = sc.nextInt();
    }
    void printA(){
        System.out.println("A :" +a);
    }
}
class Derived extends Base{
    int b ; 
    void setB(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num B :");
        b = sc.nextInt();
    }
    void printB(){
        System.out.println("B :"+b);
    }
    void multiplication(){
        System.out.println("Multi = " +(a*b));
    }
}
public class oops37 {
    public static void main(String[] args) {
        Derived d = new Derived(); 
        d.setA();
        d.setB();
        d.printA();
        d.printB();
        d.multiplication();
    }   
}
