package vehicle.util;

public interface ConstantUtil {
    enum TypeOfCar{
        Tourist,
        Coach
    }
    interface FilePath{
        String Car = "src/vehicle/data/car.csv";
        String Motor = "src/vehicle/data/motor/motor.csv";
        String Truck = "src/vehicle/data/motor/truck.csv";
    }

}
