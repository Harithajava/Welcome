class Calculate
{

public static void main(String[]args)
{
Calculate call=new Calculate();
int result=call.cube(5);
System.out.println(result);
}
static int cube(int a)
{

return a*a*a;
}
}