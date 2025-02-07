class t1 {
    public static void main(String[] args) {
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=new Thread();
        
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        
        t1.setName("Jay");
        t1.setPriority(10);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        
    }
}