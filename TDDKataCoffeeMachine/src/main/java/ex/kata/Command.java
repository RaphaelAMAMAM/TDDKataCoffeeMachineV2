package ex.kata;

public class Command {
    private final String typeOfDrink;
    private final boolean isExtraHot;
    private final int numberOfSugar;
    private final boolean neededStick;

    public Command(String typeOfDrink, boolean isExtraHot, int numberOfSugar, boolean neededStick) {
        this.typeOfDrink = typeOfDrink;
        this.numberOfSugar = numberOfSugar;
        this.neededStick = neededStick;
        this.isExtraHot = isExtraHot;
    }

    public String getTypeOfDrink() {
        return typeOfDrink;
    }

    public int getNumberOfSugar() {
        return numberOfSugar;
    }

    public boolean isNeededStick() {
        return neededStick;
    }

    public boolean isExtraHot() {
        return isExtraHot;
    }

    @Override
    public String toString() {
        return "Command{" +
                "typeOfDrink='" + typeOfDrink + '\'' +
                ", isExtraHot=" + isExtraHot +
                ", numberOfSugar=" + numberOfSugar +
                ", neededStick=" + neededStick +
                '}';
    }
}
