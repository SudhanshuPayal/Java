abstract class Car
{
    public abstract void drive();
    public void music()
    {
        System.out.println("playing music..");
    }
}
class Bmw extends Car
{
    public void drive()
    {
        System.out.println("Driving..");
    }
     
}
public class AbstractUse
{
    public static void main(String args[])
    {   
        Bmw ob= new Bmw();
        ob.drive();
        ob.music();
    }
}