import java.util.ArrayList;

public class Garage {

    // Array List that hold all vehicles in the Garage//
    ArrayList<Vehicles> vehiclesList = new ArrayList<Vehicles>();


    Vehicles vehicles1 = new Vehicles("Seat_Ibiza", "Car", 2010, 123, "Sport\n");
    Vehicles vehicles2 = new Vehicles("Mercedes", "Van", 2017, 452, "Vito\n");
    Vehicles vehicles3 = new Vehicles("Suzuki_Marauder", "Motorcycle", 8, 123, "Cruiser\n");
    Vehicles vehicles4 = new Vehicles("Vauxhall", "Car", 2018, 556, "Turbo\n");
    Vehicles vehicles5 = new Vehicles("Honda_GoldWing", "Motorcycle", 2010, 562, "Touring\n");
    Vehicles vehicles6 = new Vehicles("BMW_M3Saloon", "Car", 2018, 456, "SportCoupé\n");

    // constructor to add Vehicles//
    public Garage(){
        vehiclesList.add(vehicles1);
        vehiclesList.add(vehicles2);
        vehiclesList.add(vehicles3);
        vehiclesList.add(vehicles4);
        vehiclesList.add(vehicles5);
        vehiclesList.add(vehicles6);
    }

    //To Add Vehicle in Garage//
    public void addVehicle( Vehicles vehicles) {
        vehiclesList.add(vehicles);
    }
    //To Remove Vehicle by Id from Garage//
    public void removeVehilce(int id) {
        vehiclesList.remove(id);
    }
    //To Remove vehicle by Name from Garage//
    public void removeByName(String vName) {
    }
    //To empty the Garage//
//    public void emptyGarage( Vehicles vehicles) {
//         vehiclesList.removeAll();
//    }

    public void quitScanner() {

    }

}


