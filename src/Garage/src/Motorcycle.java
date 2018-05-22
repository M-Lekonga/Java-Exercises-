public class Motorcycle extends Vehicles {
    private String colour;

    public Motorcycle(String vName, String vType, int vYear, int id, String vModel) {
        super(vName, vType, vYear, id, vModel);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

