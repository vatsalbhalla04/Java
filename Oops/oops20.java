// Static Method for Bank Interest Calculation
class Banking{
    private static double interest = 5.0 ; 
    @SuppressWarnings("FieldMayBeFinal")
    private String accHolder ; 
    @SuppressWarnings("FieldMayBeFinal")
    private double bal; 

    Banking(String accHolder , double bal){
        this.accHolder = accHolder ; 
        this.bal = bal ; 
    }
    void printData(){
        System.out.println("Account Holder: " + accHolder + ", Balance: " + bal);
    }
    // using a static method to change the static intrest value
    static void changeInterest(double  rate){
        interest = rate;
    }
    static void displayInterest(){
        System.out.println("Current Intrest Rate :"+interest + "%");
    }
}

public class oops20 {
    public static void main(String[] args) {
        Banking b1 = new Banking("Vatsal", 100);
        Banking b2= new Banking("Raj", 200);

        b1.printData();
        b2.printData();
        
        Banking.changeInterest(6.5);
        Banking.displayInterest();
    }
}
