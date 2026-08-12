import java.util.Scanner;
class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}
abstract class Vehicle {
    private String type;
    private double ratePerKm;

    public Vehicle(String type, double ratePerKm) {
        this.type = type;
        this.ratePerKm = ratePerKm;
    }
    public String getType() {
        return type;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public abstract double calculateFare(double distance);
}
class Bike extends Vehicle {
    public Bike() {
        super("Bike", 5.0); 
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}
class Cab extends Vehicle {
    public Cab() {
        super("Cab", 12.0); 
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}
class Auto extends Vehicle {
    public Auto() {
        super("Auto", 12.0);
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}
class VehicleFactory {
    public static Vehicle getVehicle(String type) throws InvalidBookingException {
        if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        } else if (type.equalsIgnoreCase("Cab")) {
            return new Cab();
        } else if (type.equalsIgnoreCase("Auto")) {
            return new Auto();
        } else {
            throw new InvalidBookingException("Invalid vehicle type: " + type);
        }
    }
}
class Trip {
    private Vehicle vehicle;
    private double distance;
    public Trip(Vehicle vehicle, double distance) throws InvalidBookingException {
        if (distance < 0) {
            throw new InvalidBookingException("Distance cannot be negative.");
        }
        this.vehicle = vehicle;
        this.distance = distance;
    }
    public double computeTripFare() {
        return vehicle.calculateFare(distance);
    }
}
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String vehicleType = scanner.next();
            double distance = scanner.nextDouble();
            try {
                Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
                Trip trip = new Trip(vehicle, distance);
                double fare = trip.computeTripFare();
                if (fare == (long) fare) {
                    System.out.println((long) fare);
                } else {
                    System.out.println(fare);
                }
            } catch (InvalidBookingException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
