package homemakeover;

public class HomeMakeoverReport {

    public static void main(String[] args) {

        // Single array for the months
        String[] months = {
            "JAN", "FEB", "MAR", "APR", "MAY", "JUN"
        };

        // Two-dimensional array for makeover jobs
        int[][] makeovers = {
            {8, 2, 5},
            {7, 4, 5},
            {5, 5, 2},
            {2, 2, 3},
            {7, 7, 9},
            {7, 8, 5}
        };

        System.out.println("-------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("-------------------------------------------");

        System.out.println("        Bathrooms   Kitchens   Garden");

        // Display makeover jobs
        for (int i = 0; i < makeovers.length; i++) {

            System.out.print(months[i] + "     ");

            for (int j = 0; j < makeovers[i].length; j++) {
                System.out.print(makeovers[i][j] + "           ");
            }

            System.out.println();
        }

        System.out.println("-------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("-------------------------------------------");

        // Calculate and display monthly totals
        for (int i = 0; i < makeovers.length; i++) {

            int total = 0;

            for (int j = 0; j < makeovers[i].length; j++) {
                total = total + makeovers[i][j];
            }

            System.out.print(months[i] + "     " + total);

            // Display stars if total is 15 or more
            if (total >= 15) {
                System.out.print("     ***");
            }

            System.out.println();
        }
    }
}