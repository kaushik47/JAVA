import java.util.*;
public class fibanocci
{
public static void main(String[] args)
{
int i,n;
int c;
int a=0;
int b=1;
System.out.println("Enter n");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println(a);
System.out.println(b);
for(i=2;i<n;i++)
{
c=a+b;
a=b;
b=c;
System.out.println(c);
}
}
}