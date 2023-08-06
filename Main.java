public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("JWF1001", "Toyota", "Camry", 120, 4);
        vehicles[1] = new Car("JWF2002", "Honda", "Civic", 100, 2);
        vehicles[2] = new Motorcycle("JVC1616", "Yamaha", "YZF-R1", 80, 1000);
        vehicles[3] = new Motorcycle("JVC3399", "Harley-Davidson", "Heritage Classic", 150, 1900);


        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            int rentalDays = 7;
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: RM" + rentalCost);
            if (vehicle instanceof Motorcycle) {
                double topSpeed = ((Motorcycle) vehicle).calculateTopSpeed();
                System.out.println("Top Speed: " + topSpeed + " km/h");
            }
            System.out.println();
        }
    }
}