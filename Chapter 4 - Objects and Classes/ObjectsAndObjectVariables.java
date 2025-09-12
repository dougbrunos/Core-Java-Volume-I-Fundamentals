import java.time.LocalDate;
import java.util.Date;

public class ObjectsAndObjectVariables {

    public static void main(String[] args) {
        System.out.println(new Date().toString());

        // Date startTime; // startTime doesn't refer to any object

        // Date endTime = new Date();

        // Uses LocalDate to express days in the familiar calendar
        System.out.println(LocalDate.now());
        LocalDate newYearsEve = LocalDate.of(1999, 12, 31);
        System.out.println(newYearsEve);
        System.out.println(newYearsEve.getYear());
        System.out.println(newYearsEve.getMonthValue());
        System.out.println(newYearsEve.getDayOfMonth());

        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        System.out.println(aThousandDaysLater);
    }

}
