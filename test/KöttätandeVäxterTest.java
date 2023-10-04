import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxterTest {
    KöttätandeVäxter planta4 = new KöttätandeVäxter(0.7, 0.2);
    @Test
    void calculate() {
        assert (planta4.calculate() == 0.1 + (0.2*0.7));
    }
}