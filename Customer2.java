public class Customer2
{
public static void main(String[] args)
{
Bank b=new Bank();
int  acc_no=b.getAcc_no();
String email=b.getEmail();
String name= b.getName();
float amount=b.getAmount();
System.out.println(acc_no);
System.out.println(email);
System.out.println(name);
System.out.println(amount);



}
}