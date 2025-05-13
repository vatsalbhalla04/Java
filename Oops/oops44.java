// Abstract Method : Scenario: Online Payment System:

//Step 1 : Define an abstract class with an abstract method : 
abstract class PaymentProcessor{
    void authenticator(){ // concrete method
        System.out.println("Authenticating the user");
    }
    abstract void processPayment(double amt); // abs method
}

//step -2 : Implement UPI, card, and wallet as subclasses:
// UPI CLASS:
class UPIPayment extends PaymentProcessor{
    void processPayment(double amt){
        System.out.println("Processing UPI payment of ₹: "+amt);
    }
}
// Card Payment class: 
class cardPayment extends PaymentProcessor{
    void processPayment(double amt){
        System.out.println("Processing Card payment of ₹" + amt);
    }
}
// Wallet class: 
class WalletPayment extends PaymentProcessor{
    void processPayment(double amt){
        System.out.println("Processing Wallet payment of ₹" + amt);
    }
}

public class oops44 {
    public static void main(String[] args) {
        PaymentProcessor payment; //This line just declares a reference variable of type PaymentProcessor. It’s not creating any object yet.

        payment = new UPIPayment(); // Now we are creating the obj for the subclass using the "payment", which is a reference variable. 
        payment.authenticator();
        payment.processPayment(250.0);

        payment = new cardPayment();
        payment.authenticator();
        payment.processPayment(500.0);

        payment = new WalletPayment();
        payment.authenticator();
        payment.processPayment(150.0);
    }
}
