package ex.kata;
import java.util.*;

public class CoffeeMachineSystem extends CoffeeMachineScreen {

    private final int MAX_SUGAR = 2;
    private final Map<String, Drink> shortcutToDrinkMap = new HashMap<>();

    public CoffeeMachineSystem() {

        shortcutToDrinkMap.put("T", new Tea());
        shortcutToDrinkMap.put("H", new Chocolate());
        shortcutToDrinkMap.put("C", new Coffee());
        shortcutToDrinkMap.put("O", new OrangeJuice());
    }

    public Drink getDrink(Command command) {
        return shortcutToDrinkMap.get(getShortCutDrink(command));
    }

    private String getShortCutDrink(Command command) {
        return command.getTypeOfDrink();
    }

    public Command newCommand(String command) {
        String[] commandByDefault = {"Unknown Drink", "0", "-1"};
        String[] userCommand = command.split(":");

        for (int i = 0; i < userCommand.length; i++) {
            commandByDefault[i] = userCommand[i];
        }
        String[] finalCommand = Arrays.copyOf(commandByDefault, 3);
        return toCommand(finalCommand);
    }

    private Command toCommand(String[] finalCommand) {
        int numberOfSugar;

        try {
            numberOfSugar = Integer.parseInt(finalCommand[1]);
        } catch (NumberFormatException e) {
            numberOfSugar = 0;
        }

        boolean needStick = finalCommand[2].equals("0");

        String[] typeOfDrink = finalCommand[0].split("");
        if (typeOfDrink.length == 2 && typeOfDrink[1].equalsIgnoreCase("H")) {
            return new Command(typeOfDrink[0].toUpperCase(), true, numberOfSugar, needStick);
        }
        return new Command(finalCommand[0].toUpperCase(), false, numberOfSugar, needStick);
    }

    public boolean checkCommand(Command command) {

        boolean drinkExist = false;
        for (Map.Entry<String, Drink> entry : shortcutToDrinkMap.entrySet()) {
            if (entry.getKey().equals(command.getTypeOfDrink())) {
                drinkExist = true;
                break;
            }
        }

        if (!drinkExist) {
            System.out.println("ERROR : Drink (" + command.getTypeOfDrink() + ") is not available");
            return false;
        }
        System.out.println(command.getNumberOfSugar());
        if (command.getNumberOfSugar() < 0 || command.getNumberOfSugar() > MAX_SUGAR) {
            System.out.println("ERROR : You cannot ask for less than 0 sugar or more than " + MAX_SUGAR + " sugars");
            return false;
        }
        return true;
    }

    public boolean checkMoneyFromUser(Drink drink, double moneyFromUser) {

        if (moneyFromUser >= drink.getPrice()) {
            return true;
        }

        System.out.println("ERROR : You did not put enough money. " +
                "\n" + (drink.getPrice() - moneyFromUser) + "€ missing");
        return false;
    }
}
