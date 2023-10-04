public class Palmer extends Växt { //ärver från superklassen Växt
    private double kranvatten;

    public Palmer(double längd, double kranvatten) {
        super(längd);
        this.kranvatten = kranvatten;
    }

    @Override
    public double calculate() { //polymorfism
        return kranvatten * super.calculate();
    }
}
