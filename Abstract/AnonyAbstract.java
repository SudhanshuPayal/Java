abstract class Anony
{
    public abstract void show();
}
public class AnonyAbstract
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