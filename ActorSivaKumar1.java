public class ActorSivaKumar1 implements Actor
{
static String address="Coimbatore";
public ActorSivaKumar1()
{ 

System.out.println("hello");
}
public ActorSivaKumar1(int number,String name)
{
  
System.out.println(number+" "+name);

}
public static void main(String[]args)
{
ActorSivaKumar1 as=new ActorSivaKumar1(65,"Audi Car");
Actor ac=new ActorSivaKumar1();
as.Speaking();
as.act();
as.dance();
as.sing();
System.out.println(as.address);
System.out.println(ac.address);

System.out.println(makeUpRequired);
}
public void Speaking()
{
System.out.println("SivaKumar is Speaking");
}
public void act()
{
System.out.println("Sivakumar is acting");
}
public void dance()
{
System.out.println("Sivakumar is dancing");
}
public void sing()
{
System.out.println("Sivakumar is singing");
}
}
