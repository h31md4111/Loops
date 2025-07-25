import java.util.Scanner;

public class WhileTaskResolver {
    public static void main(String[] args) {
//calculateFactorial();
//        printAllEvenNumbersUntilN();
        decrementFromNToOne();
    }

    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number to calculate factorial");
        int n = scanner.nextInt();

        int result = 1;
        int i = 1;

        while (i <= n) {
            result = result * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static void printAllEvenNumbersUntilN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number to calculate numbers that can be divided by 2 until this number");
        int n = scanner.nextInt();
        int i = 1;

        while (i < n) {
        if (i % 2 == 0) {
            System.out.println(i + " is a even number");
        }  i++;
        }
    }

    public static void decrementFromNToOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number to print decrement from this number to one");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter only positive number");
        }

        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }
}
