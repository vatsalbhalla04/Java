class Students_GU {
    @SuppressWarnings("FieldMayBeFinal")
    private int sno;
    @SuppressWarnings("FieldMayBeFinal")
    private String sname;
    @SuppressWarnings("FieldMayBeFinal")
    private int eng;
    @SuppressWarnings("FieldMayBeFinal")
    private int hindi;

    // Default constructor
    // public Students_GU() {
    //     sno = 1;
    //     sname = "Default Student";
    //     eng = 90;
    //     hindi = 90;
    // }

    // Parameterized constructor
    public Students_GU(int x, String y, int z, int k) {
        sno = x;
        sname = y;
        eng = z;
        hindi = k;
    }

    public void printData() {
        System.out.println("Student Id: " + sno + 
                           " | Student Name: " + sname + 
                           " | Marks In English: " + eng + 
                           " | Marks In Hindi: " + hindi);
    }
}

public class al6 {
    public static void main(String[] args) {
        Students_GU s1 = new Students_GU(1,"Vatsal",45,67);
        Students_GU s2 = new Students_GU(2, "Rahul", 85, 88);
        Students_GU s3 = new Students_GU(3, "Priya", 92, 95);
        Students_GU s4 = new Students_GU(4, "Amit", 78, 82);

        s1.printData();
        s2.printData();
        s3.printData();
        s4.printData();
        
    }
}