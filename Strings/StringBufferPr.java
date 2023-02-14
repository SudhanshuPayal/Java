class StringBufferPr
{
    public static void main(String a[])
    {
        StringBuffer sb = new StringBuffer("Sudhanshu");
        System.out.println(sb);
        sb.append(" payal");
        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(3));
        sb.deleteCharAt(2);
        System.out.println(sb);
        //String str=sb; //will give error normally
        String str=sb.toString();
        System.out.println(str);

        sb.insert(0,"java");
        System.out.println(sb);
        sb.insert(10 ,"java");
        System.out.println(sb);
    }  
}