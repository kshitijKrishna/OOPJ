import java.util.Scanner;

interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

class Manager implements Salary {

    public void earnings(double basic) {
        double earnings = basic + (0.8*basic) + (0.15*basic);
        System.out.println("\nEarnings : " + earnings); 
    }

    public void deductions(double basic) {
        double deductions = (0.12*basic);
        System.out.println("Deductions : " + deductions);
    }

    @Override
    public void earnings() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'earnings'");
    }

    @Override
    public void deductions() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deductions'");
    }

    @Override
    public void bonus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bonus'");
    }
    
}

class Substaff extends Manager {
    public void bonus(double basic) {
        double bonus = (0.5*basic);
        System.out.println("Bonus : " + bonus);
    }
}

public class l5q3 {
    public static void main(String[] args) {
        double basic;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary : ");
        basic = sc.nextDouble();
        Substaff obj = new Substaff();
        obj.earnings(basic);
        obj.deductions(basic);
        obj.bonus(basic);
        sc.close();
    }
}
