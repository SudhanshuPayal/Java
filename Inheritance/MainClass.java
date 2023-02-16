public class MainClass
{
    public static void main(String args[])
    {
        VeryAdvCalc ob = new VeryAdvCalc();
        int r1=ob.add(4,8);
        int r2=ob.sub(9,3);
        int r3=ob.mul(4,6);
        int r4=ob.div(64,3);
        double r5=ob.power(6,4);
        System.out.println(r1+" "+r2);
        System.out.println(r3+" "+r4);
        System.out.println(r5);

    }
}