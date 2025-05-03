//Multilevel Inheritance
class Animal_34{ // parent class
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog_34 extends Animal_34{ // child class one 
    void bark(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog_34{ // child class two 
    void sleep(){
        System.out.println("Puppy Sleeps");
    }
}

public class oops34 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound();
        p.bark();
        p.sleep();
    }
}
