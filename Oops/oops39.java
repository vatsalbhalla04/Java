//Hierarchical Inheritance 

import java.util.Scanner;

class Poly{
    double h , w ; 
    void setData(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height :");
        h = sc.nextInt();

        System.out.print("Enter Width :");
        w = sc.nextInt();
    }
    void printData(){
        System.out.println("Height = " + h+ " Width = " + w); 
    }
}
class Triangle extends Poly{
    void printArea(){
        System.out.println("Area of Triangle :"+ (h*w*0.5));
    }
}
class Rectangle extends Poly{
    void printArea(){
        System.out.println("Area of Rectangle :" + (h * w));
    }
}
public class oops39 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setData(); 
        r1.printData(); 
        r1.printArea(); 
        
        Triangle t1=new Triangle(); 
        t1.setData(); 
        t1.printData(); 
        t1.printArea();
    }   
}
