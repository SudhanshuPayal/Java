class Calc
{
    public void add(){
        int n1=5,n2=10;
        System.out.println("addition is :" + (n1+n2));
    }
}
class SimpleProg
{
    public static void main(String a[])
    {
        Calc c=new Calc();
        c.add();
        //System.out.println("Hello World");
    }
}