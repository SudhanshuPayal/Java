class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("HI NO: " +i);
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("HELLO NO: " +i);
        }
    }
}
class RunnableUse
{
    public static void main(String args[])
    {
        A ob = new A();
        B ob2 =new B();
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob2);
        t1.start();
        t2.start();
    }
}
