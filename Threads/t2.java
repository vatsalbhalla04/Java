
class USA extends Thread
{
    public void run()
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
        u1.start();
    }
}