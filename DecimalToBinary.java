public class DecimaltoBinary
{
public static void main(String[]args)
{
int no=20;

String binary="";
while(no>0)
{
binary=(no%2)+binary;
//System.out.println(no%2);
no=no/2;
}
System.out.println(binary);
}
}