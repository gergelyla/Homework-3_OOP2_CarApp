import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int menuCounter=0;
        Cars passat= new Passat(Passat.FUEL_TANK_SIZE,17,"JKL123456789");
        Cars golf= new Golf(Golf.FUEL_TANK_SIZE,15,"JKH987654321");
        Cars focus= new Focus(Focus.FUEL_TANK_SIZE,17,"FRD78546987123");
        Cars fiesta= new Fiesta(Fiesta.FUEL_TANK_SIZE,16,"FRD632589471856");
        while (menuCounter!=5){
            availableCarsSelection((Passat) passat, (Golf) golf, (Focus) focus, (Fiesta) fiesta);
            switch (userInputNr()) {
                case 1:
                    testDrivePassat(passat);
                    break;
                case 2:
                    testDriveGolf(golf);
                    break;
                case 3:
                    testDriveFocus(focus);
                    break;
                case 4:
                    testDriveFiesta(fiesta);
                    break;
                case 5:
                    menuCounter=5;
                    break;
                default:
                    System.out.println("Choice not available! Please choose an available car!");
                    break;
            }
        }
    }

    private static void testDriveFiesta(Cars fiesta) {
        boolean engineOn=false;
        int currentGear=0;
        double fuelConsumption=0;
        double distanceDriven=0;
        double totalDistanceDriven=0;
        double totalFuelConsumption=0;

        fiesta.startEngine(engineOn);
        for ( int gearChanges=0;gearChanges<(((Fiesta)fiesta).GEAR);gearChanges++) {
            currentGear=fiesta.shiftGearUp(currentGear);
            distanceDriven=fiesta.drive(distanceDriven);
            totalDistanceDriven=totalDistanceDriven+distanceDriven;
            totalFuelConsumption=totalFuelConsumption+fiesta.fuelConsumption(currentGear, distanceDriven, fuelConsumption);
        }
        for ( int gearChanges=0;gearChanges<(((Fiesta)fiesta).GEAR-1);gearChanges++) {
            currentGear=fiesta.shiftGearDown(currentGear);
            distanceDriven=fiesta.drive(distanceDriven);
            totalDistanceDriven=totalDistanceDriven+distanceDriven;
            totalFuelConsumption=totalFuelConsumption+fiesta.fuelConsumption(currentGear, distanceDriven, fuelConsumption);
        }
        fiesta.stopEngine(engineOn);
        System.out.println("Total distance driven: "+totalDistanceDriven);
        System.out.println("Medium consumption per cruise: "+fiesta.getConsumptionPerCruise(totalDistanceDriven,totalFuelConsumption));
        System.out.println("Amount of used fuel: "+totalFuelConsumption+" liters");
        System.out.println("Amount of remaining fuel: "+fiesta.getAvailableFuel(totalFuelConsumption)+" liters");
    }

    private static void testDriveFocus(Cars focus) {
        boolean engineOn=false;
        int currentGear=0;
        double fuelConsumption=0;
        double distanceDriven=0;
        double totalDistanceDriven=0;
        double totalFuelConsumption=0;

        focus.startEngine(engineOn);
        for ( int gearChanges=0;gearChanges<(((Focus)focus).GEAR);gearChanges++) {
            currentGear=focus.shiftGearUp(currentGear);
            distanceDriven=focus.drive(distanceDriven);
            totalDistanceDriven=totalDistanceDriven+distanceDriven;
            totalFuelConsumption=totalFuelConsumption+focus.fuelConsumption(currentGear, distanceDriven, fuelConsumption);
        }
        for ( int gearChanges=0;gearChanges<(((Focus)focus).GEAR-1);gearChanges++) {
            currentGear=focus.shiftGearDown(currentGear);
            distanceDriven=focus.drive(distanceDriven);
            totalDistanceDriven=totalDistanceDriven+distanceDriven;
            totalFuelConsumption=totalFuelConsumption+focus.fuelConsumption(currentGear, distanceDriven, fuelConsumption);
        }
        focus.stopEngine(engineOn);
        System.out.println("Total distance driven: "+totalDistanceDriven);
        System.out.println("Medium consumption per cruise: "+focus.getConsumptionPerCruise(totalDistanceDriven,totalFuelConsumption));
        System.out.println("Amount of used fuel: "+totalFuelConsumption+" liters");
        System.out.println("Amount of remaining fuel: "+focus.getAvailableFuel(totalFuelConsumption)+" liters");
    }

    private static void testDriveGolf(Cars golf) {
        boolean engineOn=false;
        int currentGear=0;
        double fuelConsumption=0;
        double distanceDriven=0;
        double totalDistanceDriven=0;
        double totalFuelConsumption=0;

        golf.startEngine(engineOn);
        for ( int gearChanges=0;gearChanges<(((Golf)golf).GEAR);gearChanges++) {
            currentGear=golf.shiftGearUp(currentGear);
            distanceDriven=golf.drive(distanceDriven);
            totalDistanceDriven=totalDistanceDriven+distanceDriven;
            totalFuelConsumption=totalFuelConsumption+golf.fuelConsumption(currentGear, distanceDriven, fuelConsumption);
        }
        for ( int gearChanges=0;gearChanges<(((Golf)golf).GEAR-1);gearChanges++) {
            currentGear=golf.shiftGearDown(currentGear);
            distanceDriven=golf.drive(distanceDriven);
            totalDistanceDriven=totalDistanceDriven+distanceDriven;
            totalFuelConsumption=totalFuelConsumption+golf.fuelConsumption(currentGear, distanceDriven, fuelConsumption);
        }
        golf.stopEngine(engineOn);
        System.out.println("Total distance driven: "+totalDistanceDriven);
        System.out.println("Medium consumption per cruise: "+golf.getConsumptionPerCruise(totalDistanceDriven,totalFuelConsumption));
        System.out.println("Amount of used fuel: "+totalFuelConsumption+" liters");
        System.out.println("Amount of remaining fuel: "+golf.getAvailableFuel(totalFuelConsumption)+" liters");
    }

    private static void testDrivePassat(Cars passat) {
        boolean engineOn=false;
        int currentGear=0;
        double fuelConsumption=0;
        double distanceDriven=0;
        double totalDistanceDriven=0;
        double totalFuelConsumption=0;

        passat.startEngine(engineOn);
        for ( int gearChanges=0;gearChanges<(((Passat)passat).GEAR);gearChanges++) {
            currentGear=passat.shiftGearUp(currentGear);
            distanceDriven=passat.drive(distanceDriven);
            totalDistanceDriven=totalDistanceDriven+distanceDriven;
            totalFuelConsumption=totalFuelConsumption+passat.fuelConsumption(currentGear, distanceDriven, fuelConsumption);
        }
        for ( int gearChanges=0;gearChanges<(((Passat)passat).GEAR-1);gearChanges++) {
            currentGear=passat.shiftGearDown(currentGear);
            distanceDriven=passat.drive(distanceDriven);
            totalDistanceDriven=totalDistanceDriven+distanceDriven;
            totalFuelConsumption=totalFuelConsumption+passat.fuelConsumption(currentGear, distanceDriven, fuelConsumption);
        }
        passat.stopEngine(engineOn);
        System.out.println("Total distance driven: "+totalDistanceDriven);
        System.out.println("Medium consumption per cruise: "+passat.getConsumptionPerCruise(totalDistanceDriven,totalFuelConsumption));
        System.out.println("Amount of used fuel: "+totalFuelConsumption+" liters");
        System.out.println("Amount of remaining fuel: "+passat.getAvailableFuel(totalFuelConsumption)+" liters");
    }

    private static void availableCarsSelection(Passat passat, Golf golf, Focus focus, Fiesta fiesta) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Available cars: ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1) "+ passat.MODEL_NAME+" | "+ passat.FUEL_TYPE+" | Number of gears: "+ passat.GEAR+" | Consumption: "+ passat.CONSUMPTION_PER_100_KM);
        System.out.println("2) "+ golf.MODEL_NAME+" | "+ golf.FUEL_TYPE+" | Number of gears: "+ golf.GEAR+" | Consumption: "+ golf.CONSUMPTION_PER_100_KM);
        System.out.println("3) "+ focus.MODEL_NAME+" | "+ focus.FUEL_TYPE+" | Number of gears: "+ focus.GEAR+" | Consumption: "+ focus.CONSUMPTION_PER_100_KM);
        System.out.println("4) "+ fiesta.MODEL_NAME+" | "+ fiesta.FUEL_TYPE+" | Number of gears: "+ fiesta.GEAR+" | Consumption: "+ fiesta.CONSUMPTION_PER_100_KM);
        System.out.println(" ");
        System.out.println("5) Exit app!");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Choose your car! ");
    }

    public static double userInputDouble() {                                                                                       //Metoda de citire Nr de la tastatura
        Scanner scan = new Scanner(System.in);
        double value = scan.nextDouble();
        return value;
    }

    public static int userInputNr() {                                                                                       //Metoda de citire Nr de la tastatura
        Scanner input = new Scanner(System.in);
        //if (input.nextInt()!=Integer;
        int value = input.nextInt();
        return value;
    }

    public static String userInputString() {                                                                                //Metoda de citire String de la tastatura
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        return value;
    }
}
