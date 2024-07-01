import java.util.Scanner;
class Box
{
  int length;
  int width;
  int height;

  int volume()
  {
   int volume = length*width*height;
  return volume;
  }
}
public class l3q1 {
    public static void main(String[] args) {
        Box mybox = new Box();
        System.out.println("Enter Dimentions :");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        mybox.length = l;
        int h = sc.nextInt();
        mybox.height = h;
        int w = sc.nextInt();
        mybox.width = w;

        System.out.println("The Volume Is: " + mybox.volume());
    }
}