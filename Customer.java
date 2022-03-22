public class Customer 
{
public static void main(String[]args)
{
Finish fi=new Finish();
int tickets=fi.getTickets();
System.out.println(tickets);
fi.setTickets(40);
tickets=fi.getTickets();
System.out.println(tickets);
}
}