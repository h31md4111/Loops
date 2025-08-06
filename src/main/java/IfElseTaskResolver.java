import java.util.Scanner;

public class IfElseTaskResolver {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        double number = scanner.nextDouble();
//
//        findTheSign(number);
//        System.out.println("enter the first number");
//        double val1 = scanner.nextDouble();
//        System.out.println("enter the second number");
//        double val2 = scanner.nextDouble();
//
//        System.out.println(findMaxValue(val1,val2));
//        int mark = scanner.nextInt();
//        markDescription(mark);

//        int number = scanner.nextInt();
//        parityCheck(number);

//        System.out.println("Enter the age: ");
//        int age = scanner.nextInt();
//
//        discountByAge(age);

        System.out.println("Enter the mark from 0 to 100: ");
        int mark = scanner.nextInt();

        testMarkDescription(mark);

        scanner.close();

    }

    public static void findTheSign(double number) {
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Number is 0");
        }
    }

    public static double findMaxValue(double val1, double val2) {
        double result = val1;

        if (val2 > val1) {
            result = val2;
        } return result;
    }

    public static void markDescription(int mark) {
        if (mark > 5 || mark <= 0) {
            System.out.println("mark should be from 0 to 5");
        } else if (mark == 5) {
            System.out.println("Great");
        } else if (mark == 4) {
            System.out.println("Good");
        } else if (mark == 3) {
            System.out.println("Less than good");
        } else if (mark == 2 || mark == 1) {
            System.out.println("Negative");
        }
    }

    public static void parityCheck(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is parity number");
        } else {
            System.out.println("Number is non-parity number");
        }
    }

    public static void discountByAge(int age) {
        if (age >= 65) {
            System.out.println("Your discount is 30%");
        } else if (age < 18) {
            System.out.println("Your discount is 25%");
        } else {
            System.out.println("normal price");
        }
    }

    public static void testMarkDescription(int mark) {
        if (mark > 100 || mark < 0) {
            System.out.println("mark should be from 0 to 100");
        } else if (mark >= 90) {
            System.out.println("Perfect");
        } else if (mark >= 75) {
            System.out.println("Good");
        } else if (mark >= 60) {
            System.out.println("Less than good");
        } else {
            System.out.println("Negative mark");
        }
    }
}
