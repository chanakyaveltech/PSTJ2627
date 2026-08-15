import java.util.*;

class Trip {
    double fare(double distance) {
        return 0;
    }
}

class Bike extends Trip {
    double fare(double distance) {
        return distance * 5;
    }
}

class Auto extends Trip {
    double fare(double distance) {
        return distance * 12;
    }
}

class Cab extends Trip {
    double fare(double distance) {
        return distance * 12;
    }
}

public class RideSharingPlatformSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();

            try {
                if (distance <= 0)
                    throw new Exception("Invalid Booking");

                Trip trip;

                if (type.equals("Bike"))
                    trip = new Bike();
                else if (type.equals("Auto"))
                    trip = new Auto();
                else if (type.equals("Cab"))
                    trip = new Cab();
                else
                    throw new Exception("Invalid Booking");

                System.out.println((int) trip.fare(distance));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}