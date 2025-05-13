@FunctionalInterface
interface MathOpt {  // <-- make it public
    double operate(double a, double b);
}

public class oops48 {
    public double calculate(double a , double b, MathOpt op){
        return op.operate(a, b);
    }
    public static void main(String[] args) {
        oops48 cal = new oops48();

        MathOpt add =(x,y) -> x+y;
        MathOpt sub =(x,y) -> x-y;
        MathOpt multiply =(x,y) -> x*y;
        MathOpt divide =(x,y) -> y!=0 ? x/y : 0;

        System.out.println("Add: "+ cal.calculate(10, 5, add));
        System.out.println("Sub: "+ cal.calculate(10, 5, sub));
        System.out.println("Multiply: "+ cal.calculate(10, 5, multiply));
        System.out.println("Divide: "+ cal.calculate(10, 5, divide));

    }
}
