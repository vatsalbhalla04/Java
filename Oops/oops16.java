//Object Array as Arguments
class Students{
    String name ; 
    int marks ; 

    Students(String name , int marks){
        this.name = name ; 
        this.marks = marks ; 
    }
    void display(){
        System.out.println(name + ": " + marks);
    }
}
public class oops16 {

    static void displayStudenst(Students[] stu){
        // Using Adv For looop: 
        for(Students s : stu){
            s.display();
        }
    }
    public static void main(String[] args) {
        Students[] stu = {
            new Students("Alice", 85),
            new Students("Bob", 92),
            new Students("Charlie", 78)
        };

        System.out.println("Student Details:");
        displayStudenst(stu);
    }
}