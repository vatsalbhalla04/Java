// File: oops04.java
//Passing Obj to a method :

// class Person{
//     String name ; 
//     int age ; 

//     void setData(String name , int age){
//             this.name = name ; 
//             this.age  = age ;
//     }
//     void display(){
//         System.out.println("Name is :" +name + " Age is :" +age);
//     }
//     void copyPerson(Person p){
//         name = p.name;
//         age = p.age;
//     }
// }

// public class oops12 {
//     public static void main(String[] args) {
//         Person p1 = new Person();
//         p1.setData("Raj", 19);

//         Person p2 = new Person();
//         p2.copyPerson(p1);

//         System.out.println("Person 1:");
//         p1.display();

//         System.out.println("Person 2 (Copied):");
//         p2.display();
        
//         //The copyPerson method accepts a Person object as an argument.p2 copies the data of p1.
//     }
// }

import java.util.Scanner;

class Person{
    String name ;
    int age ;

    void setData(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        name = sc.nextLine();
        System.out.println("Enter the age :");
        age = sc.nextInt();
    }
    void printData(){
        System.out.println("Name : " +name + " Age is : "+age);
    }
    void person2(Person p){
        age = p.age;
        name = p.name;
    }
}
public class oops12{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setData();

        //Copying data
        p2.person2(p1);  // p2 copies p1's data not vice versa. 


        System.out.println("Person 1 details :");
        p1.printData();

        System.out.println("Person 2 details (copied) :");
        p2.printData();
    }
}