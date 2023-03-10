import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtilDifference {
    public static void main(String[] args) {

        String pattern = "dd/MM/yyyy HH:mm";
        String dateStr1 = "01/01/2017 9:00";
        String dateStr2 = "01/03/2017 13:00";

        Date dt1=null,dt2=null;

        try {
            DateFormat df = new SimpleDateFormat(pattern);
            dt1 = df.parse(dateStr1);
            dt2 = df.parse(dateStr2);
        } catch (ParseException e) {
            e.printStackTrace();
        }




        long duration  = dt2.getTime() - dt1.getTime();

        long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
        long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
        long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
        long diffInDays = TimeUnit.MILLISECONDS.toDays(duration);

        System.out.println(diffInSeconds);
        System.out.println(diffInMinutes);
        System.out.println(diffInHours);
        System.out.println(diffInDays);



    }
}
