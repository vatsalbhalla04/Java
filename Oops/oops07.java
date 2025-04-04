// File: oops07.java
// Ref obj using "final" keyowrd : 
class Car {
    String model ; 

    Car(String model){
        this.model = model;
    }
    void display(){
        System.out.println("Car model :" + model);
    }
}

public class oops4 {
    public static void main(String[] args) {
        // Creating a new obj using the constructor : 
        final Car car1 = new Car("Tata");
        
        // car1 = new Car("Tesla"); // creating a new ref is not allowed when final is already decalred 
        car1.display();

        // car2 is assigned to car1's ref : 
        Car car2 = car1;
        car2.model = "Mahindra";
        car2.display();
        car1.display();
    }
}
