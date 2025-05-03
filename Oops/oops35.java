class Person_35{
    void speak(){
        System.out.println("Person speaks");
    }
}
class Student_35 extends Person_35{
    void study(){
        System.out.println("Student studies");
    }
}
class Teacher_35 extends Person_35{
    void teach(){
        System.out.println("Teacher teaches");
    }
}
public class oops35 {
    public static void main(String[] args) {
        Student_35 s = new Student_35();
        s.speak();
        s.study();

        Teacher_35 t = new Teacher_35();
        t.speak();
        t.teach();
    }
}
