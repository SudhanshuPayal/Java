class MultiDimension
{
    public static void main(String args[])
    {
        int a[][][]= new int[3][3][3];
        //inserting values in array using random functions
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i][j].length;k++)
                {
                a[i][j][k]=(int)(Math.random()*10);
                }
            }
        }
        for(int x[][]:a){
            for(int n[]:x){
                for(int m:n){
                System.out.print(m + " ");
                }
            System.out.println();
        }
        System.out.println();
        }
        
    }
}