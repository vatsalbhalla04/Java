class Outer26 {
    private String message = "Hello From Outer Class";

    // Member Inner Class : 
    class Inner26{
        void display(){
            System.out.println(message);
        }
    }
}

public class oops26 {
    public static void main(String[] args) {
        Outer26 outer = new Outer26();
        Outer26.Inner26 inner = outer.new Inner26();
        // we put "new" after the reference to the outer class in order to create an instance of the inner class 
        inner.display();
    }
}
