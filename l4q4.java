class Subtraction {
    // Subtract method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Subtract method to subtract two doubles
    public double subtract(double a, double b) {
        return a - b;
    }

    // Subtract method to subtract an array of integers
    public int subtract(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result -= arr[i];
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Subtraction subtraction = new Subtraction();

        // Using subtract method with two integers
        int result1 = subtraction.subtract(10, 5);
        System.out.println("Subtraction of 10 and 5: " + result1);

        // Using subtract method with two doubles
        double result2 = subtraction.subtract(15.5, 7.3);
        System.out.println("Subtraction of 15.5 and 7.3: " + result2);

        // Using subtract method with an array of integers
        int[] numbers = {20, 4, 3};
        int result3 = subtraction.subtract(numbers);
        System.out.println("Subtraction of array elements: " + result3);
    }
}
