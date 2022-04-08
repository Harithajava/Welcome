public class Petrol
{
public static void main(String[]args)
{
int[]petrol_price={100,101,102,99};
int index=0;
int highest=petrol_price[0];

for(int i=1;i<petrol_price.length;i++)
{
if(petrol_price[i]<highest)
{
highest=petrol_price[i];
index=i;
}
}
System.out.println("Lowest Price" +highest);
System.out.println("Day is :"+index);
}
}
 