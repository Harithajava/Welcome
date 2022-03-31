public class Perfect
{
public static void main(String[]args)
{
int no=28;
int perfect=0;
int i=1;
while(i<=no/2)
{
if(no%i==0)
perfect=perfect+i;
i=i+1;
}
if(no==perfect)
System.out.println("perfect number");
else
System.out.println("not Perfect number");
}
}

