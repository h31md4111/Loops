import java.util.Scanner;

public class ForTaskResolver {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//    numberDividedByThree();
//        sumFromOneToN();
//        multiplyTable();
        isNumberPrime();
//oneToTenPrint();

        scanner.close();
    }

    public static void numberDividedByThree() {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumFromOneToN() {
        System.out.println("Please enter some number");
        int n = scanner.nextInt();
        if (n < 0) {
            throw new IllegalArgumentException("number should be more than 0");
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void multiplyTable() {
        System.out.println("Please enter some number");
        int n = scanner.nextInt();
        int result;

        for (int i = 1; i <= 10; i++) {
            result = i * n;
            System.out.println( i + " x " + n + " = " +result);
        }
    }

    public static void isNumberPrime(){
        System.out.println("Please enter some number");
        int n = scanner.nextInt();

        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime == true) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static void oneToTenPrint() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    }

