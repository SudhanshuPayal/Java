class Simple
{
    public static void main(String args[])
    {
        int a[]={2,3,4,5,6};
        int a2[]= new int[4];
        //inserting values in array
        a2[0]=4;
        a2[1]=8;
        a2[2]=3;
        a2[3]=7;
        //printing array using normal loop
        for(int i=0;i<a2.length;i++)
        {
            System.out.println(a2[i]);
        }
        //printing array using enhanced for loop
        for(int n:a)
        {
            System.out.println(n);
        }
    }
}