import java.util.Scanner;
public class MeasurementConversion
{
public static void main(String args[])
{
final double INCH=0.394;
final double METER=0.01;
final double KILOMETER=0.00001;
Scanner in=new Scanner(System.in);
System.out.print("Enter length in centimeter:");
double cm=in.nextDouble();
double inch=cm*INCH;
double m=cm*METER;
double km=cm*KILOMETER;
System.out.print(cm+"cm is equal to"+inch+"inches.");
System.out.print(cm+"cm is equal to"+m+"meters.");
System.out.print(cm+"cm is equal to"+km+"kilometers.");
}
}