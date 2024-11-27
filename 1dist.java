import java.util.Scanner;
class DistancebwPoints
{
public static void main(String args[])
{
int x1,x2,y1,y2;
double dis;
Scanner sc=new Scanner(System.in);
System.out.println("enter x1 points");
x1=sc.nextInt();
System.out.println("enter y1 points");
y1=sc.nextInt();
System.out.println("enter x2 points");
x2=sc.nextInt();
System.out.println("enter y2 points");
y2=sc.nextInt();
dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
System.out.println("distance between "+"("+x1+","+y1+")"+"("+x2+","+y2+")==>"+dis);
}
}