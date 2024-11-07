import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Footer {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define a date format (e.g., "dd-MM-yyyy" or "MMMM dd, yyyy")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");

        // Format the current date
        String formattedDate = currentDate.format(formatter);

        // Display the dynamic footer
        System.out.println("Footer: Today's Date is " + formattedDate);
    }
}
