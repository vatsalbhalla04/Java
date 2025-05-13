// Multilevel Inheritance Example
import java.util.Scanner;

class Stu_38 {
    int sno;
    String name;

    void setStu() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student Roll Num: ");
        sno = sc.nextInt();
        sc.nextLine(); // consume newline left by nextInt()
        System.out.print("Enter the Student Name: ");
        name = sc.nextLine();
    }

    void printStu() {
        System.out.println("Student Roll Num = " + sno);
        System.out.println("Student Name     = " + name);
    }
}

class Marks_38 extends Stu_38 {
    int eng, hindi;

    void setMarks() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the English Marks: ");
        eng = sc.nextInt();

        System.out.print("Enter the Hindi Marks: ");
        hindi = sc.nextInt();
    }

    void printMarks() {
        System.out.println("English Marks = " + eng);
        System.out.println("Hindi Marks   = " + hindi);
    }
}

class Result extends Marks_38 {
    int total;

    void printTotal() {
        total = eng + hindi;
        System.out.println("Total Marks   = " + total);
    }
}

public class oops38 {
    public static void main(String[] args) {
        Result r = new Result();
        r.setStu();
        r.setMarks();

        System.out.println("\n--- Student Details ---");
        r.printStu();

        System.out.println("\n--- Marks Details ---");
        r.printMarks();

        System.out.println("\n--- Result ---");
        r.printTotal();
    }
}
