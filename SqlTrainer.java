public class SqlTrainer extends Trainer
{
public SqlTrainer()
{
super("CSE","Payilgam");
System.out.println("Hello");


}
public static void main(String[] args)
{ 

SqlTrainer ram=new SqlTrainer();
ram.Training();
System.out.println(ram.dept);
System.out.println(ram.institute);
int salary=ram.getSalary();
System.out.println(salary);
}
}