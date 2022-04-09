public class Maximum
{
public static void main(String[]args)
{
int[]m={-4,-3,-7,-9,-2};
int max=Integer.MAX_VALUE;
int smax=Integer.MAX_VALUE;
for(int i=0;i<m.length;i++)
{
if(m[i]<max)
{
smax=max;
max=m[i];
}
else if(m[i]<smax)
{
smax=m[i];
}
}
System.out.println(max);
System.out.println(smax);
}
}
