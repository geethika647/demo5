//swaping the numbers
import java.util.Scanner;
class Inputswap
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int num1; int num2;
num1=sc.nextInt();//8
num2=sc.nextInt();//9
int temp;
temp=num1;//8
num1=num2;//9
num2=temp;//8
System.out.println(num1+"\n"+num2);
}//main()
}//Inputswap