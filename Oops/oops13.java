//Swapping Two Objects Using a Method
//https://chatgpt.com/c/67e3f5d2-c938-800f-a735-87ba8280d1f7 --> static

class Box{
    int len; 

    Box(int len){
        this.len = len;
    }
    void print(){
        System.out.println("Length is : " +len);
    }
    static void swap(Box b1 , Box b2){
        int temp ;
        temp = b1.len;
        b1.len = b2.len;
        b2.len = temp;
    }
}

public class oops13{
    public static void main(String[] args) {
        Box b1 = new Box(90);
        Box b2 = new Box(100);

        System.out.println("Before swapping :");
        b1.print();
        b2.print();
        
        Box.swap(b1,b2);
        System.out.println("After swapping :");
        b1.print();
        b2.print();
     }
}