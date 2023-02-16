class RunnableWithLambda
{
    public static void main(String args[])
    {
        Runnable ob = () ->
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Hi NO: " +i);
            }
        };
        Runnable ob2 = () ->
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("HELLO NO: " +i);
            }
        };
        
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob2);
        t1.start();
        t2.start();
    }
}
