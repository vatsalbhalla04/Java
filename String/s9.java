// String Buffer methods : 
public class s9{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Appned : 
        sb.append("bro");
        System.out.println("Appnded String : " + sb);

        //Insert a String : 
        sb.insert(4, "Java");
        System.out.println("Inserted String : " + sb);

        // Replace a String : 
        sb.replace(1, 6, "Hey");
        System.out.println("Replaced String : "+sb);

        // Delete A part of the String : 
        sb.delete(6, 9);
        System.out.println("Deleted String  "+ sb);

        // Reverse a String : 
        sb.reverse();
        System.out.println("Reversed String : "+sb);

        sb.capacity();
        System.out.println("Capacity : "+sb);

        sb.deleteCharAt(1);
        System.out.println("Delete a particular Char from a word : " + sb);

    }
}