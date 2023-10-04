public class KöttätandeVäxter extends Växt {
    private double proteindryck;

    public KöttätandeVäxter(double längd, double proteindryck) {
        super(längd);
        this.proteindryck = proteindryck;
    }


    public double calculate() { //polymorfism
        return 0.1+(proteindryck * super.calculate());

    }
}
