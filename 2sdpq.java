import java.util.Scanner;
public class sum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("first no:");
int num1=in.nextInt();
System.out.println("second no:");
int num2=in.nextInt();
System.out.println(num1+"+"+num2+"="+(num1+num2));
System.out.println(num1+"-"+num2+"="+(num1-num2));
System.out.println(num1+"*"+num2+"="+(num1*num2));
System.out.println(num1+"/"+num2+"="+(num1/num2));
System.out.println(num1+"mod"+num2+"="+(num1%num2));
}
}