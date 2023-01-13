package FuramaResort.Controller;

import FuramaResort.Model.CustomerModel;
import FuramaResort.Service.Impl.CustomerServiceImpl;
import FuramaResort.Service.Impl.EmployeeServiceImpl;
import FuramaResort.util.ContanUtil;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private static Scanner scanner = new Scanner(System.in);
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static void customer() {
        boolean flag = true;
        do {
            System.out.println("Chức năng trong Customer Management " +
                    "\n 1.Display list customers" +
                    "\n 2.Add new customer" +
                    "\n 3.Edit customer" +
                    "\n 4.Return main menu"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println(choose + ". Display list customers");
                     List< CustomerModel> customerModelList = customerService.findAll();
                     for (int i = 0;i < customerModelList.size();i++){
                         System.out.println(customerModelList.get(i));
                     }
                    break;
                case 2:
                    System.out.println(choose + ". Add new customer");
                    System.out.printf("Enter Name: ");
                    String name = scanner.nextLine();
                    // dayOfBirth
                    System.out.printf("Enter dayOBirth: ");
                    String dayOfBirth = scanner.nextLine();
                    // idCard
                    System.out.printf("Enter Card: ");
                    int idCard = Integer.parseInt(scanner.nextLine());
                    System.out.printf("Enter Number: ");
                    int numberPhone = Integer.parseInt(scanner.nextLine());
                    // Email
                    System.out.printf("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.printf("Enter Gender: ");
                    String gender = scanner.nextLine();
                    System.out.printf("Enter TyperCustomer: ");
                    String typeCustomer = scanner.nextLine();
                    System.out.printf("Enter Address");
                    String address = scanner.nextLine();
                    CustomerModel customerModel = new CustomerModel(name, dayOfBirth, ContanUtil.Gender.valueOf(gender),
                            idCard, numberPhone, email, ContanUtil.TypeCustomer.valueOf(typeCustomer),address);
                    customerService.create(customerModel);

                    break;
                case 3:
                    System.out.println(choose + ". Edit customer");

                    System.out.printf("Enter Name Edit: ");
                    String nameEdit = scanner.nextLine();
                    // dayOfBirth
                    System.out.printf("Enter dayOBirth Edit: ");
                    String dayOfBirthEdit = scanner.nextLine();
                    // idCard
                    System.out.printf("Enter Card Edit: ");
                    int idCardEdit = Integer.parseInt(scanner.nextLine());
                    System.out.printf("Enter Number Edit: ");
                    int numberPhoneEdit = Integer.parseInt(scanner.nextLine());
                    // Email
                    System.out.printf("Enter Email Edit: ");
                    String emailEdit = scanner.nextLine();
                    System.out.printf("Enter Gender Edit: ");
                    String genderEdit = scanner.nextLine();
                    System.out.printf("Enter TyperCustomer Edit: ");
                    String typeCustomerEdit = scanner.nextLine();
                    System.out.printf("Enter address Edit: ");
                    String addressEdit = scanner.nextLine();
                    CustomerModel customerModel1 = new CustomerModel(nameEdit, dayOfBirthEdit, ContanUtil.Gender.valueOf(genderEdit),
                            idCardEdit, numberPhoneEdit, emailEdit, ContanUtil.TypeCustomer.valueOf(typeCustomerEdit),addressEdit);
                    customerService.edit(nameEdit, customerModel1);
                    break;
                case 4:
                    System.out.println(choose + ". Return main menu");
                    FuramaController.disPlayMainMenu();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choose);
            }
        } while (flag);
    }
}
