package FuramaResort.Service.Impl;
import FuramaResort.Model.CustomerModel;
import FuramaResort.Service.Customer;
import FuramaResort.util.ContanUtil.pathFile;
import FuramaResort.util.WriteAndRead;
import java.util.LinkedList;
import java.util.List;
public class CustomerServiceImpl implements Customer {
    private List<CustomerModel> customerModelList = new LinkedList<>();

    @Override
    public void edit(String name, CustomerModel customerModel) {
        boolean  check = false;
        for (int i = 0; i < customerModelList.size(); i++){
            if (customerModelList.get(i).getName().equals(name)){
                customerModelList.set(i, customerModel);
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
    public List findAll() {
        return customerModelList;
    }

    @Override
    public void create(Object o) {
        customerModelList.add((CustomerModel) o);
        WriteAndRead.writeCustomer(pathFile.Customer, customerModelList, true);
    }
}
