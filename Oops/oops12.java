// File: oops12.java
// Method overloading:
class math1{
    void add(int a , int b){
        System.out.println("Sum of two :"+(a+b));
    }

    void add(int a , int b , int c){
        System.out.println("Sum of three :"+(a+b+c));
    }
    void print(int a , String b){
        System.out.println("Integer id : "+a + " and String is :"+b);
    }
    void print(String x , String y){
        System.out.println("String1 is : "+x + " String2 is : "+y);
    }
    void conact_String(String x , String y){
        System.out.println("Concat String : " + (x + y));
    }
}

public class oops9 {
    public static void main(String[] args) {
        math1 m1 = new math1();
        m1.add(12, 2);
        m1.add(1, 2, 3);
        m1.print(12, "VATSAL");
        m1.print("Rahul", "Raj");
        m1.conact_String("AB", "CD");
    }   
}
