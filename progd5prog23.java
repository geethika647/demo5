import java.util.Scanner;
class Loop1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
//for(int i=n;i>=0;i=i-5)//100,95.......
int i=n;
while(i<=n)
{
//for(int i=0;i<=n;i++)//printing numbers from 1....100
//for(int i=0;i<=n;i=i+5)//5,.........
//for(int i=n;i>=0;i--)//reverese of numbers
System.out.print(i+",");
i=i-5;
//i=i+5;

}
}
}