package vehicle.view;

import vehicle.model.Car;
import vehicle.model.Manufacturer;
import vehicle.model.Motor;
import vehicle.model.Truck;
import vehicle.service.*;
import vehicle.util.ConstantUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static CarService carService = new CarService();
    private static MotorService motorService = new MotorService();
    private static TruckService truckService = new TruckService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add\n2. Display\n3. Delete\n4. Search\n5. Exit");
            int choice = getChoice();

            switch (choice) {
                case 1 -> add();
                case 2 -> display();
                case 3 -> delete();
                case 4 -> search();
                case 5 -> System.exit(0);
            }
        }
    }

    private static void display() {
        System.out.println("1. Truck\n 2. Car\n. 3. Motor");
        int choice = getChoice();
        switch (choice) {
            case 1 -> {
                List<Truck> trucks = truckService.findAll();
                displayTruck(trucks);

            }
            case 2 -> {
                List<Car> cars = carService.findAll();
                displayCar(cars);
            }
            case 3 -> {
                List<Motor> motors = motorService.findAll();
                displayMotor(motors);
            }

        }
    }


    private static void add() {
        System.out.println("1. Truck\n2. Car\n3. Motor");
        int choice = getChoice();
        System.out.printf("Driver plate:");
        String plate = scanner.nextLine();
        System.out.println("---- List Manufacturer---");
        ManufactureService manufactureService = new ManufactureService();
        List<Manufacturer> manufacturerList = manufactureService.findAll();
        for (int i = 0; i < manufacturerList.size();i++){
            System.out.println(manufacturerList.get(i));
        }
        System.out.println("Enter manufacturer name");
        String manufacturerName = scanner.nextLine();
        Manufacturer manufacturer = manufactureService.findByName(manufacturerName);
        System.out.printf("Year Of Manufacturer:");
        int yearOfManufacturer = Integer.parseInt(scanner.nextLine());

        System.out.printf("Owner:");
        String owner = scanner.nextLine();
        switch (choice){
            case 1 -> {
                System.out.printf("Load:");
                Double load = Double.parseDouble(scanner.nextLine());
                Truck truck = new Truck(plate, manufacturer, yearOfManufacturer,owner, load);
                truckService.create(truck);
            }
            case 2 ->{
                System.out.printf("Number of seat:");
                int numberOfSeat = Integer.parseInt(scanner.nextLine());
                System.out.printf("Type of car:");
                String typeOfCar = scanner.nextLine();
                Car car = new Car(plate, manufacturer, yearOfManufacturer,owner, numberOfSeat, ConstantUtil.TypeOfCar.valueOf(typeOfCar));
                carService.create(car);
            }
            case 3->{
                System.out.printf("Wattage:");
                Double wattage = Double.parseDouble(scanner.nextLine());
                Motor motor = new Motor(plate,manufacturer, yearOfManufacturer, owner, wattage);
                motorService.create(motor);

            }
        }
        System.out.println("Created successfully!");
    }


    private static void delete() {
        System.out.println("Enter driver  plate to delete");
        String drivePlate = scanner.nextLine();
        if(truckService.findByDriverPlate(drivePlate)){
            deleteWithConfirm(truckService, drivePlate);
        }else if (carService.findByDriverPlate(drivePlate)){
            deleteWithConfirm(carService, drivePlate);
        }else if (motorService.findByDriverPlate(drivePlate)){
            deleteWithConfirm(motorService, drivePlate);
        }else {
            System.out.println("No exists driver plate");
        }

    }

    private static void search() {
        System.out.printf("Enter driver plate to search:");
        String driverPlate = scanner.nextLine();
        List<Truck> trucks = truckService.search(driverPlate);
        List<Car> cars = carService.search(driverPlate);
        List<Motor> motors = motorService.search(driverPlate);
        if (trucks.size()==0 && cars.size() == 0 && motors.size() ==0){
            System.out.println("No driver plate exists");

        }else {
            trucks.forEach(System.out::println);
            cars.forEach(System.out::println);
            motors.forEach(System.out::println);
        }
    }

    private static int getChoice() {
        System.out.printf("Enter your choice:");
        return Integer.parseInt(scanner.nextLine());
    }
    private static void deleteWithConfirm(VehicleService vehicleService, String driverPlate){
        System.out.println("Are you sure to delete this item:\n1. Yes\n2. No");
        int choice = getChoice();
        if(choice == 1){
            //vehicleService.delete(driverPlate);
            vehicleService.delete(driverPlate);

            System.out.println("Deleted successfully!");
        }
        else {
            main(null);
        }
    }

    private static void displayTruck(List<Truck> trucks) {
        System.out.printf("%-20s %-20s %-30s %-20s %20s %n", "DRIVER PLATE", "MANUFACTURER", "YEAR OF MANUFACTURER", "OWNER", "LOAD");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        for (Truck t : trucks) {
            System.out.printf("%-20s %-20s %-30s %-20s %20s %n", t.getDriverPlate(), t.getManufacturer().getName(), t.getYearOfManufacturer(), t.getOwner(), t.getLoad());
        }
    }

    private static void displayMotor(List<Motor> motors) {
        System.out.printf("%-20s %-20s %-30s %-20s %20s %n", "DRIVER PLATE", "MANUFACTURER", "YEAR OF MANUFACTURER", "OWNER", "WATTAGE");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        for (Motor t : motors) {
            System.out.printf("%-20s %-20s %-30s %-20s %20s %n", t.getDriverPlate(), t.getManufacturer().getName(), t.getYearOfManufacturer(), t.getOwner(), t.getWattage());
        }
    }

    private static void displayCar(List<Car> cars) {
        System.out.printf("%-20s %-20s %-30s %-20s %25s %25s %n", "DRIVER PLATE", "MANUFACTURER", "YEAR OF MANUFACTURER", "OWNER", "NUMBER OF SEAT", "TYPE OF CAR");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        for (Car t : cars) {
            System.out.printf("%-20s %-20s %-30s %-20s %25s %25s %n", t.getDriverPlate(), t.getManufacturer().getName(), t.getYearOfManufacturer(), t.getOwner(), t.getNumberOfSeat(), t.getTypeOfCar().name());
        }

    }
}
