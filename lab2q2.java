import java.util.Scanner;
public class lab2q2{
public static void main(String[] args){
int number[] = new int[10];
int even=0, odd=0;
Scanner Input = new Scanner(System.in);
System.out.println("Enter the 10 numbers: ");
for(int i=0;i<10;i++){
number[i]=Input.nextInt();
if(number[i]%2 == 0)
even++;
else
odd++;
}
System.out.println("Number of Even: " + even);
System.out.println("Number of Odd: " +  odd);
}
}