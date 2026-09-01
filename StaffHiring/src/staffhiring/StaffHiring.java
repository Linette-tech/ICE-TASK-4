package staffhiring;

// StaffHiring inherits from the Staff class
public class StaffHiring extends Staff {

    // Constructor
    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);
    }

    // Print the staff hiring report
    public void printStaffHiring() {

        System.out.println();
        System.out.println("STAFF HIRING REPORT");
        System.out.println("*******************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());
    }
}