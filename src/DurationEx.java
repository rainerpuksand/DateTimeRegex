import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DurationEx {

        public static void main(String[] args) {


            LocalDateTime oldYrDate = LocalDateTime.of(2021, Month.NOVEMBER, 30, 9, 00);
            LocalDateTime newYrDate = LocalDateTime.of(2022, Month.JANUARY, 31, 10,00);

            System.out.println(oldYrDate);
            System.out.println(newYrDate);

            //count seconds between dates
            Duration duration = Duration.between(oldYrDate, newYrDate);

            System.out.println(duration.getSeconds() + " seconds");
            System.out.println(duration.toHours() + " hours");
            System.out.println(duration.toDays() + " days");


    }
}
//https://docs.oracle.com/javase/tutorial/datetime/iso/period.html