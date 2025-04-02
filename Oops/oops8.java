// Constructor overloading : 
class stu5{
    int sno ; 
    String name ; 
    int eng , hindi ;

    stu5(){ // W/o arg's 
            sno = 5 ; 
            name = "Vatsal";
            eng = 23 ; 
            hindi = 34 ; 
    }

    stu5(int x , String y , int a , int b){// with arg's 
        sno = x ;
        name = y ; 
        a = eng ;
        b = hindi ; 
    }

    stu5(int x , String y){ // with 2 arg's
        sno = x ; 
        name = y ; 
        eng = 30 ; 
        hindi  = 40 ;
    }

    void printData(){
        System.out.println("Name of the Student is :"+name +" || "+ "The Roll Number is : " +sno +" || "+ "Marks in english : " + eng +" || "+ "Marks in Hindi : " +hindi);
    }
}

public class oops8 {
    public static void main(String[] args) {
        stu5 s1 = new stu5();
        stu5 s2 = new stu5(1, "Raj", 12, 13);
        stu5 s3 = new stu5(2, "Rahul");

        s1.printData();
        s2.printData();
        s3.printData();
    }
}
