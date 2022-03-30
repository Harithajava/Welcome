public class Armstrong
{
public static void main(String[]args)
{
int no=153;
int temp=no;
int arm=0;
while(no>0)
{
int rem=no%10;
arm=arm+rem*rem*rem;
no=no/10;
}
System.out.println(arm);
if(temp==arm)
System.out.println("This is armstrong number");
else
System.out.println("This is not armstrong number");
}
}