mport java.util.Scanner;
public class fibanocci
{
public static void main(String args[])
{
int n,a=0,b=0,c=1;
Scanner s=new Scanner(System.in);
System.out.println("enter values of n");
n=s.nextInt();
System.out.println("fibanocci series");
for(int i=1;i<=n;i++)
{
a=b;
b=c;
c=a+b;
System.out.println(a);
}
}