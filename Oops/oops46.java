// Defining a single interface:

import java.util.Scanner;

interface Payment{
    void auth(String user);
    void pay(double amt);
}

//Implemeting the payment intreface for different types of payment class:
class UPI implements  Payment{

    @Override
    public void auth(String user){
        System.out.println("OTP sent to :" +user +" 's phone number");
    }

    @Override
    public void pay(double amt) {
       System.out.println("UPI: Piad amount: "+amt);
    }
}

class CreditCard implements Payment{

    @Override
    public void auth(String user){
        System.out.println("✅ CreditCard: Verified cardholder " + user);
    }

    @Override
    public void pay(double amt) {
        System.out.println("💳 CreditCard: Charged ₹" + amt);     
    }
}

class Wallet implements Payment{
    @Override
    public void auth(String user){
        System.out.println("✅ Wallet: PIN verified for user " + user);
    }

    @Override
    public void pay(double amt) {
        System.out.println("👜 Wallet: Deducted ₹" + amt);
    }
}

// Serivce Class : Which contains the main logic :
class PaymentService{
    public void makePayment(Payment method, String user, double amt)//This is a method declaration

    //This method is part of a service class (in our case: PaymentService) that executes the payment process.It's reusable for any class that implements the Payment interface (like UPI, CreditCard, etc.).

    //"Payment method": Can accept any object that implements Payment
    {
        method.auth(user); // Step 1: Authenticate the user
        method.pay(amt);// Step 2: Process the payment
        System.out.println("Payment Completed");
    }
}

public class oops46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentService service = new PaymentService();

        System.out.println("Choose payment method: 1. UPI  2. Credit Card  3. Wallet");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the username:");
        String user = sc.nextLine(); 
        System.out.println("Enter the amount: ");
        double amt = sc.nextDouble();

        Payment paymentMethod;

        switch (choice) {
            case 1:
                paymentMethod = new UPI();
                break;
            case 2:
                paymentMethod = new CreditCard();
                break;
            case 3:
                paymentMethod = new Wallet();
                break;
            default:
                System.out.println("Invalid Choice!");
                return;
        }
        service.makePayment(paymentMethod, user, amt);
    }
}
