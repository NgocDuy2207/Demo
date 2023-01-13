package FuramaResort.Service.Impl;
import FuramaResort.Model.EmployeeModel;
import FuramaResort.Service.Employee;
import FuramaResort.util.WriteAndRead;
import FuramaResort.util.ContanUtil.pathFile;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements Employee {
    private List<EmployeeModel> employeeModelList = new ArrayList<>();
    @Override
    public void edit(String name, EmployeeModel employeeModel) {
        boolean  check = false;
            for (int i = 0; i < employeeModelList.size(); i++){
                if (employeeModelList.get(i).getName().equals(name)){
                    employeeModelList.set(i, employeeModel);
                    break;
                }else {
                    check = false;
                }
            }
            if (check){
                System.out.println("not find name");
            }
    }

    @Override
    public List<EmployeeModel> findAll() {
        employeeModelList = WriteAndRead.readEmployee(pathFile.Employee);
        return employeeModelList;
    }

    @Override
    public void create(Object o) {
        employeeModelList.add((EmployeeModel) o);
        WriteAndRead.writeEmployee(pathFile.Employee, employeeModelList, true);
    }
    public boolean findByName(String name , EmployeeModel employeeModel){
       boolean isCheck = false;
       return true;
    }
}


