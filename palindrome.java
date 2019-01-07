import java.util.*;
public class palindrome{
public static void main(String[] args){
String a;
int i;
String new1 = "";
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextLine();

String original=a;

for(i=a.length()-1;i>=0;i--)
{
new1= new1 +a.charAt(i);
}
if(original.equals(new1))
{
System.out.println("Palindrome number");
}
else
{
System.out.println("not a palindrome");
}



}

}