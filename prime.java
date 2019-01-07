import java.util.*;
public class prime{
public static void main(String[] args)
{
int i,n,m;
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int flag = 1;
m=n/2;
if(n==0 || n==1){
System.out.println("Given number is not a prime number");
}
else if(n==2){
System.out.println("Given number is a prime number");
}
else{

for(i=2;i<=m;i++){
if(n%i==0){
flag = 0;
break;
}

}
 if(flag == 0)
{
System.out.println("Given number is not a prime number");
}
else
{
System.out.println("Given number is a prime number");
}
flag = 1;

}

}
}