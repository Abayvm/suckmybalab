import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class smallest_largest
{
public static void main(String args[])
{
int n,temp,i,j;
int[]arr;
Scanner scanner=new Scanner(System.in);
System.out.println("How many numbers do you want?");
n=scanner.nextInt();
arr=new int[n];
for(i=0;i<n;i++)
{
System.out.print("Enter elements "+" "+(i+1)+":");
arr[i]=scanner.nextInt();
}
for(i=0;i<arr.length;i++)
{
for(j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("\nThe smallest number is:"+arr[0]);
System.out.println("\nThe largest number is:"+arr[n-1]);
System.out.println("\nThe second largest number is:"+arr[n-2]);
}
}