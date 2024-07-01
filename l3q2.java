import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

public void read() {
 Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = scanner.nextInt();

        System.out.print("Enter breadth: ");
        breadth = scanner.nextInt();
    }

      public void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}

public class l3q2 {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        myRectangle.read();

        System.out.println("\nRectangle Details:");
        myRectangle.display();

        System.out.println("\nCalculated Results:");
        myRectangle.calculate();
    }
}