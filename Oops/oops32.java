// Anonymous Inner Class for Thread
public class oops32 {
    public static void main(String[] args) {
        // Creating a thread of using an anonymous class : 
        Thread t = new Thread(){
            public void run (){
                System.out.println("Thread is runnig ..");
            }
        };
        t.start();
    }
}
