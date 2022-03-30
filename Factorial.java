public class Factorial
{
public static void main(String[]args)
{
int no=5;

int fact=no;
while(no>1)
{
no--;
fact=fact*no;
}
System.out.println(fact);
}
}