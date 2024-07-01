import java.util.Scanner;

public class q2{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter your Percentage: ");
double S = input.nextDouble();
 if(S>=90){
         System.out.println("Grade O");
          }
    else if(S< 90 && S>= 80){
         System.out.println(" Grade E");
          }
    else if(S < 80 && S >= 70){
         System.out.println("Grade A");
          }
    else if(S < 70 && S >= 60){
         System.out.println("Grade B");
          }
    else if(S< 60 && S >= 50){
         System.out.println("Grade C");
          }
    else if(S < 50 && S >= 40){
    
  System.out.println(" Grade F");
}
   else {
    System.out.println("Failed!");
}
}
}
