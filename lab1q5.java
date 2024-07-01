import java.util.Scanner;
class lab1q5
{
 public static void main (String[] args)
 {
  Scanner input=new Scanner(System.in);
  System.out.println("Enter the first name:");
  String Fname = input.nextLine();
  System.out.println("Enter the last name:");
  String Lname = input.nextLine();
  System.out.println(Lname + " " + Fname);
 }
}