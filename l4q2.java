import java.util.Scanner;

public class l4q2 {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the plastic type:");
System.out.println("1. 2D Sheet");
System.out.println("2. 3D Box");

int choice = scanner.nextInt(); 

switch (choice) {                
case 1:                     
SheetCost(scanner);             
break;
case 2:
BoxCost(scanner);
break;
default:
System.out.println("Invalid choice!!");

}

}

private static void SheetCost(Scanner scanner) {
System.out.println("Enter the length (ft):");
double length = scanner.nextDouble();
System.out.println("Enter the width (ft):");
double width = scanner.nextDouble();

double area = length * width;
double cost = area * 40.0;
System.out.printf("The total cost of the 2D sheet is Rs %.2f\n", cost);
}

private static void BoxCost(Scanner scanner) {
System.out.println("Enter the length (ft):");
double length = scanner.nextDouble();

System.out.println("Enter the width (ft):");
double width = scanner.nextDouble();

System.out.println("Enter the height (ft):");
double height = scanner.nextDouble();
double volume = length * width * height;
double cost = volume * 60.0;
System.out.printf("The total cost of the 3D box is Rs %.2f\n", cost);
}

}