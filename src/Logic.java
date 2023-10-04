import javax.swing.*;

public class Logic {
    public void run() {
        String växt = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?");

        Palmer planta1 = new Palmer(5, 0.5);
        Palmer planta2 = new Palmer(1, 0.5);
        Kaktusar planta3 = new Kaktusar(0.20, 0.02);
        KöttätandeVäxter planta4 = new KöttätandeVäxter(0.7, 0.2);

        while (!växt.equalsIgnoreCase(namnVäxter.P1.StringVal) && !växt.equalsIgnoreCase(namnVäxter.P2.StringVal) &&
                !växt.equalsIgnoreCase(namnVäxter.P3.StringVal) && !växt.equalsIgnoreCase(namnVäxter.P4.StringVal)) {
            JOptionPane.showMessageDialog(null, "Ogiltig växttyp!");
            växt = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?");
        }

    String typAvVätska = "";
    double resultat = 0.0;
    if(växt.equalsIgnoreCase(namnVäxter.P1.StringVal))
    {
        resultat = planta1.calculate();
        typAvVätska = "kranvatten";
    }else if(växt.equalsIgnoreCase(namnVäxter.P2.StringVal))

    {
        resultat = planta2.calculate();
        typAvVätska = "kranvatten";
    }else if(växt.equalsIgnoreCase(namnVäxter.P3.StringVal))

    {
        resultat = planta3.calculate();
        typAvVätska = "miniralvatten";
    }else if(växt.equalsIgnoreCase(namnVäxter.P4.StringVal))

    {
        resultat = planta4.calculate();
        typAvVätska = "proteindryck";
    }

            JOptionPane.showMessageDialog(null,"växten "+växt+" behöver "+resultat +" liter "+typAvVätska);

    }
}
