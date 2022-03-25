public class Bag
{public static void main(String[]args)
{ 

int bag=123231;
int bag2=bag;
int sum=0;
int number=0;
while(bag>0)
{
System.out.println(bag%10);
bag=bag/10;
sum=sum*10+bag%10;
number++;
}
System.out.println("sum:"+sum);
System.out.println("number:"+number);
System.out.println("bag:"+bag);
if(bag2==sum)

System.out.println("it is a palindrome");
else
System.out.println("not a palindrome");


}
}

