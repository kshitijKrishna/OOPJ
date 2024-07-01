import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager { 
    int empId;
    String empName;

    int deptId;
    String deptName;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter employee id : ");
        empId = sc.nextInt();
        System.out.print("Enter employee name : ");
        sc.nextLine();
        empName = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter department id : ");
        deptId = sc.nextInt();
        System.out.print("Enter department name : ");
        sc.nextLine();
        deptName = sc.nextLine();
    }

    void display() {
        System.out.println("\nEmployee id : " + empId);
        System.out.println("Employee name : " + empName);
        System.out.println("Department id : " + deptId);
        System.out.println("Department name : " + deptName);
    }

}

public class l5q4 {
    public static void main(String[] args) {
        Head obj = new Head();
        obj.getDetails();
        obj.getDeptDetails();
        obj.display();
    }
}