import java.util.Scanner;

class AreaCalculator {
    // Method to calculate the area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a square
    public double area(double sideLength, String shape) {
        return sideLength * sideLength;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Choose the shape for which you want to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + calculator.area(radius));
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of the triangle: " + calculator.area(base, height));
                break;
            case 3:
                System.out.print("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                System.out.println("Area of the square: " + calculator.area(sideLength, "square"));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
