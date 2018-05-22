public class Car extends Vehicles {
    private int seats;

    public Car(String vName, String vType, int vYear, int id, String vModel) {
        super(vName, vType, vYear, id, vModel);
    }

    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

}
