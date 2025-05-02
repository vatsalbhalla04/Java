// Anonymous Inner Class Extending a Class
class Animal {
    void sound(){
        System.out.println("Animal Class");
    }
}
public class oops31 {
    public static void main(String[] args) {
        Animal dog;
        dog = new Animal(){// "dog" : Anonymous Inner Class extending a class
            void sound(){ // Overriding the sound method of class Animal in the Anonymous Inner Class , "Dog"
                System.out.println("Anonymous Inner Class , Dog");
            }
        };
    dog.sound();
   }
}

/* Some Imp Points : 
    Animal is a normal class.

    new Animal() { ... } creates a subclass of Animal without a name.

    The makeSound() method inside { ... } overrides the method in Animal. 

    💡Think of it as writing:
        class Dog extends Animal {
            void makeSound() {
                System.out.println("Bark! Bark!");
            }
        }
    
    But instead of writing a separate Dog class, we define it inside main() as an anonymous inner class!

*/  
