// super.method: super.methodName() is used to call a method from the parent (super) class when you are inside a subclass and: 
    // --> You want to override a method, but still call the parent version.
    // -->Or you want to reuse the base class logic inside the subclass.
class Animal{
    void sound(){
        System.out.println("Animal Makes a sound");
    }
}
class Dog extends Animal{
    void sound (){
        System.out.println("Dog class");
        super.sound();
        //So yeah — anonymous classes are better for short, specific use-cases. But if you're building a full app structure, or need inheritance features like multiple method overrides, a proper named subclass is the way to go.
    }
}
public class oops43 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
