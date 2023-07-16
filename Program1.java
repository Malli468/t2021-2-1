import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter the type of operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        double result;
        switch (operation) {
            case "+":
                result = calculator.add(a, b);
                System.out.println("Result: " + result);
                break;
            case "-":
                result = calculator.subtract(a, b);
                System.out.println("Result: " + result);
                break;
            case "*":
                result = calculator.multiply(a, b);
                System.out.println("Result: " + result);
                break;
            case "/":
                try {
                    result = calculator.divide(a, b);
                    System.out.println("Result: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
