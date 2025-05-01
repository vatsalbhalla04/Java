class Emp24 {
    int eno;
    String ename;

    // Constructor
    Emp24(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    void display() {
        System.out.println("Employee num = " + eno + ", Employee name = " + ename);
    }

    // Overriding finalize() method
    // wrote "Override" intentionally  to see the message confirming object destruction :
    @Override
    protected void finalize() {
        System.out.println("Finalize() method called for Employee: " + ename);
    }
}

public class oops24 {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        Emp24 e1 = new Emp24(1, "Vatsal");
        e1.display();

        // Now, e1 no longer references the Emp24 object, making it eligible for garbage collection. The object is now "orphaned" (no references pointing to it)
        e1 = null;

        // Requesting garbage collection
        //GC execution is not guaranteed. It depends on the JVM's memory management
        System.gc();

        // Pauses execution for 1 second, giving GC time to potentially run (not guaranteed)
        try { 
            Thread.sleep(1000); 
        } 
        catch (InterruptedException e) { 
            e.printStackTrace();
        }
    }
}
