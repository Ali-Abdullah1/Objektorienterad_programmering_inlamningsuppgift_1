public class Växt implements Calc{
    private double längd;

    public Växt(double längd) {
        this.längd = längd;
    }

    @Override
    public double calculate() {
        return längd;
    }
}
