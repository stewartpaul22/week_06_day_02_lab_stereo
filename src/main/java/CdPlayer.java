public class CdPlayer extends Component implements IPlay {

    public CdPlayer(String make, String model) {
        super(make, model);
    }

    @Override
    public String play() {
        return "playing...";
    }

    @Override
    public String stop() {
        return "stopped.";
    }
}
