
import java.util.Scanner;

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exited");
                break;
            }

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            int result = 0;

            if (choice == 1) {
                result = add(num1, num2);
            } else if (choice == 2) {
                result = subtract(num1, num2);
            } else if (choice == 3) {
                result = multiply(num1, num2);
            } else if (choice == 4) {
                result = divide(num1, num2);
            } else {
                System.out.println("Invalid option");
                continue;
            }

            System.out.println("Answer: " + result);
        }

        sc.close();
    }
}
