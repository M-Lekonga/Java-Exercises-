public class Van extends Vehicles {

    private int doors;
    public Van(String vName, String vType, int vYear, int id, String vModel) {
        super(vName, vType, vYear, id, vModel);
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
