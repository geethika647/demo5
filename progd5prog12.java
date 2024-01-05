import java.util.Scanner;
class Countvow
{
static boolean checkVowel(char c)
{
boolean b;
if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
{
b=true;
}
else
{
b=false;
}
return b;
}
public static void main(String args[])
{
String str;
int count=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter a string:");
str=sc.nextLine();
System.out.println("");
for(int i=0;i<str.length();i++)
{
if(checkVowel(str.charAt(i)))
{
count++;
}
}
System.out.println("\nNumber of vowels="+count);
}
}

