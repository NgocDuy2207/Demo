package FuramaResort.Controller;
import java.util.Scanner;
public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    public static void disPlayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("Lựa chọn chức năng trên Menu: " +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3.Facility Management " +
                    "\n 4.Booking Management" +
                    "\n 5.Promotion Management" +
                    "\n 6.Exit"
            );
            System.out.println("Chọn chức năng : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println(choose + " Employee Management ");
                    EmployeeController.employee();
                    break;
                case 2:
                    System.out.println(choose + " Customer Management");
                    CustomerController.customer();
                    break;
                case 3:
                    System.out.println(choose + " Facility Management");
                    FacilityController.facility();
                    break;
                case 4:
                    System.out.println(choose + " Booking Management");
                    BookingController.booking();
                    break;
                case 5:
                    System.out.println(choose + " Promotion Management");
                    PromotionController.promotion();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public static void main(String[] args) {
        FuramaController.disPlayMainMenu();
    }
}



