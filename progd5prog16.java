import java.util.Scanner;
class Findmax
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
int b=scob.nextInt();
int c=scob.nextInt();
int max;
int min;
if(a>b)
{
if(a>c)max=a;
else max=c;
}
else
{
if(b>c)max=b;
else max=c;
}
if(a<b)
{
if(a<c)min=a;
else min=c;
}
else
{
if(b<c)min=b;
else min=c;
}
System.out.println("Minimum no is:"+min);
System.out.println("Maximum no is:"+max);
}
}
