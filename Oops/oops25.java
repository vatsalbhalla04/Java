class Area {
    double h , w ; 

    void findarea(){
        B b1 = new B();
        b1.area();
    }
    class B // Nested Class
    {
        B(){
            h = 100; 
            w = 200; 
        }
        void area(){
            System.out.println("Area of Triagnle = " + (0.5*h*w)); 
        }
    }
}
public class oops25{
    public static void main(String[] args) {
        Area a1 =new Area();
     a1.findarea();   
    }
}