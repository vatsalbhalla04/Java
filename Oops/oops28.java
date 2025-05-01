// Static inner class  
class Outer28{
    static int x = 10 ; 

    static class Inner28{
        void print(){
            System.out.println("X :" +x);
        }
    }
}
public class oops28 {
    public static void main(String[] args) {
        Outer28.Inner28 oi = new Outer28.Inner28();
        oi.print();
    }
}
