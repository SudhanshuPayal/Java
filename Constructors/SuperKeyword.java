class A
{
    public A()
    {
        super();
        System.out.println("normal constructor of A");
    }
     public A(int n)
    {
        super();
        System.out.println("int constructor of A");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("normal constructor of B");
    }
     public B(int n)
    {
        super(5);//we can use this keyword too and it will call the same class constructor
        System.out.println("int constructor of B");
    }
}
public class SuperKeyword
{
    public static void main(String args[])
    {
        B ob1=new B(1);
    }
}