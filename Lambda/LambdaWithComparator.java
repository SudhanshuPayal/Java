import java.util.*;
import java.util.stream.*;
public class LambdaWithComparator 
{
    public static void main(String args[])
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(20);
        al.add(10);
        al.add(25);
        al.add(05);
        al.add(30);
        al.add(0);
        System.out.println(al);

        Comparator<Integer> c = (I1,I2) -> (I1<I2)?-1:(I1>I2)?1:0;
        Collections.sort(al,c);
        System.out.println(al);

        al.stream().forEach(System.out::println);//stream for displaying all in arraylist
        //List<Integer> l =al.stream().filter(i->i%2==0).collect(Collectors.tolist());
        //cannotfind .toList() error
        //to collect all the even numbers from the arraylist into listwe can use
        System.out.println(l);
    }
}