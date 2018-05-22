public class Vehicles {
    //Private fields

    private String vName;
    private String vType;
    private int vYear;
    private int id;
    private String vModel;
    //constructor

    public Vehicles(String vName, String vType, int vYear, int id, String vModel) {
        this.vName = vName;
        this.vType = vType;
        this.vYear = vYear;
        this.id = id;
        this.vModel = vModel;
    }
    //Getters
    public String getvName() {
        return vName;
    }

    public String getvType() {
        return vType;
    }

    public int getvAge() {
        return vYear;
    }

    public int getReg() {
        return id;
    }

    public String getvModel() {
        return vModel;
    }

    //Setters
    public void setvName(String vName) {
        this.vName = vName;
    }

    public void setvType(String vType) {
        this.vType = vType;
    }

    public void setvAge(int vAge) {
        this.vYear = vAge;
    }

    public void setReg(int id) {
        this.id = id;
    }

    public void setvModel(String vModel) {
        this.vModel = vModel;
    }


    @Override
    public String toString() {
        return "Name: " + this.getvName() +" -" + " Type: " + this.getvType()+ " -" +" Year: "+ this.getvAge() +" -" + " Id: " + this.getReg()+ " -" +" Model: " + this.getvModel();
    }
}
