import java.util.Scanner;

public class DoWhileTaskResolver {
    public static void main(String[] args) {
//askPositiveNumber();
//        passwordCheck();
//        oneToTenUsingDoWhile();
//        exitFromApp();
        digitsQuantity();
    }

    public static void askPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 0) {
            do {
                System.out.println("Please enter a positive number");
                break;
            } while (number <= 0);
        }
    }

    public static void passwordCheck() {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        String correctPassword = "1qaz";

        if (!password.equals(correctPassword)) {
            do {
                System.out.println("Please enter correct password");
            } while (password.equals(correctPassword));
        }
    }

    public static void oneToTenUsingDoWhile() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exitFromApp() {
        Scanner scanner = new Scanner(System.in);
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
        Scanner scanner = new Scanner(System.in);
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
