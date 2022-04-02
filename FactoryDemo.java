public abstract class FactoryDemo extends SmartPhone
{
boolean OrginalPrice=false;
static int price=0;
public void browse()
{
System.out.println("Factory Demo browsing");
}
public abstract void verifyFingerPrint();


public abstract void providePattern();

}