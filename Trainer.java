public class Trainer
{

String dept;
String institute;
private int salary=10000;
public Trainer(String dept,String institute)
{
this.dept=dept;
this.institute=institute;


}
public int getSalary()
{
return this.salary;
}
public static void main(String[]args)
{
Trainer trainerkumar=new Trainer("CSE","Payilagam");
}

public void Training()		
{
System.out.println("Training");
}
}
