import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusarTest {
    Kaktusar planta3 = new Kaktusar(0.20, 0.02);
    @Test
   void calculate() {
        assert (planta3.calculate() == 0.02);
    }
}