public class Sub
{
public static void main(String[]args)
{
Sub m=new Sub();
m.sub(6,7);
m.sub(8,9,10);
}
public void sub(int a,int b)
{
System.out.println(a-b);
}
public void sub(int a, int b,int c)
{
System.out.println(a-b-c);
}
}