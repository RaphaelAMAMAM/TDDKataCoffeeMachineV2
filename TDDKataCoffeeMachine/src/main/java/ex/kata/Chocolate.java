package ex.kata;

public class Chocolate extends Drink {

    @Override
    public String getName() {
        return "chocolate";
    }

    @Override
    public double getPrice() {
        return 0.5;
    }

    @Override
    public boolean getIsHot() {
        return true;
    }
}
