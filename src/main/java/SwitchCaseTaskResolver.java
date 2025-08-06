import java.util.Scanner;

public class SwitchCaseTaskResolver {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(dayOfWeek());
//        System.out.println(ticketPrice());
//        System.out.println(markIntToMarkChar());
//        System.out.println(commandExecution());
        System.out.println(calculator());

        scanner.close();
    }

    public static String dayOfWeek() {
        System.out.println("Enter a number from 1 to 7");
        int day = scanner.nextInt();

        String result = "";

        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Please use number from 1 to 7 for day of a week";
        }
        return result;
    }

    public static int ticketPrice() {
        System.out.println("Enter a day from 1 to 7");
        int day = scanner.nextInt();
        int price = 0;

        switch (day) {
            case 1, 2, 3, 4, 5 -> price = 300;
            case 6, 7 -> price = 450;
            default -> System.out.println("Please enter a day number from 1 to 7");
        }
        return price;
    }

    public static String markIntToMarkChar() {
        System.out.println("Enter a mark from 0 to 100");
        int mark = scanner.nextInt();
        String result = "";

        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark should be from 0 to 100");
        }
        switch (mark) {
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> result = "A";
            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 -> result = "B";
            case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 -> result = "C";
            case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 -> result = "D";
            default -> result = "F";
        }
        return result;
    }

    public static String commandExecution() {
        System.out.println("Print the command from: 'start stop restart status'");
        String command = scanner.nextLine();

        String result = "";

        switch (command) {
            case "start":
                result = "Program is started";
                break;
            case "stop":
                result = "Program is stopped";
                break;
            case "restart":
                result = "Program is restarted";
                break;
            case "status":
                result = "Program is showing its status";
                break;
            default:
                result = "You can use only commands 'start stop restart and status'";
        }
        return result;
    }

    public static double calculator() {
        System.out.println("Enter the first double value");
        double val1 = scanner.nextDouble();

        System.out.println("Enter an arithmetic operator");
        String operator = scanner.next();

        System.out.println("Enter the second double value");
        double val2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            case "/":
                if (val2 == 0) {
                    throw new IllegalArgumentException("You can not divide by zero");
                } else result = val1 / val2;
                break;
            default:
                throw new IllegalArgumentException("Please use operators ' + - * /");

        }
        return result;
    }
}