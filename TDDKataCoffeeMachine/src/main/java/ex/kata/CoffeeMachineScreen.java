package ex.kata;

public class CoffeeMachineScreen {

    public String getCommandSentence(Command command, Drink drink) {

        if (drink.getIsHot()) {
            if (command.getNumberOfSugar() == 0) {
                return command.isExtraHot() ? "Drink maker makes an extra hot " + drink.getName() + " with no sugar - " +
                        "and therefore no stick" :
                        "Drink maker makes one " + drink.getName() + " with no sugar - and therefore no stick";
            }

            String stickSentence = command.isNeededStick() ? "a stick" : "no stick";

            return command.isExtraHot() ? "Drink maker makes an extra hot " + drink.getName() + " with "
                    + command.getNumberOfSugar() + " sugar(s) and " + stickSentence :
                    "Drink maker makes one " + drink.getName() + " with " + command.getNumberOfSugar()
                            + " sugar(s) and " + stickSentence;
        }
        return "Drink maker will make one " + drink.getName();
    }
}
