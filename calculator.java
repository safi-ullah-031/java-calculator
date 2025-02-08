public class calculator{
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        // Addition
        double sum = num1 + num2;
        System.out.println("Addition: " + sum);

        // Subtraction
        double difference = num1 - num2;
        System.out.println("Subtraction: " + difference);

        // Multiplication
        double product = num1 * num2;
        System.out.println("Multiplication: " + product);

        // Modulus
        double modulus = num1 % num2;
        System.out.println("Modulus: " + modulus);

        // Exponentiation
        double exponentiation = Math.pow(num1, num2);
        System.out.println("Exponentiation: " + exponentiation);

        // Division

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
