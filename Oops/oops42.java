class Emp_42{
    String name ; 
    double baseSal ; 

    Emp_42(String name , double baseSal){
        this.name = name ; 
        this.baseSal = baseSal ; 
    }
    double calculateSal(){
        return baseSal; 
    }
    void print(){
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + calculateSal());
    }
}
class  Manager extends Emp_42{
    double bonus ; 

    Manager(String name , double baseSal , double  bonus){
        super(name , baseSal);
        this.bonus = bonus ; 
    }
    @Override
    double calculateSal(){
        return bonus + baseSal;
    }
}
class Developer extends Emp_42{
    double overtimePay ; 

    Developer(String name , double baseSal , double overtimePay){
        super(name, baseSal);
        this.overtimePay = overtimePay;
    }
    @Override 
    double calculateSal(){
        return baseSal + overtimePay; 
    }
}

public class oops42 {
    public static void main(String[] args) {
        
        Emp_42 e1 = new Manager("Vatsal",7000 ,600);
        Emp_42 e2 = new Developer("Raj", 6000 ,100);

        e1.print();
        System.out.println("-------------------");
        e2.print();

    }
}

