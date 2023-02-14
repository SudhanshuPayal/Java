class Student{
    int rollno;
    String name;
    int marks;
}
class ArrayOfObjects
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.rollno=1;
        s1.name="sud";
        s1.marks=70;

        Student s2=new Student();
        s2.rollno=2;
        s2.name="sudha";
        s2.marks=80;

        Student s3=new Student();
        s3.rollno=3;
        s3.name="sudhansh";
        s3.marks=50;

        Student st[]=new Student[3];
        st[0]=s1;
        st[1]=s2;
        st[2]=s3;

        for (int i=0;i<st.length;i++)
        {
            System.out.println(st[i].rollno +" |" +st[i].name+" : "+st[i].marks);
        }

        //using enhanced for loop
        for(Student s:st)
        {
            System.out.println(s.rollno +" |" +s.name+" : "+s.marks);
        }
    } 
}