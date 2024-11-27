import java.io.*;
import java.lang.*;
import java.util.*;
class Triangle
{
public static void main(String args[])
{
double a,b,c,s,area;
System.out.println("enter the sides of a triangle");
Scanner Sc=new Scanner (System.in);
a=Sc.nextDouble();
b=Sc.nextDouble();
c=Sc.nextDouble();
if((a+b)> c&& (b+c)>a && (a+c)>b)
{
if(a==b && a==c)
System.out.println("equilateraltriangle");
else if(a==b || a==c || b==c)
System.out.println("isoceles triangle");
else
{
System.out.println("scalenetriangle");
}
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("area="+area);
}
else
{
System.out.println("cannot form a triangle");
}
}
}