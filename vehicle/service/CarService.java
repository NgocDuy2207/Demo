package vehicle.service;

import vehicle.model.Car;
import vehicle.util.ConstantUtil;
import vehicle.util.FileHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService implements VehicleService {
    private List<Car> carList = new ArrayList<>();
    private FileHelper fileHelper = new FileHelper();
    private ManufactureService manufactureService = new ManufactureService();

    @Override
    public List<Car> findAll() {
        return carList;
    }

    @Override
    public void create(Object o) {
        carList.add((Car) o);
        fileHelper.write(ConstantUtil.FilePath.Car, carList, false);
    }

    @Override
    public boolean findByDriverPlate(String driverPlate) {
        for (int i = 0; i < carList.size();i++){
            return carList.get(i).getDriverPlate().equals(driverPlate);
        }
       return false;
    }

    @Override
    public void delete(String driverPlate) {
        for (int i = 0; i < carList.size();i++){
            if (carList.get(i).getDriverPlate().equals(driverPlate)){
                carList.remove(i);
                break;
            }
        }
        fileHelper.write(ConstantUtil.FilePath.Car, carList, false);
    }
    @Override
    public List search(String driverPlate) {
        return carList.stream().filter(e -> e.getDriverPlate().contains(driverPlate)).collect(Collectors.toList());
    }
}
