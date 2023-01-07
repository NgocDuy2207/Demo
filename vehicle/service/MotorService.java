package vehicle.service;

import vehicle.model.Motor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MotorService implements VehicleService{
    private List<Motor> motorList = new ArrayList<>();
    private ManufactureService manufactureService = new ManufactureService();

    @Override
    public List<Motor> findAll() {
        return motorList;
    }

    @Override
    public void create(Object o) {
        motorList.add((Motor) motorList);
    }

    @Override
    public boolean findByDriverPlate(String driverPlate) {
        for (int i = 0; i < motorList.size();i++){
            return motorList.get(i).getDriverPlate().equals(driverPlate);
        }
        return false;
    }

    @Override
    public void delete(String driverPlate) {
        for (int i = 0; i < motorList.size();i++){
            if (motorList.get(i).getDriverPlate().equals(driverPlate)){
                motorList.remove(i);
                break;
            }
        }
    }

    @Override
    public List search(String driverPlate) {
         return motorList.stream().filter(e -> e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
    }
}
