public class Return
{
public static void main(String[]args)
{
Return  r= new Return ();
int mul=r.mul(8,9);
System.out.println(mul);
r.add(mul);
}
public void add(int a)
{
System.out.println(5+a);
}
public int mul(int a ,int b)
{
return 8*9;
}
}
