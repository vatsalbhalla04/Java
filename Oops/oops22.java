// Static block --> Will always be called once .
class Carss{
    static String brand ; 

    // Static block to initialize static variables
    static{
        brand = "Tata";
        System.out.println("Static Block Executed : Car Brand is : Tata");
    }
    // Constructor: 
    Carss(){
        System.out.println("Constructor Executed : ");
    }

    void display(){
        System.out.println("Car brand: " + brand);
    }
}

public class oops22 {
    public static void main(String[] args) {
        System.out.println("Main Method Executed.");
        Carss c = new Carss();
        c.display();
    }
}
