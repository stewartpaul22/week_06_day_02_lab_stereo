import org.junit.Before;

import java.util.ArrayList;

public class TestStereo {

    private Stereo stereo;
    private ArrayList<Component> components;

    @Before
    public void setUp() {
        components = new ArrayList<>();
        Radio radio = new Radio("Denon", "RT101");
        CdPlayer cdPlayer = new CdPlayer("Sony", "CD202");
        components.add(radio);
        components.add(cdPlayer);
        stereo = new Stereo("NoiseMaker", components);
    }
}
