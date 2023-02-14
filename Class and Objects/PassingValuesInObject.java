class Calc
{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class PassingValuesInObject
{
    public static void main(String a[])
    {
        Calc c=new Calc();
        int x=10,y=20;
        int result = c.add(4,5);
        int result2 = c.add(x,y);
        System.out.println("Addition is :" + result);
        System.out.println("Addition is :" + result2);
    }
}