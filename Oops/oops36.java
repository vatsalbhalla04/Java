// Multiple Inheritance : Class implements more than one "interface". 
interface Singer {
    void sing();
}
interface Dancer {
    void dance();
}
class Performance implements Singer , Dancer{
    @SuppressWarnings("override")
    public void sing(){
        System.out.println("Singing a song");
    }
    @SuppressWarnings("override")
    public void dance(){
        System.out.println("Dancing to music");
    }
}
public class oops36 {
    public static void main(String[] args) {
        Performance p = new Performance();
        p.sing();
        p.dance();
    }
}
