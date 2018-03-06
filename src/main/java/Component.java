public abstract class Component {

    private String Make;
    private String Model;

    public Component(String make, String model) {
        Make = make;
        Model = model;
    }


    public String getMake() {
        return this.Make;
    }

    public String getModel() {
        return this.Model;
    }
}
