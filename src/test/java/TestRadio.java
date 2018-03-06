import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRadio {

    private Radio radio;

    @Before
    public void setUp() {
        radio = new Radio("Denon", "RT101");
    }

    @Test
    public void canGetMake() {
        assertEquals("Denon", radio.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("RT101", radio.getModel());
    }

    @Test
    public void canTune() {
        assertEquals("Tuned to: Radio 1", radio.tune("Radio 1"));
    }

    @Test
    public void canPlay() {
        assertEquals("playing...", radio.play());
    }

    @Test
    public void canStop() {
        assertEquals("stopped.", radio.stop());
    }
}
