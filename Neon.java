public class Neon 
{
public static void main(String[]args)
{
int no=9;
int sqrt=no*no;
int sum=0;
int digit;
while(sqrt>0)
{
digit=sqrt%10;
sum=sum+digit;
sqrt=sqrt/10;
}
System.out.println(sum);
if(sum==no)
System.out.println("neon number");
else
System.out.println(" Not neon number");
}
}
