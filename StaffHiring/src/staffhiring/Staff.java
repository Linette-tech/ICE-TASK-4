package staffhiring;

// Abstract Staff class implements the iStaff interface
public abstract class Staff implements iStaff {

    private int staffNumber;
    private String staffLocation;

    // Constructor
    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    // Get the staff number
    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    // Get the staff location
    @Override
    public String getStaffLocation() {
        return staffLocation;
    }

    // Determine whether more staff should be hired
    @Override
    public String getStaffHiringProcess() {

        if (staffNumber < 20) {
            return "YES";
        } else {
            return "NO";
        }
    }
}