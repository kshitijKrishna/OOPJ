import java.util.Scanner;

class Shape2D {
    protected double area;

    public void setArea(double area) {
        this.area = area;
    }

    public double calculateCost() {
        return area * 40; 
    }
}

class Shape3D extends Shape2D {
    protected double volume;

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public double calculateCost() {
        return volume * 60; 
    }
}

public class l4q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions for plastic:");
        System.out.println("For 2D shape (sheet):");
        System.out.print("Enter area (in square ft): ");
        double area = scanner.nextDouble();

        System.out.println("For 3D shape (box):");
        System.out.print("Enter volume (in cubic ft): ");
        double volume = scanner.nextDouble();

        Shape2D shape2D = new Shape2D();
        shape2D.setArea(area);

        Shape3D shape3D = new Shape3D();
        shape3D.setVolume(volume);

        System.out.println("Cost for 2D shape (sheet): Rs " + shape2D.calculateCost());
        System.out.println("Cost for 3D shape (box): Rs " + shape3D.calculateCost());
        
        scanner.close();
    }
}
