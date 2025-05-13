interface A {
    void print();
}
interface B {
    void scan();
}

class C implements A,B{
    @Override
    public void print(){
        System.out.println("Priting Doc's");
    } 
    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}
public class oops45{
    public static void main(String[] args) {
        C demo = new C();
        demo.print();
        demo.scan();
    }
}
