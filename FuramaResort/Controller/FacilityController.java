package FuramaResort.Controller;

import FuramaResort.Service.Impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

    public static void facility() {
        System.out.println("Chức năng trong Facility Management " +
                "\n 1.Display list Facility" +
                "\n 2.Add new facility" +
                "\n 3.Display list facility maintenance" +
                "\n 4.Return main menu"
        );
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println(choose + ". Display list Facility");
                break;
            case 2:
                System.out.println(choose + ". Add new facility");
                break;
            case 3:
                System.out.println(choose + ". Display list facility maintenance");
                break;
            case 4:
                System.out.println(choose + ". Return main menu");
                break;
            default:
                System.out.println();
        }

    }
}
