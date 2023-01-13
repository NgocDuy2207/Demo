package FuramaResort.Controller;
import FuramaResort.Model.EmployeeModel;
import FuramaResort.Service.Impl.EmployeeServiceImpl;
import FuramaResort.util.ContanUtil;

import java.util.List;
import java.util.Scanner;

   public class EmployeeController {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public static void employee() {
        boolean flag = true;
        do {
            System.out.println("Chức năng trong Employee Management: " +
                    "\n 1. Display list employees" +
                    "\n 2. Add new employee" +
                    "\n 3. Edit employee" +
                    "\n 4. Return main menu"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println(choose + ". Display list employees");
                    List<EmployeeModel> employeeModelList = employeeService.findAll();
                    for (int i = 0; i < employeeModelList.size();i++){
                        System.out.print(employeeModelList.get(i));
                    }
                    break;
                case 2:
                    System.out.printf(choose + ". Add new employee");
                    // Name
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

//                    String position = "";
//                    boolean anyMatch = false;
//                    do{
//                        position = scanner.nextLine();
//                        final String tmp = position;
//
//                        anyMatch = Arrays.stream(Enum.PositionID.values()).anyMatch(e-> e.name().equalsIgnoreCase(tmp));
//                    }while (!anyMatch);
//
//                    employeeModel.setPositionID(Enum.PositionID.valueOf(position));
                    // Number

                    // Salary
                    System.out.printf("Enter Salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.printf("Enter Degree" );
                    String degree = scanner.nextLine();
                    System.out.printf("Enter positionID: ");
                    String positionID = scanner.nextLine();
                    EmployeeModel employeeModel = new EmployeeModel(name, dayOfBirth, ContanUtil.Gender.valueOf(gender),
                            idCard, numberPhone, email, ContanUtil.Degree.valueOf(degree),
                            ContanUtil.PositionID.valueOf(positionID), salary );
                    employeeService.create(employeeModel);
                    break;
                case 3:
                    System.out.printf(choose + ". Edit employee");
                    // name
                    System.out.printf("Enter Name can Edit: ");
                    String nameEdit = scanner.nextLine();

                    // DayofBirth
                    System.out.printf("DayOfBirth can Edit: ");
                    String dayOfBirthEdit = scanner.nextLine();
                    //Salary
                    System.out.printf("Salary can Edit: ");
                    double salaryEdit = Double.parseDouble(scanner.nextLine());
                    //NumberPhone
                    System.out.printf("Enter Number can Edit: ");
                    int numberPhoneEdit = Integer.parseInt(scanner.nextLine());
                    //email
                    System.out.printf("Enter Email can Edit: ");
                    String emailEdit = scanner.nextLine();
                    // idCard
                    System.out.printf("Enter IdCard can Edit: ");
                    int idCardEdit = Integer.parseInt(scanner.nextLine());
                    //Gender
                    System.out.printf("Gender can Edit: ");
                    String genderEdit = scanner.nextLine();
                    //Degree
                    System.out.printf("Degree can Edit: ");
                    String degreeEdit = scanner.nextLine();
                    //PositionID
                    System.out.printf("PositionID can Edit: ");
                    String positionIDEdit = scanner.nextLine();
                    EmployeeModel employeeModel1 = new EmployeeModel(nameEdit, dayOfBirthEdit, ContanUtil.Gender.valueOf(genderEdit),
                            idCardEdit, numberPhoneEdit, emailEdit,ContanUtil.Degree.valueOf(degreeEdit),
                            ContanUtil.PositionID.valueOf(positionIDEdit), salaryEdit);
                    employeeService.edit(nameEdit, employeeModel1);
                    break;
                case 4:
                    System.out.printf(choose + ". Return Main Menu");
                    FuramaController.disPlayMainMenu();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choose);
            }
        } while (flag);
    }
    public static void add(){

    }


}
