import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateClass {
    public static void main(String[] args) { //<- psvm
        Date date  = new Date();

        DateFormat dateFormat = new SimpleDateFormat(" dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("current date :"+currentDate);

    }
}
