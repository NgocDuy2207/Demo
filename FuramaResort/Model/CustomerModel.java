package FuramaResort.Model;

import FuramaResort.util.ContanUtil.TypeCustomer;
import FuramaResort.util.ContanUtil.Gender;


public class CustomerModel extends PersonModel{
    private TypeCustomer typeCustomer;
    private String address;

    public CustomerModel(TypeCustomer typeCustomer, String address) {
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public CustomerModel(String name, String dayOfBirth, Gender gender, int idCard, int numberPhone,
                         String email, TypeCustomer typeCustomer, String address) {
        super(name, dayOfBirth, gender, idCard, numberPhone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.getName()+","+
                this.getDayOfBirth()+","+
                this.getGender()+","+
                this.getIdCard()+","+
                this.getNumberPhone()+","+
                this.getEmail()+","+
                typeCustomer + ","+
                address + '\n'
                ;
    }
}

