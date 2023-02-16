class Counter
{
    int count;
    public  synchronized void increment()
    {
        count++;
    }
}
class ThreadWithSynchronization
{
    public static void main(String args[]) throws InterruptedException
    {
        Counter c = new Counter();
        Runnable ob = () ->
        {
            for(int i=0;i<10000;i++)
            {
                c.increment();
            }
        };
        Runnable ob2 = () ->
        {
            for(int i=0;i<10000;i++)
            {
                c.increment();
            }
        };
        
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
