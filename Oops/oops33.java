// Single Inheritance 
class Animal_33{
    void eat(){
        System.out.println("This animal eats food");
    }
}
class Dog extends Animal_33{
    void bark(){
        System.out.println("Dog Barks");
    }
}

public class oops33 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }   
}
