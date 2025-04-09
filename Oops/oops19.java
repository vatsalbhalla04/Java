// Static Method : 
class static1{
    int sno ; 
    String name ; 
    static int count = 0 ; 
        void setData(int sno , String name){
                this.name = name; 
                this.sno = sno;
                count++;
        }
        void PrintData(){
            System.out.println("Student Number is : "+sno + " Student Name : "+name);
        }
        static void printTotalObj(){
            System.out.println("Total Set obj are count : " +count);
        }
}

public class oops19{
    public static void main(String[] args) {

        static1.printTotalObj();

        static1 s1 = new static1();
        static1 s2 = new static1();
        static1 s3 = new static1();

        s1.setData(1, "Vatsal");
        static1.printTotalObj();
        
        s2.setData(2, "Naman");
        static1.printTotalObj();
        s3.setData(3, "Raj");
        
        
        s1.PrintData();
        s2.PrintData();
        s3.PrintData();
        static1.printTotalObj();
        

    }
}