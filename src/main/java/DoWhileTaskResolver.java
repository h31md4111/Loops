import java.util.Scanner;

public class DoWhileTaskResolver {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//askPositiveNumber();
//        passwordCheck();
//        oneToTenUsingDoWhile();
//        exitFromApp();
//        digitsQuantity();

        scanner.close();
    }

    public static void askPositiveNumber() {
        int number;
            do {
                System.out.println("Please enter a positive number");
                number = scanner.nextInt();
            } while (number <= 0);
        System.out.println("You entered: " + number);
        }


    public static void passwordCheck() {
        String password;
        String correctPassword = "1qaz";

            do {
                System.out.println("Please enter correct password");
                password = scanner.next();
            } while (!password.equals(correctPassword));
        System.out.println("authorization");
        }

    public static void oneToTenUsingDoWhile() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exitFromApp() {
        String exitword = "exit";
        String str;


        do {
            str = scanner.next();
            if (!str.equals(exitword)) {
                System.out.println("Please enter exit command");
            }
        } while (!str.equals(exitword));
        System.out.println("App is finished");
    }

    public static void digitsQuantity() {
        int number = scanner.nextInt();

        int result = 0;
        if(number < 0) {
            System.out.println("Please enter a positive number");
        } else {
        do  {
            number = number / 10;
            result++;
        } while (number != 0);
        System.out.println(result);
    }
    }
}
