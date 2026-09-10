import java.util.Scanner;

class Addition {
    void add(int a, int b) {
        System.out.println("Result = " + (a + b));
    }
}

class Subtraction extends Addition {
    void subtract(int a, int b) {
        System.out.println("Result = " + (a - b));
    }
}

class Multiplication extends Subtraction {
    void multiply(int a, int b) {
        System.out.println("Result = " + (a * b));
    }
}

class Division extends Multiplication {
    void divide(int a, int b) {
        if (b != 0)
            System.out.println("Result = " + ((double) a / b));
        else
            System.out.println("Cannot divide by zero");
    }
}

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Division obj = new Division();

        System.out.println("Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                obj.add(a, b);
                break;

            case 2:
                obj.subtract(a, b);
                break;

            case 3:
                obj.multiply(a, b);
                break;

            case 4:
                obj.divide(a, b);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}