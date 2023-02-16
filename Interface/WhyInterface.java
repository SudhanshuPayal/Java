interface Computer
{
    void code();
}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("coding in lappy..");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("in coding in desktop..");
    }
}
class Developer
{
    public void devApp(Computer c)
    {
        c.code();
    }
}
public class WhyInterface
{
    public static void main(String args[])
    {
        Computer lap = new Laptop();
        Computer desk= new Desktop();

        Developer sud=new Developer();
        
        sud.devApp(lap);
        sud.devApp(desk);
        
    }
}