import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Addition
        System.out.println("Addition: " + (num1 + num2));

        // Subtraction
        System.out.println("Subtraction: " + (num1 - num2));

        // Multiplication
        System.out.println("Multiplication: " + (num1 * num2));

        // Division
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Modulus
        System.out.println("Modulus: " + (num1 % num2));

        // Exponentiation
        System.out.println("Exponentiation: " + Math.pow(num1, num2));

        // Square root
        System.out.println("Square root of first number: " + Math.sqrt(num1));
        System.out.println("Square root of second number: " + Math.sqrt(num2));

        // Trigonometric Functions
        System.out.println("Sin(" + num1 + "): " + Math.sin(Math.toRadians(num1)));
        System.out.println("Cos(" + num1 + "): " + Math.cos(Math.toRadians(num1)));
        System.out.println("Tan(" + num1 + "): " + Math.tan(Math.toRadians(num1)));

        // Factorial Calculation
        System.out.println("Factorial of first number: " + factorial((int) num1));
        System.out.println("Factorial of second number: " + factorial((int) num2));

        // GCD Calculation
        System.out.println("GCD of both numbers: " + gcd((int) num1, (int) num2));

        scanner.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}