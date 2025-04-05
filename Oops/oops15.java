// Object as an Argument for aggregation 
class Address{
    String city ; 
    String state ; 

    Address(String city , String state){
        this.city = city ; 
        this.state = state;
    }
    void display(){
        System.out.println("City: " + city + ", State: " + state);
    }
}
class Employee{
    String name;
    int id ; 
    Address address; 

    public Employee(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }
    void display() {
        System.out.println("Employee: " + name + ", ID: " + id);
        address.display();
    }
}
public class oops15 {
    public static void main(String[] args) {
        Address ad = new Address("New York","NY");
        Employee emp = new Employee("Vatsal", 1, ad);

        emp.display();
    }
}
