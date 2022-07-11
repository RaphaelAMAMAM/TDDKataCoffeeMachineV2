package ex.kata;

public class OrangeJuice extends Drink {

    @Override
    public String getName() {
        return "orange juice";
    }

    @Override
    public double getPrice() {
        return 0.6;
    }

    @Override
    public boolean getIsHot() {
        return false;
    }
}
