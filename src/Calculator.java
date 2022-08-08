import java.util.Scanner;

public class Calculator {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean quit = false;
        startCalculator();



        while (!quit) {
            printActions();
            int pressKey = scanner.nextInt();
            System.out.println("Enter two numbers : ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            switch (pressKey) {
                case 0 -> {
                    System.out.println("Switch off calculator");
                    quit = true;
                }
                case 1 -> System.out.println("The answer is -> " + addition(x, y));
                case 2 -> System.out.println("The answer is -> " + subtraction(x, y));
                case 3 -> System.out.println("The answer is -> " + division(x, y));
                case 4 -> System.out.println("The answer is -> " + multiplication(x, y));
                default -> System.out.println("No such option exists");

            }
        }

    }

    private static void startCalculator() {
        System.out.println("Starting Calculator.....");
    }

    public static int addition(int x, int y) {
       if ((y <=0) || (x<=0)){
           System.out.println("Numbers are not valid");
       }
       return x+y;
    }

    public static int subtraction(int x, int y) {
        if ((y <=0) || (x<=0)){
            System.out.println("Numbers are not valid");
        }
        return x-y;
    }

    public static int division(int x, int y) {
        if ((y <=0) || (x<=0)){
            System.out.println("Numbers are not valid");
        }
        return x/y;    }

    public static int multiplication(int x, int y) {
        if ((y <=0) || (x<=0)){
            System.out.println("Numbers are not valid");
        }
        return x*y;
    }

    private static void printActions() {
        System.out.println("\n Available actions: \n press");
        System.out.println("""
                0- switch off the calculator\s
                1 - to add the numbers\s
                2 - to subtract the numbers\s
                3 - to divide the numbers \s
                4 - to multiply two numbers \s
                """);
        System.out.println("Choose your action: ");
    }


}



