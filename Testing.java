public class Testing Maximum
{
public static void main(String[]args)
{
int[]m={50,60,55,70,80};
int max=0;
int smax=0;
for(int i=0;i<m.length;i++)
{
if(m[i]>max)
{
smax=max;
max=m[i];
}
else if(m[i]>smax)
{
smax=m[i];
}
}
System.out.println(max);
System.out.println(smax);
}
}
