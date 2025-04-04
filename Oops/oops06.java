// File: oops06.java
// Object Reference Program : 
class stu2 {
    int sno ; 
    String name ; 
}

public class oops3 {
    public static void main(String[] args) {
        stu2 s1 = new stu2();
        stu2 s2 ; 
        s1.name = "Raj";
        s1.sno = 1;

        System.out.println("Student 1 name : " + s1.name + "||" + "Student 1 Roll Num : " + s1.sno);
        
        //Obj Ref : 
        s2 = s1;
        s2.sno = 2 ; 
        s2.name = "Rahul";        
        System.out.println("Student 1 name : " + s1.name + "||" + "Student 1 Roll Num : " + s1.sno);
        System.out.println("Student 2 name : " + s2.name + "||" + "Student 2 Roll Num : " + s2.sno);
        
        // Now again adding values for s2 obj : 
        s2.sno = 101 ; 
        s2.name = "Henry";
        System.out.println("Student 1 name : " + s1.name + "||" + "Student 1 Roll Num : " + s1.sno);
        System.out.println("Student 2 name : " + s2.name + "||" + "Student 2 Roll Num : " + s2.sno);

    }
}
