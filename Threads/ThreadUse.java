class A extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("HI NO: " +i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("HELLO NO: " +i);
        }
    }
}
class ThreadUse
{
    public static void main(String args[])
    {
        A ob = new A();
        B ob2 =new B();
        ob.start();
        ob2.start();
    }
}
