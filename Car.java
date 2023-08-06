public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, int numberOfDoors) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Doors: " + numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Additional RM35 per day for cars with more than two doors
        return super.calculateRentalCost(days) + (numberOfDoors > 2 ? 35 * days : 0);
    }
}
