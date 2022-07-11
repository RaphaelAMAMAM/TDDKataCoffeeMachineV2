package ex.kata;

public class Tea extends Drink {

    @Override
    public String getName() {
        return "tea";
    }

    @Override
    public double getPrice() {
        return 0.4;
    }

    @Override
    public boolean getIsHot() {
        return true;
    }
}
