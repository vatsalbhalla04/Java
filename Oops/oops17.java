// Max Between two objects
class Math17 {
    int a;
    int b;

    Math17(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void PrintData(String obj) {
        System.out.println(obj + " -> A = " + a + ", B = " + b);
    }

    Math17 max(Math17 m2) {
        if (a + b < m2.a + m2.b) {
            return m2;
        } else {
            return this;
        }
    }
}

public class oops17 {
    public static void main(String[] args) {
        Math17 m1 = new Math17(11, 2);
        Math17 m2 = new Math17(2, 32);
        Math17 m3 = new Math17(0, 0);

        m1.PrintData("M1");
        m2.PrintData("M2");

        Math17 maxObj = m1.max(m2);
        maxObj.PrintData("Max (M1 vs M2)");

        maxObj = maxObj.max(m3);
        maxObj.PrintData("Max (All)");
    }
}
