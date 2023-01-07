package vehicle.service;

import vehicle.model.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TruckService implements VehicleService{
    private List<Truck> truckList = new ArrayList<>();
    private ManufactureService manufactureService = new ManufactureService();
    @Override
    public List<Truck> findAll() {
        return truckList;
    }

    @Override
    public void create(Object o) {
        truckList.add((Truck) o);

    }

    @Override
    public boolean findByDriverPlate(String driverPlate) {
        for (int i = 0; i < truckList.size();i++){
            return truckList.get(i).getDriverPlate().equals(driverPlate);
        }
        return false;
    }

    @Override
    public void delete(String driverPlate) {
        for (int i = 0; i < truckList.size();i++){
            if (truckList.get(i).getDriverPlate().equals(driverPlate)){
                truckList.remove(i);
                break;
            }
        }

    }

    @Override
    public List search(String driverPlate) {
        return truckList.stream().filter(e -> e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
    }
}
