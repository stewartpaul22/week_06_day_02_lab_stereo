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
}
