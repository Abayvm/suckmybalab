import java.util.*;
public class Merge
{
public static void main(String args[])
{
int size1,size2,size,i,j,k;
int arr1[]=new int[50];
int arr2[]=new int[50];
int merge[]=new int[100];
Scanner scan=new Scanner(System.in);
System.out.print("Enter array 1 size:");
size1=scan.nextInt();
System.out.print("Enter array 1 elements:");
for(i=0;i<size1;i++)
{
arr1[i]=scan.nextInt();
}
System.out.print("Enter array 2 size:");
size2=scan.nextInt();
System.out.print("Enter array 2 elements:");
for(i=0;i<size2;i++)
{
arr2[i]=scan.nextInt();
}
System.out.print("Merging the array....\n");
for(i=0;i<size1;i++)
{
merge[i]=arr1[i];
}
size=size1+size2;
for(i=0,k=size1;k<size&&i<size2;i++,k++)
{
merge[k]=arr2[i];
}
System.out.print("Now the new array after merging is:\n");
for(i=0;i<size;i++)
{
System.out.print(merge[i]+"");
}
}
}