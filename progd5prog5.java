//TO CHECK WHETHER THE GIVEN NUMBER IS EVEN OR ODD USING% OPERATOR
import java.util.*;
//import java.util.Scanner;
public class Evenodd2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Even\n");
System.out.println(n+"is Even\n");
}
else 
{
System.out.println("Odd\n");
System.out.println(n+"is Odd\n");
}
}
}
