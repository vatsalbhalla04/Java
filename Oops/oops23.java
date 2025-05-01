// Multiple Static blocks example: 
class Empp{
    int e_no ; 
    String e_name ; 
    
    static{
        System.out.println("Static Block 1");
    }
    // constructor : 
    Empp(int e_no , String e_name){
        this.e_no = e_no ; 
        this.e_name = e_name ; 
    }
    void display() {
        System.out.println("Student name is: " + e_name + " ||  Student Roll_Num is: " + e_no);
    }
    static{
        System.out.println("Static Block 2");
    }
    static{
        System.out.println("Static Block 3");
    }
}
public class oops23 {
    public static void main(String[] args) {
        Empp e1 = new Empp(1, "Vatsal");
        Empp e2 = new Empp(2, "Raj");

        e1.display();
        e2.display();
    }
}
