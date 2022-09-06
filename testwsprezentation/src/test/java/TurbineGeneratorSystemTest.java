import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurbineGeneratorSystemTest {
    TurbineGeneratorSystem turbineGeneratorSystem;

    @BeforeEach
    void init(){
        turbineGeneratorSystem = new TurbineGeneratorSystem();
    }

    @Test
    void canGenerateElectricity() {
        int electricity = turbineGeneratorSystem.generateElectricity(10);
        assertEquals(50,electricity);
    }

    @Test
    void zeroSteamGeneratesZeroElectricity() {
        int electricity = turbineGeneratorSystem.generateElectricity(0);
        assertEquals(0,electricity);
    }

    @Test
    void throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> turbineGeneratorSystem.generateElectricity(-1));
    }
}