// Anonymous Inner Class using an Interface : 
interface Greeting{
    void hello();
}

public class oops30 {
    public static void main(String[] args) {
        Greeting greet = new Greeting() {
            public void hello(){ // Method Implementation 
                System.out.println("Hello From Anonymous Class , Greeting ");
            }
        };
        greet.hello();
    }
}
