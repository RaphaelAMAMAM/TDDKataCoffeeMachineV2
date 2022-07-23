package ex.kata;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CoffeeMachineSystem coffeeMachineSystem = new CoffeeMachineSystem();

        System.out.println("Hi user!");
        while (true) {
            System.out.println("Please enter your command :");
            Command newCommand = coffeeMachineSystem.newCommand(userInputString());
            Drink drink = coffeeMachineSystem.getDrink(newCommand);

            if (coffeeMachineSystem.checkCommand(newCommand)) {
                System.out.println("Please put money :");
                if (coffeeMachineSystem.checkMoneyFromUser(drink, userInputDouble())) {
                    System.out.println(coffeeMachineSystem.getCommandSentence(newCommand, drink));
                }
            }
        }
    }

    public static String userInputString() {
        return scanner.nextLine();
    }

    public static double userInputDouble() {
        try {
            double doubleFromUser = scanner.nextDouble();
            scanner.nextLine();
            return doubleFromUser;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("ERROR : you did not put money, please retry :");
            return userInputDouble();
        }
    }
}
