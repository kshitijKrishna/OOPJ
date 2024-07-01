import java.util.Scanner;

class plate
{
    double length;
    double  width;
    plate(double length,double width){
        this.length=length;
        this.width=width;
        System.out.println("length of the plate"+length);
        System.out.println("width of the plate" +width);
    }
}

class box extends plate
{
    double height;
    box(double length,double width, double height){
        super(length, width);
        this.height=height;
        System.out.println("length of the box"+length);
        System.out.println("breadth of the box"+width);
        System.out.println("breadth of the box"+height);
    }
}
class woodbox extends box
{
    double thick;
    woodbox(double length, double width,double height , double thick){
        super(length, width, height);
        this.thick=thick;
        System.out.println("length of woodbox"+length);
        System.out.println("width of woodbox"+width);
        System.out.println("thick of woodbox"+thick);
    }
}

public class l4q3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter dimensions for plate");
        System.out.println("Length(in ft)");

        double lengthplate = sc.nextDouble();
        System.out.print("Width (in ft): ");
        double widthPlate = sc.nextDouble();
        plate Plate = new plate(lengthplate, widthPlate);
        
        System.out.println("\nEnter dimensions for Box:");
        System.out.print("Length (in ft): ");
        double lengthBox = sc.nextDouble();
        System.out.print("Width (in ft): ");
        double widthBox = sc.nextDouble();
        System.out.print("Height (in ft): ");
        double heightBox = sc.nextDouble();
        box Box = new box(lengthBox, widthBox, heightBox);

        System.out.println("\nEnter dimensions for WoodBox:");
        System.out.print("Length (in ft): ");
        double lengthWoodBox = sc.nextDouble();
        System.out.print("Width (in ft): ");
        double widthWoodBox = sc.nextDouble();
        System.out.print("Height (in ft): ");
        double heightWoodBox = sc.nextDouble();
        System.out.print("Thickness (in ft): ");
        double thicknessWoodBox = sc.nextDouble();
        woodbox WoodBox = new woodbox(lengthWoodBox, widthWoodBox, heightWoodBox, thicknessWoodBox);



    }
}