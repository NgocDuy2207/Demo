package FuramaResort.Service;

import FuramaResort.Model.CustomerModel;

public interface Customer extends ServiceInterface{
    void edit(String name, CustomerModel customerModel);

}
