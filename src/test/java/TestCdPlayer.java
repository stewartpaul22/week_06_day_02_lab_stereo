import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCdPlayer {

    private CdPlayer cdPlayer;

    @Before
    public void setUp() {
        cdPlayer = new CdPlayer("Sony", "CD202");
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("CD202", cdPlayer.getModel());
    }


}
