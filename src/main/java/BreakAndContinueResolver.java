import java.util.Scanner;

public class BreakAndContinueResolver {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
sumPositiveNumbers();

//        skipDividedByThree();


//        showOnlyPositiveScannedNumbers();


//        commandReader();
        scanner.close();
    }

    public static void sumPositiveNumbers() {
        int result = 0;

        while (true) {

            int number = scanner.nextInt();

            if(number < 0) {
                break;
            } else result += number;
            System.out.println(result);
        }
    }

    public static void skipDividedByThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            } else System.out.println(i);
        }
    }

    public static void showOnlyPositiveScannedNumbers() {

        while(true) {
            int number = scanner.nextInt();
            if (number < 0) {
                continue;
            } else System.out.println(number);
        }
    }

    public static void commandReader() {

        while(true) {
            System.out.println("Please enter some string");
            String word = scanner.next();
            if (word.equals("stop")) {
                break;
            } else System.out.println(word);
        }
    }
}
