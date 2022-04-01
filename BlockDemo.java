public class BlockDemo
{
{
System.out.println("non static block1");
}
static
{
System.out.println(" non static block 2");
}
static
{
System.out.println("static block 1");
}
static
{
System.out.println("static block 2");
}
public static void main(String[]args)
{
new BlockDemo();
System.out.println("Main Method");
}
}