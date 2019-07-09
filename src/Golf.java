public class Golf extends Volkswagen {
    static final int FUEL_TANK_SIZE=60;
    static final String FUEL_TYPE="Petrol";
    static final int GEAR=5;
    static final double CONSUMPTION_PER_100_KM=4.5;
    static final String MODEL_NAME="VW Golf";
    String chassisNumber;
    double consumptionPerCruise;
    double availableFuel;
    int tyreSize;

    public Golf(double availableFuel, int tyreSize, String chassisNumber){
        this.availableFuel=availableFuel;
        this.consumptionPerCruise=consumptionPerCruise;
        this.tyreSize=tyreSize;
        this.chassisNumber=chassisNumber;
    }

    @Override
    public double fuelConsumption(int currentGear, double distanceDriven, double fuelConsumption) {
        fuelConsumption=distanceDriven*CONSUMPTION_PER_100_KM/100;
        return fuelConsumption;
    }

    @Override
    public double getConsumptionPerCruise(double totalDistanceDriven, double totalFuelConsumption) {
        consumptionPerCruise=totalFuelConsumption/totalDistanceDriven;
        return consumptionPerCruise;
    }

    @Override
    public double getAvailableFuel(double totalFuelConsumption) {
        availableFuel=FUEL_TANK_SIZE-totalFuelConsumption;
        return availableFuel;
    }
}

