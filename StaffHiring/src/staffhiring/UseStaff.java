package staffhiring;

import java.util.Scanner;

public class UseStaff {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get staff number
        System.out.print("Enter the current staff number: ");
        int staffNumber = input.nextInt();
        input.nextLine();

        // Get staff location
        System.out.print("Enter the staff hiring location: ");
        String staffLocation = input.nextLine();

        // Create StaffHiring object
        StaffHiring staff = new StaffHiring(staffNumber, staffLocation);

        // Display the report
        staff.printStaffHiring();
    }
}