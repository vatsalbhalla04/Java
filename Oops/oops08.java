// File: oops08.java
// Basic Math Program : 
class math {
    int a , b ; 
    void max(){
        if(a>b) System.out.println(a + " is max");
        else System.out.println(b + " is max");
    }
    void add(){
        System.out.println("Addition : " +(a+b));
    }
}

public class oops5 {
    public static void main(String[] args) {
        math m1 = new math();

        m1.a = 22;
        m1.b = 23 ; 
        System.out.println("A = " + m1.a + " B = " + m1.b); 

        m1.max();
        m1.add();
    }
}
