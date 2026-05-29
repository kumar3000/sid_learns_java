import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        Instant instant = Instant.now(); // in UTC
        System.out.println(instant); // in UTC

        // Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // Custom dateTime
        LocalDate christmas = LocalDate.of(2024, 12, 25);
        LocalDateTime customDateTime = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        System.out.println(christmas);
        System.out.println(customDateTime);
    }
}
