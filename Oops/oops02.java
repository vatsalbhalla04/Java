// File: oops02.java
// Overloaded main method()
class a{
    public static void main(String a , int b){
        System.out.println("main() method With 2 arguments : " + a + " " + b); 
    }
    public static void main(int x) {
        System.out.println("main() method With 1 argument : " + x); 
    }
}
public class oops10 {
    public static void main(String[] args) {
     a.main("Vatsal", 1);
     a.main(20);   
    }
}
