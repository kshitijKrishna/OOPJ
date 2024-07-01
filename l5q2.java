interface Motor {
    int capacity = 10;
    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Motor Running...");
    }

    public void consume() {
        System.out.println("Motor Consuming...");
    }
    
}

public class l5q2 {
    public static void main(String[] args) {
        WashingMachine obj = new WashingMachine();
        System.out.println("Capacity of the motor is : " + Motor.capacity);
        obj.run();
        obj.consume();
    }
}