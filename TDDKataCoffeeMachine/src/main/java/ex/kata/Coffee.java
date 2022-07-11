package ex.kata;

public class Coffee extends Drink {

    @Override
    public String getName() {
        return "coffee";
    }

    @Override
    public double getPrice() {
        return 0.6;
    }

    @Override
    public boolean getIsHot() {
        return true;
    }
}
