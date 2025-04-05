// Comparing two objects:
class Rect{
    int length , width ; 

    Rect(int length , int width){
        this.length = length;
        this.width = width;
    }

    boolean equal(Rect r){
        return length == r.length && width == r.width;
    }
}
public class oops14 {
    public static void main(String[] args) {
        Rect r = new Rect(12, 14);
        Rect r1 = new Rect(89, 12);
        Rect r2 = new Rect(34, 45);

        System.out.println("r and r2 are equal: " + r.equal(r2));  // true
        System.out.println("r1 and r3 are equal: " + r1.equal(r2));  // false


    }
}

// class Rect{
//     int len , width; 

//     Rect(int len , int width){
//         this.len = len;
//         this.width = width;
//     }
//     void print(){
//         System.out.println("Length is : "+len + " width is :"+width);
//     }

//     boolean Compare(Rect r){
//         return len == r.len && width == r.width;
//     }
// }
// public class oops14{
//     public static void main(String[] args) {
//         Rect r1 = new Rect(12, 12);
//         Rect r2 = new Rect(12, 12);

//         System.out.println(r1.Compare(r2));
//     }
// }