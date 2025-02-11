//To initiate a thread in Java, we should use the start() method, not run().
class USA extends Thread
{
    public void run()
    /*The run() method contains the code that will be executed when the thread starts, but calling run() 
    directly will not create a new thread—it will just execute like a normal method in the same thread.*/
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
            System.out.println("USA" + i);
            Thread.sleep(500);
                
            }
        }catch(InterruptedException ex){}
    }
}


@SuppressWarnings("unused")
class t2 {
    public static void main(String[] args) {
        USA u1=new USA();
        /*The start() method, on the other hand, creates a new thread and calls the run() method internally.*/
        u1.start();
    }
}
