import java.util.Scanner;
public class lab2q3 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n;
int temp;
System.out.println("Enter Size of List");
n = sc.nextInt();
int num[] = new int[n];
System.out.println("Enter The Numbers");
for(int i=0;i<n;i++)
num[i] = sc.nextInt();
for(int j=0;j<n-1;j++)
{
for(int k=0;k<n-1-j;k++)
{
if(num[k]>num[k+1])
{
temp = num[k];
num[k] = num[k+1];
num[k+1] = temp;
}
}
}
System.out.println("The Sorted Numbers Are : ");
for( int k=0;k<n;k++)
System.out.println(num[k]);
}
}