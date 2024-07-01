import java.util.Scanner;  
 
class lab1q4   
{  
 public static void main(String args[])  
 {    
  Scanner in = new Scanner(System.in); 
  System.out.println("Enter a number to check if it is a palindrome:"); 
  int n = in.nextInt(); 
  int m = n;
  int c = 0;
  int r = 0;
  while (m>0)
  {
   r = m % 10;
   c = (c*10) + r;
   m = m/10;
  } 
  if (c==n) 
           System.out.println("Entered number is a palindrome.");  
  else  
           System.out.println("Entered number isn't a palindrome.");     
 } 
}