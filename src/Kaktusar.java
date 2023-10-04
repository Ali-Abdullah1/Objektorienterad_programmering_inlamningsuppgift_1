public class Kaktusar extends Växt {


    public Kaktusar(double längd, double mineralvatten) {
        super(längd);

    }

    @Override
    public double calculate() { //polymorfism
        return  0.02;
    }
}
