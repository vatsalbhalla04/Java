// Demo of with args constructor using super keyword in inheritance
class A_41 {
    int x, y;

    A_41(int a, int b) {
        this.x = a;
        this.y = b;
        System.out.println("A class constructor");
    }
}

class B_41 extends A_41 {
    int p, q;

    B_41(int a, int b, int c, int d) {
        super(a, b); // calling A_41 constructor
        this.p = c;
        this.q = d;
        System.out.println("B class constructor");
    }
}

class C_41 extends B_41 {
    int r;

    C_41(int a, int b, int c, int d, int e) {
        super(a, b, c, d); // calling B_41 constructor
        this.r = e;
        System.out.println("C class constructor");
    }

    void print() {
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("r = " + r);
    }
}

public class oops41 {
    public static void main(String[] args) {
        C_41 c1 = new C_41(10, 11, 12, 13, 14);
        c1.print();
    }
}
