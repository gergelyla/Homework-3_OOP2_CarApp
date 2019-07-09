public abstract class Cars implements Vehicles{

    @Override
    public boolean startEngine(boolean engineOn) {
        System.out.print("Starting engine...");
        if (engineOn==false) {
            engineOn = true;
            System.out.print("The engine has started!");
        } else {
            System.out.print("The engine is already on!");
        }
        return engineOn;
    }

    @Override
    public double drive(double distanceDriven) {
        System.out.print("Distance driven: ");
        distanceDriven=Main.userInputDouble();
        return distanceDriven;
    }

    public double fuelConsumption(int currentGear, double distanceDriven, double fuelConsumption) {
        return fuelConsumption;
    }

    public double getConsumptionPerCruise(double totalDistanceDriven, double totalFuelConsumption) {
        double consumptionPerCruise=0;
        return consumptionPerCruise;
    }

    public double getAvailableFuel(double totalFuelConsumption) {
        double availableFuel=0;
        return availableFuel;
    }

    @Override
    public boolean stopEngine(boolean engineOn) {
        if (engineOn = true) {
            engineOn = false;
            System.out.print("The engine has stopped!");
        } else {
            System.out.print("The engine is already stopped!");
        }
        return engineOn;
    }

    public int shiftGearUp(int currentGear){
        System.out.print("Changing gears...");
        currentGear++;
        System.out.println("You are now in gear "+currentGear);
        return currentGear;
    }

    public int shiftGearDown(int currentGear){
        System.out.print("Changing gears...");
        if (currentGear>0){
            currentGear--;
        }
        System.out.println("You are now in gear "+currentGear);
        return currentGear;
    }
}
