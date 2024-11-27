import java.util.Scanner;
public class arms
{
public static void main(String args[])
{
int temp,digit,sum,n,inputarmstrong;
Scanner in=new Scanner(System.in);
System.out.println("enter the limits");
n=in.nextInt();
for(inputarmstrong=0;inputarmstrong<=n;inputarmstrong++)
{
temp=inputarmstrong;
sum=0;
while(temp!=0)
{
digit=temp%10;
sum=sum+digit*digit*digit;
temp/=10;
}
if(sum==inputarmstrong)
System.out.println(inputarmstrong);
}
}
}