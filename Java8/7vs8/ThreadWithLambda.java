class ThreadWithLambda
{
    public static void main(String args[])
    {
        //java7
        Runnable t1= new Runnable()
        {
            public void run()
            {
                System.out.println("Thread 1");
            }
        };
        new Thread(t1).start();
        //java8
        Runnable t2 = () ->System.out.println("Thread 2");
        new Thread(t2).start();

        //java7
        new Thread(new Runnable(){
            public void run()
            {
                System.out.println("Thread 3");
            }
        }).start();
        
        //java8
        new Thread(()-> System.out.println("Thread 4")).start();

        
        new Thread(()-> {
            System.out.println("Thread 5");
            System.out.println("Thread 6");
            System.out.println("Thread 7");
            System.out.println("Thread 8");
            }).start();
    }
}
