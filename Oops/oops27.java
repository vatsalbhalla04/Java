class Outer27{

    void outerMethod(){
        System.out.println("Outer Method of Outer Class");

        class LocalInner{
            void display(){
                System.out.println("Hello From Local Inner Class");
            }
        }
        LocalInner local = new LocalInner(); // Creating object of LocalInner class
        local.display();
    }
}
public class oops27 {
    public static void main(String[] args) {
        Outer27 outer = new Outer27();
        outer.outerMethod();
    }
}
