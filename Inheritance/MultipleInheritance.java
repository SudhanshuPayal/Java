interface Left
{
    default void m1()
    {
        System.out.println("m1 method of Left interface");
    }
}
interface Right
{
    default void m1()
    {
        System.out.println("m1 method of Right interface");
    }
}

public class MultipleInheritance implements Left,Right
{

    public void m1()
    {
        System.out.println("overridden m1 method of our own main class");
        //Left.super.m1();
        //Right.super.m1();
    }
    public static void main(String args[])
    {
        MultipleInheritance ob= new MultipleInheritance();
        ob.m1();   
    }
}