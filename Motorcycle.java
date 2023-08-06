public class Motorcycle extends Vehicle{
    private double engineCapacity;

    public Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, double engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double calculateTopSpeed() {
        return engineCapacity * 50;
    }

    @Override
    public String toString() {
        return super.toString() + ", Engine Capacity: " + engineCapacity + " cc";
    }

    @Override
    public double calculateRentalCost(int days) {
        // Additional RM150 for motorcycles with top speed of at least 300 km/h
        return super.calculateRentalCost(days) + (calculateTopSpeed() >= 300 ? 150 : 0);
    }
}
