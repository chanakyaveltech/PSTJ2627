public class DesignParkingSystem {
    int big, medium, small;
    
    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--; return true;
        }
        if (carType == 2 && medium > 0) {
            medium--; return true;
        }
        if (carType == 3 && small > 0) {
            small--; return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DesignParkingSystem parkingSystem = new DesignParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); // return true
        System.out.println(parkingSystem.addCar(2)); // return true
        System.out.println(parkingSystem.addCar(3)); // return false
        System.out.println(parkingSystem.addCar(1)); // return false
    }
}