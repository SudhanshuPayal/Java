class Anony
{
    public void show()
    {
        System.out.println("in A show");
    }
}
public class AnonymousInner
{
    public static void main(String args[])
    {
        Anony ob1 = new Anony()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        ob1.show();
        
    }
}