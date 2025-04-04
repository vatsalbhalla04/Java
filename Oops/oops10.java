// File: oops10.java
// Paramaterized Constructor : 
class stu4{
    int sno ; 
    String name ; 
    int eng , hindi ;

    stu4(int x , String y , int a , int b){
        sno = x ;
        name = y ; 
        a = eng ;
        b = hindi ; 
    }
    void printData(){
        System.out.println("Name of the Student is :"+name +" || "+ "The Roll Number is : " +sno +" || "+ "Marks in english : " + eng +" || "+ "Marks in Hindi : " +hindi);
    }
}   

public class oops7 {
    public static void main(String[] args) {
        stu4 s1 = new stu4(1, "Vatsal", 10, 12);   
        stu4 s2 = new stu4(2, "Raj", 11, 14);  
        
        s1.printData();
        s2.printData();
    }
}
