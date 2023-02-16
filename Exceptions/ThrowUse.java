class ThrowUse
{
    public static void main(String a[])
    {
        int i=0;
        int j=0;

        try
        {
            j=18/i;
            if(j==0)
                throw new ArithmeticException("error aaya");
        }
        catch(ArithmeticException e)
        {
            j=18/1;
            System.out.println("default output" + e);
        }
        catch(Exception e)
        {
            System.out.println("some error occured" + e);
        }

        System.out.println(j);
        System.out.println("bye");
        
        
    }
}