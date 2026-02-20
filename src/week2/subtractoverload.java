package week2;

class Calculator {

    void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of two integers (" + a + " - " + b + "): " + result);
    }

    void subtract(int a, int b, int c) {
        int result = a - b - c;
        System.out.println("Subtraction of three integers (" + a + " - " + b + " - " + c + "): " + result);
    }

    void subtract(double a, double b) {
        double result = a - b;
        System.out.println("Subtraction of two doubles (" + a + " - " + b + "): " + result);
    }

    void subtract(int startValue, int[] numbers) {
        int result = startValue;
        for (int num : numbers) {
            result -= num;
        }
        System.out.println("Subtraction of an array from " + startValue + ": " + result);
    }
}

public class subtractoverload {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.subtract(50, 20);
        calc.subtract(100, 30, 10);
        calc.subtract(15.5, 4.2);

        int[] nums = {5, 10, 2};
        calc.subtract(50, nums);
    }
}