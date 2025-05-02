// Accesing a NON - STATIC MEMBER via Outer Class Instance . 
class Outer29{
    private int value = 10 ; 

    static  class Inner29{
       void diplay(){
        Outer29 outer = new Outer29();
        System.out.println("Value: " + outer.value); // Now it's accessible
       }
    }
}

public class oops29 {
    public static void main(String[] args) {
        Outer29.Inner29 inner = new Outer29.Inner29();
        inner.diplay();
    }
}
