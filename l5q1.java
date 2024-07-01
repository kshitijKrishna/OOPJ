import java.util.Scanner;

abstract class Student {
    int rollno;
    int regno;

    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No : ");
        rollno = sc.nextInt();
        System.out.print("Enter Registration No : ");
        regno = sc.nextInt();
        sc.close();
    }

    void display() {
        System.out.println("\nRoll No : " + rollno);
        System.out.println("Registration No : " + regno);
    }

    abstract void course() ;

}

class Kiitian extends Student {
    void course() {
        System.out.println("Course : B.Tech");
    }
}

public class l5q1 {
    public static void main(String[] args) {
        Kiitian obj = new Kiitian();
        obj.getinput();
        obj.display();
        obj.course();
    }
}