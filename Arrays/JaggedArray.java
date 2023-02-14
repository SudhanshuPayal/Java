class JaggedArray
{
    public static void main(String args[])
    {
        int a[][]= new int[3][];
        a[0]=new int[3];
        a[1]=new int[4];
        a[2]=new int[5];
        //inserting values in array using random functions
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=(int)(Math.random()*10);
            }
        }
        // //printing array using normal loop
        // for(int i=0;a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        //printing array using enhanced for loop
        for(int n[]:a){
            for(int m:n){
              System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}