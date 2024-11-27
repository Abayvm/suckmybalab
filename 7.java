import java.util.*;
class Conversions
{
public void convertBinary(int num)
{
int binary[]=new int[40];
int index=0;
while(num>0)
{
binary[index++]=num%2;
num=num/2;
}
for(int i=index-1;i>=0;i--)
{
System.out.print(binary[i]);
}
}
public void convertOctal(int num)
{
int rem;
String str="";
char dig[]={'0','1','2','3','4','5','6','7'};
while(num>0)
{
rem=num%8;
str=dig[rem]+str;
num=num/8;
}
System.out.print(str);
}
public void convertHexaDecimal(int num)
{
int rem;
String str2="";
char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
while(num>0)
{
rem=num%16;
str2=hex[rem]+str2;
num=num/16;
}
System.out.println(str2);
}
}
class BaseConversion
{
public static void main(String a[])
{
int dec;
Conversions obj=new Conversions();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a decimal number:");
dec=sc.nextInt();
System.out.println("\nBinary representation of "+dec+"is:");
obj.convertBinary(dec);
System.out.println("\nOctal representation of "+dec+"is:");
obj.convertOctal(dec);
System.out.println("\nHexadecimal representation of "+dec+"is:");
obj.convertHexaDecimal(dec);
}
}