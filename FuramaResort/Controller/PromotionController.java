package FuramaResort.Controller;

import FuramaResort.Service.Impl.EmployeeServiceImpl;

import java.util.Scanner;

public class PromotionController {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

    public static int promotion() {
        System.out.println("Chức năng trong Booking Management " +
                "\n 1. Display list customers use service" +
                "\n 2. Display list customers get voucher" +
                "\n 3.Return main menu"
        );
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return choose;
    }
}

