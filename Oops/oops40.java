// Demo of No-Argument Constructor in Inheritance
class A_40 {
    A_40() {
        System.out.println("A Class Constructor");
    }
}

class B_40 extends A_40 {
    B_40() {
        System.out.println("B Class Constructor");
    }
}

class C_40 extends B_40 {
    C_40() {
        System.out.println("C Class Constructor");
    }
}

public class oops40 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        C_40 c1 = new C_40();
    }
}
