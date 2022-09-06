import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReactorTest {

    Reactor reactor;

    @BeforeEach
    void init(){
        reactor = new Reactor(10);
    }

    @Test
    void storedUraniumQuantityCanBeChecked() {
        //Reactor reactor = new Reactor(10);
        int actual = reactor.getStoredUranium();
        int expected = 10;
        assertEquals(expected,actual);
    }

    @Test
    void uraniumCanBeAdded() {
        //Reactor reactor = new Reactor(10);
        reactor.addUranium(5);
        int expected = 15;
        assertEquals(expected, reactor.getStoredUranium());
    }

    @Test
    void canGenerateSteam() throws NotEnoughUraniumException {
        int uraniumQuantity = 10;
        //Reactor reactor = new Reactor(uraniumQuantity);
        int steam = reactor.generateSteam(10);
        assertEquals(10,steam);
    }

    @Test
    void uraniumUsedForGeneratingSteam() throws NotEnoughUraniumException {
        //Reactor reactor = new Reactor(10);
        reactor.generateSteam(5);
        int expected = 5;
        assertEquals(expected,reactor.getStoredUranium());
    }

    @Test
    void canThrowsNotEnoughUraniumException(){
        //Reactor reactor = new Reactor(10);
        assertThrows(NotEnoughUraniumException.class,
                () -> reactor.generateSteam(11));
    }

    @Test
    void canBeSetOnMaintannce(){
        reactor.setOnMaintanence(true);
        assertTrue(reactor.isOnMaintanence());

        assertE
    }
}