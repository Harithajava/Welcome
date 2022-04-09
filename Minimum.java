public class Minimum
{
public static void main(String[]args)
{
int[]m={50,60,55,70,80};
int min=100;
int smin=100;
for(int i=0;i<m.length;i++)
{
if(m[i]<min)
{
smin=min;
min=m[i];
}
else if(m[i]<smin)
{
smin=m[i];
}
}
System.out.println(min);
System.out.println(smin);
}
}
