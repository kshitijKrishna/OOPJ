import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    double cgpa;

    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            students[i] = new Student(rollNumber, name, cgpa);
        }

        // Display student details
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Name: " + student.name);
            System.out.println("CGPA: " + student.cgpa);
            System.out.println();
        }

        // Find student with lowest CGPA
        Student lowestCGPAStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].cgpa < lowestCGPAStudent.cgpa) {
                lowestCGPAStudent = students[i];
            }
        }

        // Display student with lowest CGPA
        System.out.println("Student with the lowest CGPA:");
        System.out.println("Name: " + lowestCGPAStudent.name);
        System.out.println("Roll Number: " + lowestCGPAStudent.rollNumber);
        System.out.println("CGPA: " + lowestCGPAStudent.cgpa);
    }
}
