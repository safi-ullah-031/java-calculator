import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nWhat calculation do you want to perform?");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Modulus");
                System.out.println("6. Exponentiation");
                System.out.println("7. Square Root");
                System.out.println("8. Trigonometric Functions (sin, cos, tan)");
                System.out.println("9. Factorial");
                System.out.println("10. GCD (Greatest Common Divisor)");
                System.out.println("11. Logarithm (Base 10)");
                System.out.println("12. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                if (choice == 12) {
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                }

                double num1 = 0, num2 = 0;
                if (choice >= 1 && choice <= 6 || choice == 10 || choice == 11) {
                    num1 = getValidNumber(scanner, "Enter the first number: ");
                    num2 = getValidNumber(scanner, "Enter the second number: ");
                } else if (choice == 7) {
                    num1 = getValidNumber(scanner, "Enter a number to find its square root: ");
                } else if (choice == 8) {
                    num1 = getValidNumber(scanner, "Enter an angle in degrees: ");
                } else if (choice == 9) {
                    num1 = getValidNumber(scanner, "Enter a number to find its factorial: ");
                }

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    case 5:
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 % num2));
                        } else {
                            System.out.println("Error: Modulus by zero is not allowed.");
                        }
                        break;
                    case 6:
                        if (num1 < 0 && num2 < 0) {
                            System.out.println("Error: Negative base with negative exponent is not supported.");
                        } else {
                            System.out.println("Result: " + Math.pow(num1, num2));
                        }
                        break;
                    case 7:
                        if (num1 < 0) {
                            System.out.println("Error: Square root of negative numbers is not allowed.");
                        } else {
                            System.out.println("Square root of " + num1 + " is: " + Math.sqrt(num1));
                        }
                        break;
                    case 8:
                        if (num1 > 360 || num1 < 0) {
                            System.out.println("Error: Angle must be between 0° and 360°.");
                        } else {
                            System.out.println("sin(" + num1 + "°): " + Math.sin(Math.toRadians(num1)));
                            System.out.println("cos(" + num1 + "°): " + Math.cos(Math.toRadians(num1)));
                            System.out.println("tan(" + num1 + "°): " + Math.tan(Math.toRadians(num1)));
                        }
                        break;
                    case 9:
                        if (num1 < 0) {
                            System.out.println("Error: Factorial of a negative number is not defined.");
                        } else {
                            System.out.println("Factorial of " + (int) num1 + " is: " + factorial((int) num1));
                        }
                        break;
                    case 10:
                        System.out.println("GCD of " + (int) num1 + " and " + (int) num2 + " is: " + gcd((int) num1, (int) num2));
                        break;
                    case 11:
                        if (num1 <= 0) {
                            System.out.println("Error: Logarithm undefined for non-positive values.");
                        } else {
                            System.out.println("Logarithm of " + num1 + " is: " + Math.log10(num1));
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid choice. Please select a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }
        scanner.close();
    }

    // Function to get a valid number from the user
    public static double getValidNumber(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid numeric value.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    // Function to calculate factorial
    public static int factorial(int n) {
        if (n < 0) return -1; // Factorial of negative numbers is not defined
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate GCD
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
