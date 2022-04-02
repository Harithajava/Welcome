public class Samsung1 extends FactoryDemo
{
 static int price=5000;
public static void main(String[]args)
{
Samsung1 sam=new Samsung1();
sam.browse();
System.out.println(sam.price);
}
public void verifyFingerPrint()
{
System.out.println("Finger print");
}
public void providePattern()
{
System.out.println("Provide pattern");
}
public int call(int seconds)
{
System.out.println("hello");
return 5+6;
}
public void sendMessage()
{
System.out.println("Sending Message");
}
public void receiveCall()
{
System.out.println("Receiving call");
}
}