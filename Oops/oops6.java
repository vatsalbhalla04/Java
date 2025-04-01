// Constructor basic :
class stu3{
    int sno ; 
    String name ; 
    int eng , hindi ;
    
    stu3(){
        sno = 5 ; 
        name = "Vatsal";
        eng = 23 ; 
        hindi = 34 ; 
    }
    void printData(){
        System.out.println("Name of the Student is :"+name +" || "+ "The Roll Number is : " +sno +" || "+ "Marks in english : " + eng +" || "+ "Marks in Hindi : " +hindi);
    }
}

public class oops6{
    public static void main(String[] args) {
        stu3 s = new stu3();
        s.printData();
    }
}