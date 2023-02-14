class TypeConversion
{
    public static void main(String a[])
    {
        int x=12;
        //byte y=x; //error lossy conversion
        byte y=(byte) x;
        System.out.println(y);
        byte z=(byte)257; //will give 1 as output because of it will be get %256 operated
        System.out.println(z);
    }
}