import java.util.Scanner;

public class GarageMain {
    public static void main(String[] args) {
        Garage garage = new Garage();
        boolean quit = false;
        boolean running = false;
        String toQuit;
        String toAdd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ML Garage! List of Current Vehicles in the Garage.\n");
        //System will Display all cars currently in the garage//
        System.out.println(garage.vehiclesList);

       while (!quit) {
           //this will Let users Add they Vehicles to Garage//
           System.out.println("Enter Vehicle Name ?");
           String vName = sc.nextLine();
           System.out.println("Enter Vehicle Type Car/Motorcycle/Van ?");
           String vType = sc.nextLine();
           System.out.println("Enter Vehicle Model ?");
           String vModel = sc.next();
           System.out.println("Enter Vehicle Year ?");
           int vAge = sc.nextInt();
           sc.nextLine();
           System.out.println("Enter vehicle Id number?");
           int id = sc.nextInt();
           sc.nextLine();
           //this will display all of the information users added//
           Vehicles newVehicle = new Vehicles(vName, vType, vAge, id, vModel);
           System.out.println("Here's the Vehicle Details you have Entered| \n" + newVehicle.toString());
           //User will have the option to add or exit//
           System.out.println("Press 'Y' to Add Vehicle or 'Q' to Exit!");
           toQuit = sc.next();
           if (toQuit.equalsIgnoreCase("Q"))
             quit = true;
       }
        garage.quitScanner();
        System.out.println("Thank you for Visiting ML Garage, Come back another time!\n" + "Goodbye!");

        while (running){
           toAdd = sc.next();
        if
            (toAdd.equalsIgnoreCase("Y"))
                running =false;
            System.out.println("status:" + running);
            System.out.println("Your vehicle have been added to the Garage!");
        }






    }
}
