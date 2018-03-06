public class Radio extends Component implements IPlay {

    public Radio(String make, String model) {
        super(make, model);
    }

    public String tune(String station) {
        return "Tuned to: " + station;
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
