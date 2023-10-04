import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmerTest {
    Palmer planta1 = new Palmer(5, 0.5);
    @Test
    void calculate() {
        assert (planta1.calculate() == 5*0.5);
    }
}